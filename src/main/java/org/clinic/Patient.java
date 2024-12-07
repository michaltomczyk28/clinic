package org.clinic;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Patient {

  private String firstName;
  private String lastName;
  private String pesel;
  private String dateOfBirth;
  private String phoneNumber;
  private String email;


  public Patient(String firstName, String lastName, String pesel, String dateOfBirth,
                 String phoneNumber, String email) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.pesel = pesel;
    this.dateOfBirth = dateOfBirth;
    this.phoneNumber = phoneNumber;
    this.email = email;
  }

  public String getPesel() {
    return pesel;
  }

  public String getLastName() {
    return lastName;
  }

  private int getAge() {
    LocalDate dateOfBirth = LocalDate.parse(this.dateOfBirth);
    LocalDate now = LocalDate.now();

    return (int) ChronoUnit.YEARS.between(dateOfBirth, now);
  }

  @Override
  public String toString() {
    return "Pacjent [Imie:" + firstName + ", Nazwisko:" + lastName
        + ", PESEL:" + pesel + ", Data urodzenia:" + dateOfBirth + ", wiek:" + getAge()
        + ", numer telefonu:" + phoneNumber + ", email:" + email + "]";
  }
}
