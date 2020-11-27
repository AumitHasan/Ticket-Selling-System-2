package com.aumit.ticketSell.torpedo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {
	
	@Autowired
	private TicketRepository ticketRepository;
	
	public List<Ticket> getAllTickets(){
		List<Ticket> tickets = new ArrayList<>();
		ticketRepository.findAll().forEach(tickets::add);
		return tickets;
	}
	
	
	public void addTicket(Ticket ticket) {
		ticketRepository.save(ticket);
	}
	
	
	public Ticket getTicket(Integer id) {
		return ticketRepository.findById(id).get();
	}
	
	
	public void updateTicket(MyTicket ticket) {
		Ticket t = ticketRepository.findById(ticket.getTicketId()).get();
		t.setAvailablSeats(t.getAvailablSeats() + ticket.getBuySeats());
		ticketRepository.save(t);
	}

	
	public void updateTicketMinus(MyTicket ticket) {
		Ticket t = ticketRepository.findById(ticket.getTicketId()).get();
		t.setAvailablSeats(t.getAvailablSeats() - ticket.getBuySeats());
		ticketRepository.save(t);
	}
	

	public List<Ticket> getValidTicket(String type, String date, String time, String fromA, String toA) {
		List<Ticket> tickets = new ArrayList<>();
		List<TicketSearchJson> srcTicket = new ArrayList<>();
		ticketRepository.findByTypeAndDateAndTimeAndFromAAndToA(type, date, time, fromA, toA).forEach(tickets::add);;
		return tickets;
	}
	
	public String getReport(String name) {
		
		int price = 0;
		int numOfSeats = 0;
		List<Ticket> tickets = new ArrayList<>();
		ticketRepository.findAll().forEach(tickets::add);
		for(int i=0;i<tickets.size();i++) {
			if(tickets.get(i).getType().equals(name)) {
				int seatSold = tickets.get(i).getSeats() - tickets.get(i).getAvailablSeats();
				price = price + ( seatSold * tickets.get(i).getPrice() ) ;
				numOfSeats += seatSold;
			}
		}
		String result = String.valueOf(numOfSeats) + " " + String.valueOf(price)  ;
		return result;
	}
	
	public int getMytBalance() {
		int price = 0;
	
		List<Ticket> tickets = new ArrayList<>();
		ticketRepository.findAll().forEach(tickets::add);
		for(int i=0;i<tickets.size();i++) {
			int seatSold = tickets.get(i).getSeats() - tickets.get(i).getAvailablSeats();
			price = price + ( seatSold * tickets.get(i).getPrice() ) ;
		}
		return price;
	}
	
}
