package br.com.matheus.jms.consumer;

import javax.jms.Message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import br.com.matheus.domain.Pessoa;
import br.com.matheus.jms.event.controller.ActiveMQController;
import br.com.matheus.jms.exception.ConsumerException;

@Component
public class ActiveMQConsumer extends Consumer<Pessoa, ActiveMQController> {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	@JmsListener(destination = "ACTIVEMQ-TESTE", containerFactory = "jmsACKListenerContainerFactory")
	public void process(Message objectMessage) throws ConsumerException {
		logger.info("[CONSUMER] Consumindo Fila ACTIVEMQ-TESTE.");
		super.process(objectMessage);
	}

}
