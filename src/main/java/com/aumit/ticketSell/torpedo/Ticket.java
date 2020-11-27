package com.aumit.ticketSell.torpedo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ticket {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String type;
	private String date;
	private String time;
	private String fromA;
	private String toA;
	private int seats;
	private int availablSeats;
	private int price;
	
	
	public Ticket() {
		
	}
	
	
	public Ticket(int id, String type, String date, String time, String fromA, String toA, int seats, int availablSeats,
			int price) {
		super();
		this.id = id;
		this.type = type;
		this.date = date;
		this.time = time;
		this.fromA = fromA;
		this.toA = toA;
		this.seats = seats;
		this.availablSeats = availablSeats;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	
	

	public String getFromA() {
		return fromA;
	}
	public void setFromA(String fromA) {
		this.fromA = fromA;
	}
	public String getToA() {
		return toA;
	}
	public void setToA(String toA) {
		this.toA = toA;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public int getAvailablSeats() {
		return availablSeats;
	}
	public void setAvailablSeats(int availablSeats) {
		this.availablSeats = availablSeats;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

	
	
}
