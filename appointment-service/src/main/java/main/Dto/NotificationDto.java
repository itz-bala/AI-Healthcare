package main.Dto;

import java.time.LocalDateTime;

public class NotificationDto {
	
	 private Long patientId;
	    private String patientName;
	    private String patientEmail;
	    private String patientPhonenum;
	    

	    private Long doctorId;
	    private String doctorName;
	    private String doctorEmail;
	    private String doctorPhonenum;

	    private LocalDateTime appointmentDate;

	    public NotificationDto() {
	    }

		public NotificationDto(Long patientId, String patientName, String patientEmail, String patientPhonenum,
				Long doctorId, String doctorName, String doctorEmail, String doctorPhonenum,
				LocalDateTime appointmentDate) {
			super();
			this.patientId = patientId;
			this.patientName = patientName;
			this.patientEmail = patientEmail;
			this.patientPhonenum = patientPhonenum;
			this.doctorId = doctorId;
			this.doctorName = doctorName;
			this.doctorEmail = doctorEmail;
			this.doctorPhonenum = doctorPhonenum;
			this.appointmentDate = appointmentDate;
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

		public String getPatientPhonenum() {
			return patientPhonenum;
		}

		public void setPatientPhonenum(String patientPhonenum) {
			this.patientPhonenum = patientPhonenum;
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

		public String getDoctorPhonenum() {
			return doctorPhonenum;
		}

		public void setDoctorPhonenum(String doctorPhonenum) {
			this.doctorPhonenum = doctorPhonenum;
		}

		public LocalDateTime getAppointmentDate() {
			return appointmentDate;
		}

		public void setAppointmentDate(LocalDateTime appointmentDate) {
			this.appointmentDate = appointmentDate;
		}

		
		
	   

	   
	  


}
