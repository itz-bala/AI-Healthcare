package main.Service;

import main.Dto.PatientDto;

public interface PatientService {

	PatientDto createPatient(PatientDto dto);

	PatientDto getbyid(Long id);

}
