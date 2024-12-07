package org.clinic;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Physician {
  private String firstName;
  private String lastName;
  private String pesel;
  private String dateOfBirth;
  private String phoneNumber;
  private String email;
  private String ID;
  private List<Specialty> specialties;


  public Physician(String firstName, String lastName, String pesel, String dateOfBirth, String phoneNumber, String email, String ID, List<Specialty> specialties) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.pesel = pesel;
    this.dateOfBirth = dateOfBirth;
    this.phoneNumber = phoneNumber;
    this.email = email;
    this.ID = ID;
    this.specialties = specialties;
  }

  public String getID() {
    return ID;
  }

  public void addSpecialty(Specialty specialty) {
    specialties.add(specialty);
  }

  public List<Specialty> getSpecialties() {
    return specialties;
  }

  private int getAge() {
    LocalDate dateOfBirth = LocalDate.parse(this.dateOfBirth);
    LocalDate now = LocalDate.now();

    return (int) ChronoUnit.YEARS.between(dateOfBirth, now);
  }

  public boolean hasSpecialty(Specialty specialty) {
    for(Specialty curr : specialties) {
      if (curr == specialty) {
        return true;
      }
    }

    return false;
  }

  @Override
  public String toString() {
    return "Lekarz [Imie:" + firstName + ", Nazwisko:" + lastName
        + ", PESEL:" + pesel + ", Data urodzenia:" + dateOfBirth + ", wiek:" + getAge()
        + ", numer telefonu:" + phoneNumber + ", email:" + email + ", identyfikator:" + ID +
        ", specjalizacje:" + specialties + "]";
  }
}
