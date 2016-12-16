package com.sample.springmvc.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "APP_USER")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "sso_id", unique = true, nullable = false)
	@NotEmpty
	private String sso_id;
	@Column(name = "password", nullable = false)
	@NotEmpty
	private String password;

	@Column(name = "first_name", nullable = false)
	@NotEmpty
	private String first_name;

	@Column(name = "last_name", nullable = false)
	@NotEmpty
	private String last_name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSso_id() {
		return sso_id;
	}

	public void setSso_id(String sso_id) {
		this.sso_id = sso_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<UserProfile> getUserprofiles() {
		return Userprofiles;
	}

	public void setUserprofiles(Set<UserProfile> userprofiles) {
		Userprofiles = userprofiles;
	}

	@Column(name = "email", nullable = false)
	@NotEmpty
	private String email;

	@NotEmpty
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "APP_USER_USER_PROFILE", joinColumns = { @JoinColumn(name = "USER_ID")}, inverseJoinColumns = {
			@JoinColumn(name = "USER_PROFILE_ID") })
	private Set<UserProfile> Userprofiles = new HashSet<UserProfile>();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((sso_id == null) ? 0 : sso_id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof User))
			return false;
		User other = (User) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (sso_id == null) {
			if (other.sso_id != null)
				return false;
		} else if (!sso_id.equals(other.sso_id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", ssoId=" + sso_id + ", password=" + password + ", firstName=" + first_name
				+ ", lastName=" + last_name + ", email=" + email + "]";
	}

}
