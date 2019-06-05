package br.com.matheus.jms.event.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import br.com.matheus.domain.Pessoa;
import br.com.matheus.jms.event.EventController;
import br.com.matheus.jms.exception.EventException;

@Component
public class ActiveMQController implements EventController<Pessoa> {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public void fire(Pessoa object, String id) throws EventException {

		try {

			logger.info("[CONTROLLER] ACTIVEMQ-TESTE");
			throw new EventException();

		} catch (Exception e) {
			logger.error("Ocorreu um erro. Identificador da Mensagem = [" + id + "]");
			throw new EventException(e);
		}

	}

}
