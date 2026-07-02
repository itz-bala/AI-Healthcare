package main.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import main.Dto.PatientDto;
import main.Service.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {
	
	
	private  final PatientService service;
	
	
	public PatientController(PatientService service) {
		
		
		this.service=service;
	}
	
	
	//posting
	
	
	@PostMapping("/register")
	public ResponseEntity<PatientDto>createPatient( @Valid @RequestBody PatientDto dto){
		
		PatientDto patient=service.createPatient(dto);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(patient);
	}

	
	
	//get by id
	
	@GetMapping("/getById/{id}")
	public ResponseEntity<PatientDto>getbyid(@PathVariable Long id){
		
		PatientDto dto=service.getbyid(id);
		
		
		return ResponseEntity.ok(dto);
	}
}
