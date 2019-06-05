package com.everis.resources;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.events.EventException;

import com.everis.domain.Evento;
import com.everis.services.UpdateService;

@RestController
public class NagiosEventoResource {

	@Autowired
	UpdateService ticketSimulacionService;

	@PostMapping(value = "/api/saveTicketSimulacion", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> saveTicketSimulacion(@RequestBody Evento evento,
			HttpServletRequest httpServletRequest) throws EventException {

		ticketSimulacionService.save(evento);
		return new ResponseEntity<>("SUCESSO", HttpStatus.OK);

	}

	@PostMapping(value = "/api/updateTicketSimulacion", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> updateTicketSimulacion(@RequestBody Evento evento,
			HttpServletRequest httpServletRequest) throws EventException {

		ticketSimulacionService.update(evento);
		return new ResponseEntity<>("SUCESSO", HttpStatus.OK);

	}

}
