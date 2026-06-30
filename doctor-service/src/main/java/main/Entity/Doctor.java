package main.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name="doctor")
public class Doctor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  Long id;
	
	@NotBlank(message="name must be")
	private String name;
	
	
	@NotBlank(message="must be specialist")
	private String specialist;

     @Email(message="invalid email")
	private String email;

	 public Doctor() {
		super();
	 }

	 public Doctor(Long id, @NotBlank(message = "name must be") String name,
			@NotBlank(message = "must be specialist") String specialist,
			@Email(message = "invalid email") String email) {
		super();
		this.id = id;
		this.name = name;
		this.specialist = specialist;
		this.email = email;
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
	
	
     
     
     

}
