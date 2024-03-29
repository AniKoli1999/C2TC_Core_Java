package com.cg.smms.entities;

import java.time.LocalDate;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="employee")
public class Employee implements Serializable
{
	private static final long serialVersionUID = 1L;
@Id
@Column(name="id")
private int id;
@Column(name="name")
private String name;
@Column(name="dob")
private LocalDate dob;
@Column(name="salary")
private float salary;
@Column(name="address")
private String address;
@Column(name="designation")
private String designation;

//Mapping
@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name="shopId")
private Shop shop;

//GETTER & SETTER

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
public LocalDate getDob() {
	return dob;
}
public void setDob(LocalDate dob) {
	this.dob = dob;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public Shop getShop() {
	return shop;
}
public void setShop(Shop shop) {
	this.shop = shop;
}

}