package com.sample.springmvc.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sample.springmvc.model.User;

@Repository("employeeDao")
public class UserDaoImpl implements UserDao {

	@Autowired
	SessionFactory sessionFactory;

	public User findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public User findBySSO(String sso) {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(User user) {
		// TODO Auto-generated method stub

	}

	public void deleteBySSO(String sso) {
		// TODO Auto-generated method stub

	}

	public List<User> findAllUsers() {
		// TODO Auto-generated method stub

		sessionFactory.getCurrentSession().createCriteria(UserDao.class);
		return null;
	}

}
