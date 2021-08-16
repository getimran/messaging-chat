package com.imran.messenger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.imran.messenger.model.MessageModel;
import com.imran.messenger.service.MessengerService;

@RestController
@RequestMapping("/messenger/service")
public class MessengerController {
	
	
	@Autowired
	MessengerService messengerService;

	@PostMapping("/send")
	@ResponseStatus(code = HttpStatus.OK)
	private void sendMessage(@RequestBody MessageModel message) {
		// TODO Auto-generated method stub
		messengerService.sendMessage(message);
	}
}
