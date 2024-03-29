package com.cg.smms.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name="item")

public class Item implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
@Id
@Column(name="id")
private int id;
@Column(name="itemName")
private String itemName;
@Column(name="price")
private double price;
@Column(name="manufacturingDate")
private LocalDate manufacturingDate;
@Column(name="expiry")
private LocalDate expiry;
@Column(name="category")
private String category;
	
//Mapping
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="shopId")
	private Shop shopID;
	
	//GETTER & SETTER
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public LocalDate getManufacturingDate() {
		return manufacturingDate;
	}
	public void setManufacturingDate(LocalDate manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}
	public LocalDate getExpiry() {
		return expiry;
	}
	public void setExpiry(LocalDate expiry) {
		this.expiry = expiry;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Shop getShopID() {
		return shopID;
	}
	public void setShopID(Shop shopID) {
		this.shopID = shopID;
	}
	
}
