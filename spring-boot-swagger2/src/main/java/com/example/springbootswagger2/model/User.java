package com.example.springbootswagger2.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.data.annotation.Immutable;

@Entity
@Immutable
public class User {

	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String address;
	private String email;
	private String phonNum;
	private String password;
	private String rememberToken;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhonNum() {
		return phonNum;
	}

	public void setPhonNum(String phonNum) {
		this.phonNum = phonNum;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRememberToken() {
		return rememberToken;
	}

	public void setRememberToken(String rememberToken) {
		this.rememberToken = rememberToken;
	}

}
