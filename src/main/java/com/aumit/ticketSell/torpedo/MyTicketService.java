package com.aumit.ticketSell.torpedo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyTicketService {
	
	@Autowired
	private MyTicketRepository myTicketRepository;
	
	public List<MyTicket> getAllTickets(){
		List<MyTicket> tickets = new ArrayList<>();
		myTicketRepository.findAll().forEach(tickets::add);
		return tickets;
	}
	
	public void addTicket(MyTicket ticket) {
		myTicketRepository.save(ticket);
	}
	
	public MyTicket getTicket(Integer id) {
		return myTicketRepository.findById(id).get();
	}

	public void refund(Integer id) {
		myTicketRepository.deleteById(id);
	}

	

}
