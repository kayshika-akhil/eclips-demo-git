package com.apkio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Patient {
	
	
	@Id
	int id;
	int HospitalId;
	String patientName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getHospitalId() {
		return HospitalId;
	}
	public void setHospitalId(int hospitalId) {
		HospitalId = hospitalId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	
	
	
	

}
