package com.apkio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apkio.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
