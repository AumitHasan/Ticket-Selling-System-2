package com.aumit.ticketSell.torpedo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MyTicket {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int ticketId;
	private int buySeats;
	private int price;
	
	public MyTicket() {
		
	}

	public MyTicket(int id, int ticketId, int buySeats, int price) {
		super();
		this.id = id;
		this.ticketId = ticketId;
		this.buySeats = buySeats;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public int getBuySeats() {
		return buySeats;
	}

	public void setBuySeats(int buySeats) {
		this.buySeats = buySeats;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
