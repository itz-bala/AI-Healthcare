package main.Service;

import main.Dto.DoctorDto;

public interface DoctorService {

	DoctorDto createDoctor(DoctorDto dto);

	DoctorDto getbyid(Long id);

}
