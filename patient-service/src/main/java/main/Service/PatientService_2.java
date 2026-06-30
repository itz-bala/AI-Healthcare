package main.Service;

import org.springframework.stereotype.Service;

import main.Dto.PatientDto;
import main.Entity.Patient;
import main.Exception.EmailExistsException;
import main.Exception.IdNotFoundException;
import main.Repository.PatientRepository;

@Service

public class PatientService_2  implements PatientService{

	
	private final PatientRepository repo;
	
	public PatientService_2(PatientRepository repo) {
		
		
		this.repo=repo;
	}
	
	
	
	
	@Override
	public PatientDto createPatient(PatientDto dto) {
		// TODO Auto-generated method stub
		
		if(repo.existsByEmail(dto.getEmail())) {
			
			throw new  EmailExistsException("this email already exists");
			
		}
		
		Patient patient=new Patient();
		
		patient.setEmail(dto.getEmail());
		patient.setName(dto.getName());
		patient.setGender(dto.getGender());
		patient.setAge(dto.getAge());
		
		 Patient p=repo.save(patient);
		 
		 
		 PatientDto patientdto=new PatientDto();
		 
		 patientdto.setEmail(p.getEmail());
		 patientdto.setAge(p.getAge());
		 patientdto.setId(p.getId());
		 patientdto.setName(p.getName());
		 patientdto.setGender(p.getGender());
		 
		 
		
		
		return patientdto;
	}



//getbyid
	
	
	
	@Override
	public PatientDto getbyid(Long id) {
		// TODO Auto-generated method stub
		
		Patient patient=repo.findById(id) 
				.orElseThrow(()->new IdNotFoundException("patient id is not found"));
		
		PatientDto dto=new PatientDto();
		
		dto.setEmail(patient.getEmail());
		dto.setAge(patient.getAge());
		dto.setName(patient.getName());
		dto.setId(patient.getId());
		dto.setGender(patient.getGender());
		
		return dto;
	}

}
