package main.Service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import main.Dto.NotificationDto;

@Service
public class RabbitmqProducer {
	
	
//	@Autowired
//	private RabbitTemplate rabbitTemplate;
//	
//	
//	public void Message() {
//		
//		
//		rabbitTemplate.convertAndSend("ap.queue","appointment is booked ");
//	}
	
	
	
	
	private final RabbitTemplate rabbitTemplate;

    public RabbitmqProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void send(NotificationDto dto) {

        rabbitTemplate.convertAndSend("ap.queue", dto);

    }

}
