package org.clinic;

import java.util.ArrayList;

public class MedicalStaff {
    private String firstName;
    private String lastName;
    private String pesel;
    private String dateOfBirth;
    private short age;
    private String phoneNumber;
    private String email;
    private String ID;
    private String medicalSpecialty;


    public MedicalStaff(String firstName, String lastName, String pesel, String dateOfBirth, short age, String phoneNumber, String email, String ID, String specialty) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.ID = ID;
        this.medicalSpecialty = new ArrayList<>();
    }
public void addspecialty(String specialty) {
        this.medicalSpecialty.add(medicalSpecialty);
}
    public String getID() {
        return ID;
    }
   public List<medicalSpecialty> getSpecialty() {
        return medicalSpecialty;
   }

    @Override
    public String toString() {
    return "Pacjent [Imie:" + firstName + ", Nazwisko:" + lastName
            + ", PESEL:" + pesel + ", Data urodzenia:" + dateOfBirth + ", wiek:" + age
            + ", numer telefonu:" + phoneNumber + ", email:" + email + ", identyfikator:" + ID + ", specjalizacja:" + medicalSpecialty + "]";
}
        }
