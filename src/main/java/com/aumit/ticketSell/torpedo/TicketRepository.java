package com.aumit.ticketSell.torpedo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository <Ticket, Integer> {
	
	List<Ticket> findByTypeAndDateAndTimeAndFromAAndToA(String type, String date, String time, String fromA, String toA);
}
