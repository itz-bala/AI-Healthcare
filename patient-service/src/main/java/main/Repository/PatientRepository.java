package main.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import main.Entity.Patient;

public interface PatientRepository extends JpaRepository<Patient,Long>{
	
	
	boolean existsByEmail(String email);
	
	Optional<Patient>findById(Long id);

}
