package org.clinic;

import java.util.List;

public class Physician extends Person {
  private String ID;
  private List<Specialty> specialties;


  public Physician(
      String firstName,
      String lastName,
      String pesel,
      String dateOfBirth,
      String phoneNumber,
      String email,
      String ID,
      List<Specialty> specialties
  ) {
    super(firstName, lastName, pesel, dateOfBirth, phoneNumber, email);

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

  public boolean hasSpecialty(Specialty specialty) {
    for (Specialty curr : specialties) {
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
