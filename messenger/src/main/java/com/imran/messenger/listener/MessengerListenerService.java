/**
 * 
 */
package com.imran.messenger.listener;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.imran.messenger.model.MessageModel;
import com.imran.messenger.util.AppConstants;

import lombok.extern.slf4j.Slf4j;

/**
 * @author imran-home
 *
 */
@Service
@Slf4j
public class MessengerListenerService {

	
	
	@KafkaListener(topics = AppConstants.MESSAGE_TOPIC)
	public void listen(MessageModel mesaage) {
		// TODO Auto-generated method stub
		log.info("message-> {}", mesaage.toString());

	}
}
