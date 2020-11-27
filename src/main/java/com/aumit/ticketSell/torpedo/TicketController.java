package com.aumit.ticketSell.torpedo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class TicketController {
	
	@Autowired
	private TicketService ticketService;
	
	
	@RequestMapping("/tickets")
	public List<Ticket> getAllTickets() {
		return ticketService.getAllTickets();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/tickets")
	public void addTicket(@RequestBody Ticket ticket) {
		ticketService.addTicket(ticket);
	
	}
	
	
	@GetMapping("/tickets/{id}")
	public Ticket getTicket(@PathVariable int id) {
		return ticketService.getTicket(id);
	}
	
	
	@RequestMapping(method=RequestMethod.POST, value="/search")
	public List<Ticket> getValidTicket(@RequestBody TicketSearchJson srcValue) {
		return ticketService.getValidTicket(srcValue.getType(), srcValue.getDate(), srcValue.getTime(),srcValue.getFroma(), srcValue.getToa());
	}

}
