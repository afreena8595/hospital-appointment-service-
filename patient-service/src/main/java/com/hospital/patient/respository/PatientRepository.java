package com.hospital.patient.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.patient.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
