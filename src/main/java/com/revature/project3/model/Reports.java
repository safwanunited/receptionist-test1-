package com.revature.project3.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Reports {
	@Id
	@GeneratedValue(strategy=IDENTITY)
	private int reportId;
	@Column(name="reportDate")
	private Date reportDate;
	@Column(name="totalFees")
	private double totalFees;
	@Column(name="totalPatient")
	private int totalPatient;
	
}
