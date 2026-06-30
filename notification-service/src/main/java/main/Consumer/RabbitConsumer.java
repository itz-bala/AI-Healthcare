package main.Consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitConsumer {
	
	@RabbitListener(queues="ap.queue")
	public void receive(String message) {
		
		System.out.println("receive:"+message);
	}

}
