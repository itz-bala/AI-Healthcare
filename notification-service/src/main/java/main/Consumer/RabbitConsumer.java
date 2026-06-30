package main.Consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import main.Dto.NotificationDto;

@Service
public class RabbitConsumer {
	
//	@RabbitListener(queues="ap.queue")
//	public void receive(String message) {
//		
//		System.out.println("receive:"+message);
//	}
	
	
	
	
	    @RabbitListener(queues = "ap.queue")
	    public void receive(NotificationDto dto) {

	        System.out.println("===================================");

	        System.out.println("Patient Name : " + dto.getPatientName());
	        System.out.println("Patient Email : " + dto.getPatientEmail());

	        System.out.println();

	        System.out.println("Doctor Name : " + dto.getDoctorName());
	        System.out.println("Doctor Email : " + dto.getDoctorEmail());

	        System.out.println();

	        System.out.println("Appointment Date : " + dto.getAppointmentDate());

	        System.out.println("===================================");

	    }


}
