package org.clinic;

public class Patient extends Person {
  public Patient(
      String firstName,
      String lastName,
      String pesel,
      String dateOfBirth,
      String phoneNumber,
      String email
  ) {
    super(firstName, lastName, pesel, dateOfBirth, phoneNumber, email);
  }

  @Override
  public String toString() {
    return "Pacjent [Imie:" + firstName + ", Nazwisko:" + lastName
        + ", PESEL:" + pesel + ", Data urodzenia:" + dateOfBirth + ", wiek:" + getAge()
        + ", numer telefonu:" + phoneNumber + ", email:" + email + "]";
  }
}
