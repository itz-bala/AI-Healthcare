package main.Consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.Dto.NotificationDto;
import main.Email.EmailService;
import main.SMS.SmsService;

@Service
public class RabbitConsumer {
	
//	private final EmailService emailService;
//    //private final SmsService smsService;
//
//    public RabbitConsumer(EmailService emailService,
//                          SmsService smsService) {
//
//        this.emailService = emailService;
//        //this.smsService = smsService;
//    }
	
	
	@Autowired
	private EmailService emailservice;
	
	//@Autowired
	//private SmsService smsservice;
	
	

	    @RabbitListener(queues = "ap.queue")
	    public void consume(NotificationDto dto) {

	       
	    	
	    	
	    	// Email to Patient
	    	emailservice.sendEmail(
	    	    dto.getPatientEmail(),
	    	    "Appointment Confirmation",
	    	    "Hello " + dto.getPatientName()
	    	    + ",\n\nYour appointment with Dr. "
	    	    + dto.getDoctorName()
	    	    + " has been booked successfully."
	    	    + "\n\nDate: " + dto.getAppointmentDate()
	    	    + "\n\nThank You."
	    	);

	    	// Email to Doctor
	    	emailservice.sendEmail(
	    	    dto.getDoctorEmail(),
	    	    "New Appointment Booked",
	    	    "Hello Dr. " + dto.getDoctorName()
	    	    + ",\n\nA new appointment has been booked."
	    	    + "\n\nPatient: " + dto.getPatientName()
	    	    + "\nDate: " + dto.getAppointmentDate()
	    	    + "\n\nPlease be available."
	    	);
	    	
	    	
	    	
	    	
	    	  // SMS
	      //  smsService.sendSMS(
	          //      event.getPhoneNumber(),
	             //   "Appointment booked successfully with Dr."
	                  //      + event.getDoctorName());
	        
	       // smsService.sendPatientSms(dto);
	       // smsService.sendDoctorSms(dto);

	        System.out.println("Emails and sms sent successfully.");
	    }


}
