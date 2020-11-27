package com.aumit.ticketSell.torpedo;

import org.springframework.data.repository.CrudRepository;


public interface MyTicketRepository extends CrudRepository<MyTicket, Integer> {
	
	
	//MyTicket findById(int id);
	
}
