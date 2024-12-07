package org.clinic;

import java.util.ArrayList;
import java.util.List;

public class Clinic {


    private List<Patient> patients = new ArrayList<>();

    //    public Clinic(List<Patient> patients) {
//        this.patients = patients;
//    }
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

    public List<Patient> findPatientByLastName(String lastName) {
        List<Patient> result = new ArrayList<>();
        for (Patient patient : patients) {
            if (patient.getLastName().equals(lastName)) {
                result.add(patient);
            }
        }
        return result;
    }
}


