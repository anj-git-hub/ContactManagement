package com.spring.ContactManagement;

//@Entity
public class Contact {
	
	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	//@Column(nullable = false)
	private String name;
	//@Column
	private String address;
	//@Column(nullable = false, unique = true)
	private String phoneNumber;
	//@Column
	private String email;
	
	public Contact() {
		
	}
	public Contact(String name,String address, String phoneNumber, String email)
	{
		this.name=name;
		this.address=address;
		this.phoneNumber=phoneNumber;
		this.email=email;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber=phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
}
	
	


