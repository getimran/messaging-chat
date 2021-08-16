/**
 * 
 */
package com.imran.messenger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.imran.messenger.model.MessageModel;

/**
 * @author imran-home
 *
 */
@Service
public class MessengerService {
	
	@Autowired
	KafkaTemplate<String, MessageModel> kafkaTemplate;
	
	@Value("${messageKafkaTopic}")
	private String messageTopic;

	
	public void sendMessage(MessageModel message) {
		// TODO Auto-generated method stub
		kafkaTemplate.send(messageTopic, message);
	}
}
