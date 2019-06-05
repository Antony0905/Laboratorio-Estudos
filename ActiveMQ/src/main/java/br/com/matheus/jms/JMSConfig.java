package br.com.matheus.jms;

import javax.jms.ConnectionFactory;
import javax.jms.Session;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.RedeliveryPolicy;
import org.apache.activemq.broker.region.policy.RedeliveryPolicyMap;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;

@Configuration
@EnableJms
public class JMSConfig {

	@Bean
	public DefaultJmsListenerContainerFactory jmsFactory(ConnectionFactory connectionFactory,
			DefaultJmsListenerContainerFactoryConfigurer configurer) {

		DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
		configurer.configure(factory, connectionFactory);
		return factory;
	}

	@Bean
	public DefaultJmsListenerContainerFactory jmsACKListenerContainerFactory() {
		DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
		factory.setConnectionFactory(connectionFactory());
		factory.setSessionTransacted(false);
		factory.setSessionAcknowledgeMode(Session.CLIENT_ACKNOWLEDGE);
		return factory;
	}

	@Bean
	public ActiveMQConnectionFactory connectionFactory() {
		ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
		connectionFactory.setBrokerURL("tcp://192.168.56.101:61616");
		connectionFactory.setPassword("admin");
		connectionFactory.setUserName("admin");
		connectionFactory.setTrustAllPackages(true);

		ActiveMQQueue queueRedelivery = new ActiveMQQueue("ACTIVEMQ-TESTE");
		RedeliveryPolicy policy = new RedeliveryPolicy();
		// policy.setInitialRedeliveryDelay(10000);
		policy.setUseCollisionAvoidance(true);
		// policy.setRedeliveryDelay(10000);
		policy.setUseExponentialBackOff(false);
		policy.setMaximumRedeliveries(3);
		policy.setDestination(queueRedelivery);

		RedeliveryPolicyMap rdMap = connectionFactory.getRedeliveryPolicyMap();
		rdMap.put(queueRedelivery, policy);

		connectionFactory.setRedeliveryPolicyMap(rdMap);

		return connectionFactory;
	}
}
