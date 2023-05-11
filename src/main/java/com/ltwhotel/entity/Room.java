package com.ltwhotel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "room")
public class Room {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idroom;
	
	@Column
	private String nameroom;
	
	@Column
	private float price;
	
	@Column
	private int total;
	
	@Column
	private int inused;

	public Room() {
	}
	
	public Room(int idroom, String nameroom, float price, int total, int inused) {
		this.idroom = idroom;
		this.nameroom = nameroom;
		this.price = price;
		this.total = total;
		this.inused = inused;
	}
	
	public int getIdroom() {
		return idroom;
	}

	public void setIdroom(int idroom) {
		this.idroom = idroom;
	}
	
	public String getNameroom() {
		return nameroom;
	}

	public void setNameroom(String nameroom) {
		this.nameroom = nameroom;
	}
	
	public float getPrice() {
		return price;
	}

	public void setId(float price) {
		this.price = price;
	}
	
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	public int getInused() {
		return inused;
	}

	public void setInused(int inused) {
		this.inused = inused;
	}
}