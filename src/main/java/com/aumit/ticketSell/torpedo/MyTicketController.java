package com.aumit.ticketSell.torpedo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class MyTicketController {
	
	@Autowired
	private MyTicketService myTicketService;
	
	@Autowired
	private TicketService ticketService;
	
	@RequestMapping("/mytickets")
	public List<MyTicket> getAllTickets() {
		return myTicketService.getAllTickets();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/mytickets")
	public void addTicket(@RequestBody MyTicket ticket) {
		ticketService.updateTicketMinus(ticket);
		
		myTicketService.addTicket(ticket);
	}
	
//	@RequestMapping("mytickets/{id}")
//	public MyTicket getTicket(@PathVariable int id) {
//		return myTicketService.getTicket(id);
//	}
	

	@RequestMapping(method=RequestMethod.DELETE, value="/mytickets/delete/{id}")
	public void refund(@PathVariable int id) {
		ticketService.updateTicket(myTicketService.getTicket(id));
		myTicketService.refund(id);
	}
		

	@RequestMapping("/report/{name}")
	public String getReport(@PathVariable String name) {
		return ticketService.getReport(name);
	}
	
	@RequestMapping("/balance")
	public int getMytBalance() {
		return ticketService.getMytBalance();
	}
}
