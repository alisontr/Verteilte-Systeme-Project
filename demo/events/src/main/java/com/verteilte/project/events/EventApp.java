package com.verteilte.project.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@ComponentScan
@EnableAutoConfiguration
@EnableDiscoveryClient
@Component
public class EventApp {

	private final EventRepository eventRepository;

	@Autowired
	public EventApp(EventRepository eventRepository) {
		this.eventRepository = eventRepository;
	}

	@PostConstruct
	public void generateTestData() {
		eventRepository.save(new Event("Luxus Party", 55.0));
		eventRepository.save(new Event("House Party", 12.0));
		eventRepository.save(new Event("Mini Party", 7.0));
		eventRepository.save(new Event("Privat Party", 5.0));
	}

	public static void main(String[] args) {
		SpringApplication.run(EventApp.class, args);
	}

}
