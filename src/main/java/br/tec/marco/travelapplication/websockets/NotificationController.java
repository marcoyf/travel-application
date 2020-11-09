/**
 * 
 */
package br.tec.marco.travelapplication.websockets;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * @author marcoyf
 *
 */
@Controller
public class NotificationController {
	
	@MessageMapping("/travel-add")
	@SendTo("/topic/greetings")
	public HelloMessage welcomeUser(TravelAddedNotification travelAddedNotification) 
			throws Exception {
		
		Thread.sleep(1000); // simulated delay
		return new HelloMessage("Hello, " + travelAddedNotification.getName() + "!");
	}

}
