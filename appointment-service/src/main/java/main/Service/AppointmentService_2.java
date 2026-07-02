package main.Service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import main.Dto.AppointmentDto;
import main.Dto.DoctorDto;
import main.Dto.NotificationDto;
import main.Dto.PatientDto;
import main.Entity.Appointment;
import main.Exception.DoctorNotFoundException;
import main.Exception.PatientNotFoundException;
import main.Repository.AppointmentRepository;

@Service
public class AppointmentService_2 implements AppointmentService{
	
	
	private final AppointmentRepository repo;
	
	private final RestTemplate restTemplate;
	
	
	private final RabbitmqProducer producer;
	
	
	
	public AppointmentService_2(AppointmentRepository repo,RestTemplate restTemplate,RabbitmqProducer producer ) {
		
		
		this.repo=repo;
		this.restTemplate=restTemplate;
		this.producer=producer;
	}
	
	
	
	
	
	
	

	@Override
	public AppointmentDto createBooking(AppointmentDto dto) {
		
		
		PatientDto patient=null;
		DoctorDto doctor=null;
		
		
		try {
			
		ResponseEntity<PatientDto>response_1=
				restTemplate.getForEntity("http://localhost:8071/patient/getById/"+dto.getPatient_id(),
						PatientDto.class);
		
		 patient=response_1.getBody();
		
		
		}catch(HttpClientErrorException.NotFound  e) {
			
			
			throw new PatientNotFoundException("patientid is not exists in patient databse");
		}
		
		
		
		
		
		try {
		
		ResponseEntity<DoctorDto>response_2=
				restTemplate.getForEntity("http://localhost:8074/doctor/getById/"+dto.getDoctor_id(),
						DoctorDto.class);
		
		 doctor=response_2.getBody();
		
		}catch(HttpClientErrorException.NotFound e) {
			
			throw new DoctorNotFoundException("doctor id is not exists doctor  database");
		}
		
		
		
		
		
		
		
		
		
		Appointment appointment=new Appointment();
		
		
		appointment.setAppointment_date(dto.getAppointment_date());
		
		
		appointment.setPatient_id(dto.getPatient_id());
		appointment.setDoctor_id(dto.getDoctor_id());
		
		Appointment ap=repo.save(appointment);
		
		
		//empty dto class
		
		AppointmentDto appointmentdto=new AppointmentDto();
		
		appointmentdto.setPatient_id(ap.getPatient_id());
		appointmentdto.setDoctor_id(ap.getDoctor_id());
		
		appointmentdto.setAppointment_date(ap.getAppointment_date());
		appointmentdto.setId(ap.getId());
		
		//producer.Message();//notification
		
		
		NotificationDto notification = new NotificationDto();

		notification.setPatientId(patient.getId());
		notification.setPatientName(patient.getName());
		notification.setPatientEmail(patient.getEmail());
		notification.setPatientPhonenum(patient.getPhonenum());

		notification.setDoctorId(doctor.getId());
		notification.setDoctorName(doctor.getName());
		notification.setDoctorEmail(doctor.getEmail());
		notification.setDoctorPhonenum(doctor.getPhonenum());

		notification.setAppointmentDate(ap.getAppointment_date());

		producer.send(notification);
		
		return  appointmentdto;
		
		
		
		
	}
	
	
	
	

}
