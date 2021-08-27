package com.revature.project3.model;



import static javax.persistence.GenerationType.IDENTITY;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Appointment {
	@Id
	@GeneratedValue(strategy=IDENTITY)
	private int applicationId;
	//@OneToMany(cascade= CascadeType.ALL,mappedBy="patient")
	@Column(name="patient")
	private Patient patient;
	//@OneToMany(cascade= CascadeType.ALL,mappedBy="doctor")
	@Column(name="doctor")
	private Doctor doctor;
	@Column(name="applicationDate")
	private Date applicationDate;
	@Column(name="purpose")
	private String purpose;
	@Column(name="availability")
	private String availability;
	//@ManyToMany
	@Column(name="family")
	private List<Family> family=new ArrayList<Family>();
	
}
