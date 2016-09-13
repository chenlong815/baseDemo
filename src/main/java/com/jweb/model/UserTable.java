package com.jweb.model;

public class UserTable {
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserTable(String username) {
		this.username = username;
	}

	public UserTable() {
		this.username = "";
	}

}
