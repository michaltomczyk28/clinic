package org.clinic;

import java.util.ArrayList;
import java.util.List;

public class Clinic {
  private List<Patient> patients = new ArrayList<>();
  private List<Physician> physicians = new ArrayList<>();

  public void addPatient(Patient patient) {
    patients.add(patient);
  }

  public Patient findPatientByPesel(String pesel) {
    for (Patient patient : patients) {
      if (patient.getPesel().equals(pesel)) {
        return patient;
      }
    }

    return null;
  }

  public List<Patient> findPatientsByLastName(String lastName) {
    List<Patient> result = new ArrayList<>();
    for (Patient patient : patients) {
      if (patient.getLastName().equals(lastName)) {
        result.add(patient);
      }
    }

    return result;
  }

  public void addPhysician(Physician physician) {
    physicians.add(physician);
  }

  public Physician findPhysicianById(String id) {
    for (Physician physician : physicians) {
      if (physician.getID() == id) {
        return physician;
      }
    }

    return null;
  }

  public List<Physician> findPhysiciansBySpecialty(Specialty specialty) {
    List<Physician> result = new ArrayList<>();

    for (Physician physician : physicians) {
      if (physician.hasSpecialty(specialty)) {
        result.add(physician);
      }
    }

    return result;
  }
}


