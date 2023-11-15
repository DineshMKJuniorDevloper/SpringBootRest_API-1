package com.example.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	
	
	@Id
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="User_id")
	private int id;
	
	@Column(name="User_Name")
	private String name;
	
	@Column(name="E-mail")
	private String email;
	
	@Column(name="Father_Name")
	private String fatherName;
	
	@Column(name="Mother_Name")
	private String motherName;
	
	@Column(name="Address")
	private String address;
	
	@Column(name="Pincode")
	private Integer pincode;
	
	
	
	
	
	

	public User() {
		
		
	}





	public User(String name, String email, String fatherName, String motherName, String address, Integer pincode) {
		
		this.name = name;
		this.email = email;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.address = address;
		this.pincode = pincode;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	
	
	
	
	

}
