package com.revature.project3.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Receptionist {
	@Id
	@GeneratedValue(strategy=IDENTITY)
	private int rId;
	@Column(name="rName")
	@NotBlank(message = "name should not be null")
	private String rName;
	@Column(name="rPassword")
	@NotBlank(message = "Password should not be null")
	private String rPassword;
	@Column(name="rPhnNo")
	@NotBlank(message = "PhoneNo should not be null")
	private long rPhnNo;
	@Column(name="rEmail")
	@NotBlank(message = "Email should not be null")
	private String rEmail;
	
	
	
}
