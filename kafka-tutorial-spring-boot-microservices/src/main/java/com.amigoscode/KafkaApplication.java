package com.amigoscode;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication

public class KafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate) {
		return args -> {
//			kafkaTemplate.send("amigoscode", "hello kafka 2");
//			kafkaTemplate.send("amigoscode", "hello kafka 3");
			kafkaTemplate.send("planning-events-topic-BR", "BR-plan-event-1");
			kafkaTemplate.send("planning-events-topic-BRFS",  "BRFS-plan-event-1");
			kafkaTemplate.send("planning-events-topic-GAP",  "GAP-plan-event-1");
			kafkaTemplate.send("planning-events-topic-GO", "GO-plan-event-1");
			kafkaTemplate.send("planning-events-topic-ON",  "ON-plan-event-1");

		};
	}

}
