package br.com.matheus.resource;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import br.com.matheus.domain.Pessoa;
import br.com.matheus.jms.producer.ActiveMQProducer;

@RestController
public class CallActiveMQResource {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private ActiveMQProducer producer;

	@PostMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> postNagiosTicket(@RequestBody Pessoa pessoa, HttpServletRequest httpServletRequest)
			throws Exception {

		try {
			logger.info("[START APPLICATION] ACTIVEMQ TESTE");

			String result = new Gson().toJson(producer.send(pessoa));
			return new ResponseEntity<>(result, HttpStatus.OK);

		} catch (Exception e) {
			throw new Exception(e);
		}

	}

}
