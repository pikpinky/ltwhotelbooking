package com.ltwhotel.model;

public class Bill {
	private int idbill;
	private String checkin;
	private String checkout;
	private int day;
	private float money;
	
	public Bill() {
	}
	
	public Bill(int idbill, String checkin, String checkout, int day, float money) {
		this.idbill = idbill;
		this.checkin = checkin;
		this.checkout = checkout;
		this.day = day;
		this.money = money;
	}
	
	public int getIdbill() {
		return idbill;
	}

	public void setIdroom(int idbill) {
		this.idbill = idbill;
	}
	
	public String getCheckin() {
		return checkin;
	}

	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}
	
	public String getCheckout() {
		return checkout;
	}

	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	
	public float getMoney() {
		return money;
	}

	public void setDay(float money) {
		this.money = money;
	}
}