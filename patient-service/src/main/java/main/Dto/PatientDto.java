package main.Dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class PatientDto {
	
	
    private Long id;
	
	public PatientDto() {
		super();
	}

	@NotBlank(message="name must be")
	private String name;
	
	@Email(message="invalid email")
	private String email;
	
	
	private String gender;
	
	private Integer age;

	public PatientDto(Long id, @NotBlank(message = "name must be") String name,
			@Email(message = "invalid email") String email, String gender, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.age = age;
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
