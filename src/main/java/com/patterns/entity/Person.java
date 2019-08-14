package main.java.com.patterns.entity;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Person {

	private int id;
	private String name;
	private String lastName;
	private String gender;
	private Date birthDay;
	private String address;
	
	public Person() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	

	public static Person GetByID(int id2) {
		// TODO Auto-generated method stub
		return null;
	}
}
