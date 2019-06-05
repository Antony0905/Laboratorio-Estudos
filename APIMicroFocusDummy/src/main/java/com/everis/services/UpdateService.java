package com.everis.services;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.domain.Evento;
import com.everis.domain.Update;
import com.everis.repository.UpdateRepository;

@Service
public class UpdateService {

	@Autowired
	private UpdateRepository ticketSimulacionRepository;

	Timestamp timeStamp = new Timestamp(System.currentTimeMillis());

	public void save(Evento evento) {
		Update ticketSimulacion = buildTicketSimulacion(evento);
		ticketSimulacion.setAcao("I");
		ticketSimulacionRepository.save(ticketSimulacion);
	}

	public void update(Evento evento) {
		Update ticketSimulacion = buildTicketSimulacion(evento);
		ticketSimulacion.setAcao("A");
		ticketSimulacionRepository.save(ticketSimulacion);
	}

	public List<Update> findAllByLastModification(Long lastModification) {
		List<Update> ticketsSimulacion = ticketSimulacionRepository.findAllByLastModification(lastModification);
		if (ticketsSimulacion == null) {
			return new ArrayList<Update>();
		}
		return ticketsSimulacion;
	}

	public Update buildTicketSimulacion(Evento evento) {
		Update ticketSimulacion = new Update();
		BeanUtils.copyProperties(evento, ticketSimulacion);
		Timestamp timeStamp = new Timestamp(System.currentTimeMillis());
		ticketSimulacion.setDataProcessamento(new Date());
		ticketSimulacion.setTime(timeStamp.getTime());
		return ticketSimulacion;
	}

}
