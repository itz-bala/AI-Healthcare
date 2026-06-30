package main.Service;

import org.springframework.stereotype.Service;

import main.Dto.DoctorDto;
import main.Entity.Doctor;
import main.Exception.EmailExistsException;
import main.Exception.IdNotFoundException;
import main.Repository.DoctorRepository;

@Service
public class DoctorService_2 implements DoctorService{

	private final DoctorRepository repo;
	
	
	public DoctorService_2(DoctorRepository repo) {
		
		this.repo=repo;
	}
	
	
	@Override
	public DoctorDto createDoctor(DoctorDto dto) {
		// TODO Auto-generated method stub
		
		if(repo.existsByEmail(dto.getEmail())) {
			
			
			throw new EmailExistsException("this email already exists please entewr new email");
		}
		
		
		Doctor doctor=new Doctor();
		
		doctor.setEmail(dto.getEmail());
		doctor.setName(dto.getName());
		doctor.setSpecialist(dto.getSpecialist());
		
		Doctor d=repo.save(doctor);
		
		
		DoctorDto doctordto=new DoctorDto();
		
		doctordto.setId(d.getId());
		doctordto.setEmail(d.getEmail());
		doctordto.setName(d.getName());
		doctordto.setSpecialist(d.getSpecialist());
		
		
		
		return doctordto;
	}


	
	//get by id
	
	
	@Override
	public DoctorDto getbyid(Long id) {
		// TODO Auto-generated method stub
		
		Doctor doctor=repo.findById(id) 
				.orElseThrow(()->new IdNotFoundException("doctor id not exists"));
		
		
		DoctorDto dto=new DoctorDto();
		
		dto.setEmail(doctor.getEmail());
		dto.setId(doctor.getId());
		
		dto.setName(doctor.getName());
		dto.setSpecialist(doctor.getSpecialist());
		
		
		
		return dto;
	}

}
