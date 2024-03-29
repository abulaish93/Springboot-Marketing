package com.marketingapp1.entity;

import javax.persistence.*;

@Entity
@Table(name="leads")
public class Lead {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name",length=45,nullable=false)
	private String firstName;
	
	@Column(name = "last_name",length=45,nullable=false)
	private String lastName;
	
	@Column(name = "email",length=128,unique=true)
	private String email;
	
	@Column(name = "mobile",length=10,nullable=false)
	private long mobile;
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public void setLastName(String lastname) {
		this.lastName = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	
	

}
