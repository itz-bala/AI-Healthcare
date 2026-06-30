package main.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import main.Entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor,Long>{
	
	
	boolean existsByEmail(String email);
	
	Optional<Doctor>findById(Long id);

}
