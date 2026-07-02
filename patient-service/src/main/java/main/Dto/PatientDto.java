package main.Dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class PatientDto {
	
	
    private Long id;
	
	

	@NotBlank(message="name must be")
	private String name;
	
	@Email(message="invalid email")
	private String email;
	
	
	private String phonenum;
	
	
	private String gender;
	
	private Integer age;

	public PatientDto(Long id, @NotBlank(message = "name must be") String name,
			@Email(message = "invalid email") String email, String phonenum, String gender, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phonenum = phonenum;
		this.gender = gender;
		this.age = age;
	}

	public PatientDto() {
		super();
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	
	
	
	

}
