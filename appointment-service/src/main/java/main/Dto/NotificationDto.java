package main.Dto;

import java.time.LocalDateTime;

public class NotificationDto {
	
	 private Long patientId;
	    private String patientName;
	    private String patientEmail;

	    private Long doctorId;
	    private String doctorName;
	    private String doctorEmail;

	    private LocalDateTime appointmentDate;

	    public NotificationDto() {
	    }

		public Long getPatientId() {
			return patientId;
		}

		public void setPatientId(Long patientId) {
			this.patientId = patientId;
		}

		public String getPatientName() {
			return patientName;
		}

		public void setPatientName(String patientName) {
			this.patientName = patientName;
		}

		public String getPatientEmail() {
			return patientEmail;
		}

		public void setPatientEmail(String patientEmail) {
			this.patientEmail = patientEmail;
		}

		public Long getDoctorId() {
			return doctorId;
		}

		public void setDoctorId(Long doctorId) {
			this.doctorId = doctorId;
		}

		public String getDoctorName() {
			return doctorName;
		}

		public void setDoctorName(String doctorName) {
			this.doctorName = doctorName;
		}

		public String getDoctorEmail() {
			return doctorEmail;
		}

		public void setDoctorEmail(String doctorEmail) {
			this.doctorEmail = doctorEmail;
		}

		public LocalDateTime getAppointmentDate() {
			return appointmentDate;
		}

		public void setAppointmentDate(LocalDateTime appointmentDate) {
			this.appointmentDate = appointmentDate;
		}

	   

	   
	  


}
