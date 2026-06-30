package main.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="appointment")
public class Appointment {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message="patient id is ,must be")
	private  Long  patient_id;
	
	
	@NotNull(message="doctor id must be")
	private Long doctor_id;
	
	
	
	@NotNull(message="appointment date and time is m ust be")
	private LocalDateTime  appointment_date;



	public Appointment() {
		super();
	}



	public Appointment(Long id, @NotNull(message = "patient id is ,must be") Long patient_id,
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
