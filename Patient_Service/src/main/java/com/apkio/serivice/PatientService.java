package com.apkio.serivice;

import java.util.List;

import com.apkio.entity.Patient;

public interface PatientService {
	
	Patient savePatient(Patient patient);
	
	List<Patient> getPatients();
	
	Patient getPatientById(int id);

}
