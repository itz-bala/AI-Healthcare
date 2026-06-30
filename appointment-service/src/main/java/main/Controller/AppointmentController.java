package main.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import main.Dto.AppointmentDto;
import main.Service.AppointmentService;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {
	
	
	private final AppointmentService  service;
	
	
	public AppointmentController(AppointmentService service) {
		
		this.service=service;
		
	}
	
	
	//register
	
	
	@PostMapping("/booking")
	
	public ResponseEntity<AppointmentDto>createBooking(@RequestBody AppointmentDto dto){
		
		AppointmentDto appointment=service.createBooking(dto);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(appointment);
		
	}

}
