package br.com.matheus.jms.producer;

import org.springframework.stereotype.Component;

import br.com.matheus.domain.Pessoa;

@Component
public class ActiveMQProducer extends Producer<Pessoa> {

	public ActiveMQProducer() {
		super();
	}

	@Override
	protected String getQueueName() {
		return "ACTIVEMQ-TESTE";
	}

}
