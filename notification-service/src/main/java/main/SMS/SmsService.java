package main.SMS;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import main.Dto.NotificationDto;
@Service
public class SmsService {
	
//	@Value("${twilio.account.sid}")
//    private String accountSid;
//
//    @Value("${twilio.auth.token}")
//    private String authToken;
//
//    @Value("${twilio.phone.number}")
//    private String twilioPhoneNumber;
//
//    public void sendPatientSms(NotificationDto dto) {
//
//        Twilio.init(accountSid, authToken);
//
//        Message.creator(
//                new PhoneNumber(dto.getPatientPhonenum()),
//                new PhoneNumber(twilioPhoneNumber),
//                "Hello " + dto.getPatientName()
//                        + ", your appointment has been booked.\n"
//                        + "Doctor: " + dto.getDoctorName()
//                        + "\nDate: " + dto.getAppointmentDate()
//        ).create();
//
//        System.out.println("Patient SMS sent successfully.");
//    }
//
//    public void sendDoctorSms(NotificationDto dto) {
//
//        Twilio.init(accountSid, authToken);
//
//        Message.creator(
//                new PhoneNumber(dto.getDoctorPhonenum()),
//                new PhoneNumber(twilioPhoneNumber),
//                "Hello " + dto.getDoctorName()
//                        + ", a new appointment has been booked.\n"
//                        + "Patient: " + dto.getPatientName()
//                        + "\nDate: " + dto.getAppointmentDate()
//        ).create();
//
//        System.out.println("Doctor SMS sent successfully.");
//    }

}
