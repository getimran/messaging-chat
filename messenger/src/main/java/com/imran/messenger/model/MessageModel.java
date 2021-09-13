/**
 * 
 */
package com.imran.messenger.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author imran-home
 *
 */ 
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MessageModel {

	
	private String fromUser;
	private String toUser;
	private String message;
	
}
