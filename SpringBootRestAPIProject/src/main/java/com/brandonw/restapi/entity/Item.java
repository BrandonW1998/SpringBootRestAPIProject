package com.brandonw.restapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "item")
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idNo;
	@Column(name = "item_name")
	private String name;
	@Column(name = "item_price")
	private int price;
	@Column(name = "item_department")
	private String dept;
	
	// Empty Constructor
	public Item() {}
	
	// Item Constructor
	public Item(String name, int price, String dept) {
		super();
		this.name = name;
		this.price = price;
		this.dept = dept;
	}
	
	// GETTER / SETTER METHODS
	public int getIdNo() {
		return idNo;
	}
	public void setIdNo(int idNo) {
		this.idNo = idNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDepartment() {
		return dept;
	}
	public void setDepartment(String department) {
		this.dept = department;
	}
	
	// Data in String format
	@Override
	public String toString() {
		return "Item [idNo=" + idNo + ", name=" + name + ", price=" + price + ", dept=" + dept + "]";
	}
	
	
}
