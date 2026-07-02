package main.Dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class DoctorDto {
	
    private  Long id;
	
	@NotBlank(message="name must be")
	private String name;
	
	
	@NotBlank(message="must be specialist")
	private String specialist;


	@Email(message="invalid email")
	private String email;
	
	
	
	
	private String phonenum;


	public DoctorDto() {
		super();
	}


	public DoctorDto(Long id, @NotBlank(message = "name must be") String name,
			@NotBlank(message = "must be specialist") String specialist, @Email(message = "invalid email") String email,
			String phonenum) {
		super();
		this.id = id;
		this.name = name;
		this.specialist = specialist;
		this.email = email;
		this.phonenum = phonenum;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSpecialist() {
		return specialist;
	}


	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhonenum() {
		return phonenum;
	}


	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}


	


	
	


}
