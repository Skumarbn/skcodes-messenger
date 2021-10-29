package org.satish.skcodes.messenger.resources;

import java.util.List;

import org.satish.skcodes.messenger.model.Message;
import org.satish.skcodes.messenger.service.MessageService;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/messages")
public class MessageResource {
	MessageService messageService = new MessageService();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages() {
		//return "Hello World! from Message ";
		return messageService.getAllMessages();
	}
	
	
	
	
}
