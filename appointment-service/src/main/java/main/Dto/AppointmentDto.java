package main.Dto;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotNull;

public class AppointmentDto {
	
	
    private Long id;
	
	@NotNull(message="patient id is ,must be")
	private  Long  patient_id;
	
	
	@NotNull(message="doctor id must be")
	private Long doctor_id;
	
	
	
	@NotNull(message="appointment date and time is m ust be")
	private LocalDateTime  appointment_date;



	public AppointmentDto() {
		super();
	}



	public AppointmentDto(Long id, @NotNull(message = "patient id is ,must be") Long patient_id,
			@NotNull(message = "doctor id must be") Long doctor_id,
			@NotNull(message = "appointment date and time is m ust be") LocalDateTime appointment_date) {
		super();
		this.id = id;
		this.patient_id = patient_id;
		this.doctor_id = doctor_id;
		this.appointment_date = appointment_date;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Long getPatient_id() {
		return patient_id;
	}



	public void setPatient_id(Long patient_id) {
		this.patient_id = patient_id;
	}



	public Long getDoctor_id() {
		return doctor_id;
	}



	public void setDoctor_id(Long doctor_id) {
		this.doctor_id = doctor_id;
	}



	public LocalDateTime getAppointment_date() {
		return appointment_date;
	}



	public void setAppointment_date(LocalDateTime appointment_date) {
		this.appointment_date = appointment_date;
	}
	
	
	


	
	


}
