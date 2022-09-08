package com.feedback;

public class User {
	private int id;
	private String name;
	private String username;
	private String email;
	private String phone;
	private String type;
	private String password;
	
	public User( int id,String name, String username, String email, String phone, String type, String password) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.email = email;
		this.phone = phone;
		this.type = type;
		this.password = password;
	}

	public User() {
		
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getUsername() {
		return username;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public String getType() {
		return type;
	}

	public String getPassword() {
		return password;
	}
	
	
	
	
}
