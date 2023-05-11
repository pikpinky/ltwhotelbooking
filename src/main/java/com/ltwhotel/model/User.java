package com.ltwhotel.model;

public class User {
	private int id;
	private String username;
	private String password;
	private String cizID;
	private String fullname;
	private String birthday;
	private String address;
	private String phone;
	private String email;
	
	public User(){
	}
	
	public User(int id, String username, String password, String cizID, String fullname, String birthday, String phone, String email, String address) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.cizID = cizID;
		this.fullname = fullname;
		this.birthday = birthday;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
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
	
	public String getCizID() {
		return cizID;
	}

	public void setCizID(String cizID) {
		this.cizID = cizID;
	}
	
	public String getFullname() {
		return fullname;
	}

	public void setgetFullname(String fullname) {
		this.fullname = fullname;
	}
	
	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}