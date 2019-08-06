package com.ing.ecommerce.dto;

import java.io.Serializable;

public class UserDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long userId;

	private String userName;

	private String password;

	private String role;

	private Long mobile;

	private String email;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	public UserDTO() {
		super();
	
	}

	public UserDTO(long userId, String userName, String password, String role, Long mobile, String email) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.role = role;
		this.mobile = mobile;
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserRequestDTO [userId=" + userId + ", userName=" + userName + ", password=" + password + ", role="
				+ role + ", mobile=" + mobile + ", email=" + email + "]";
	}
	
	

	
}
