package main.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import main.Dto.DoctorDto;
import main.Service.DoctorService;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
	
	
	private final DoctorService service;
	
	public DoctorController(DoctorService service) {
		
		this.service=service;
		
	}
	
	//register
	
	
	@PostMapping("/register")
	public ResponseEntity<DoctorDto>createDoctor(@RequestBody DoctorDto dto){
		
		DoctorDto doctor=service.createDoctor(dto);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(doctor);
	}
	
	
	//get by id
	
	
	@GetMapping("/getById/{id}")
	public ResponseEntity<DoctorDto>getbyid(@PathVariable Long id){
		
		DoctorDto doctor=service.getbyid(id);
		
		return ResponseEntity.ok(doctor);
		
	}

}
