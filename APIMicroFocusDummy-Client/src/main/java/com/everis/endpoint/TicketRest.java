package com.everis.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.wrapper.CallSoapTicket;

@RestController
public class TicketRest {

	@Autowired
	CallSoapTicket c;

	@GetMapping(value = "/createIncidentRequest")
	public void createIncidentRequest() {

		c.createIncidentRequest();

	}

	@GetMapping(value = "/updateIncidentRequest")
	public void updateIncidentRequest() {

		c.updateIncidentRequest();

	}

	@GetMapping(value = "/consultaTickets")
	public void getList() {

		c.getList();

	}
	
	@GetMapping(value = "/consultaCMDB")
	public void getCmdb() {

		c.getCmdb();

	}

}
