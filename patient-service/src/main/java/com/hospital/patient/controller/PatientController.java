package com.hospital.patient.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;

import com.hospital.patient.entity.Patient;
import com.hospital.patient.respository.PatientRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/patients")
public class PatientController {
    private final PatientRepository repository;

    public PatientController(PatientRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Patient add(@RequestBody Patient patient) {
        return repository.save(patient);
    }

    @GetMapping
    public List<Patient> all() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Patient get(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        repository.deleteById(id);
        return "Patient deleted successfully";
    }
}
