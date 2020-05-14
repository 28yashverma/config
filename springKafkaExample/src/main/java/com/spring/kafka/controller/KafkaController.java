package com.spring.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.kafka.service.KafkaSender;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

	@Autowired
	private KafkaSender kafkaSender;

	@GetMapping("/producer")
	public String producer(@RequestParam("message") String message) {
		kafkaSender.send(message);
		return "message send successfully";
	}

}
