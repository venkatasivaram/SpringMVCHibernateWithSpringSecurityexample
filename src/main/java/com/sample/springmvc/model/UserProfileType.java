package com.sample.springmvc.model;

public enum UserProfileType {
	
	USER("USER"),
	DBA("DBA"),
	ADMIN("ADMIN");
	
	String userProfileType;
	
	public String getUserProfileType() {
		return userProfileType;
	}

	private UserProfileType(String userProfileType)
	{
		this.userProfileType=userProfileType;
	}
	
	

}
