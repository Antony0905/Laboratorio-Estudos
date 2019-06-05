package br.com.matheus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitMQApplication {

	static final String topicExchangeName = "spring-boot-exchange";

	public static void main(String[] args) {
		SpringApplication.run(RabbitMQApplication.class, args);
	}

}
