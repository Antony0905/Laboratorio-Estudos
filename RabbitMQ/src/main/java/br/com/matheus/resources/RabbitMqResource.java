package br.com.matheus.resources;

import java.util.concurrent.TimeUnit;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.matheus.rabbitmq.consumer.Receiver;

@RestController
public class RabbitMqResource {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	@Autowired
	private Receiver receiver;

	@GetMapping(value = "/")
	public ResponseEntity<Object> health() {

		try {

			System.out.println("Sending message...");
			rabbitTemplate.convertAndSend("exchange-matheus", "routing-matheus", "Hello from RabbitMQ!");
			receiver.getLatch().await(10000, TimeUnit.MILLISECONDS);
			return new ResponseEntity<>(HttpStatus.OK);

		} catch (Exception e) {

			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_GATEWAY);
		}
	}

}
