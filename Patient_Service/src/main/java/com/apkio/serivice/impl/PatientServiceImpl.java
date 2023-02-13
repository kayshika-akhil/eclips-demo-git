package com.apkio.serivice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apkio.entity.Patient;
import com.apkio.repository.PatientRepository;
import com.apkio.serivice.PatientService;

@Service
public class PatientServiceImpl  implements PatientService{
	
	
	@Autowired
	PatientRepository patientRepository;

	@Override
	public Patient savePatient(Patient patient) {
		return patientRepository.save(patient);
	}
	

	@Override
	public List<Patient> getPatients() {
		return patientRepository.findAll();
	}

	@Override
	public Patient getPatientById(int id) {
		return patientRepository.findById(id).orElse(null);
	}

}
