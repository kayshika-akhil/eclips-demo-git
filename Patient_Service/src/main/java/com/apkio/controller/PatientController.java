package com.apkio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apkio.entity.Patient;
import com.apkio.serivice.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {
	
	@Autowired
	PatientService patientService;
	
	
	@PostMapping("/save")
	Patient savePatientC(Patient patient) {
		return patientService.savePatient(patient);
	}
	
	@GetMapping("/getInfo")
	List<Patient> getPatientC(){
		return patientService.getPatients();
	}
	
	@GetMapping("/{id}")
	Patient getPatientByIdC(@PathVariable int id) {
		return patientService.getPatientById(id);
	}

}
