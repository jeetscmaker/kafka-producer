package org.jk.kafkaproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {
	@Autowired
	KafkaTemplate<String, Book> kafkaTemplate;

	private static final String TOPIC = "newTopic";

	@PostMapping("/publish")
	public String publishMessage(@RequestBody Book book) {
		kafkaTemplate.send(TOPIC, book);
		return "Message Published to the topic " + TOPIC;
	}
}
