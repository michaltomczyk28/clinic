package org.clinic;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Person {
  protected String firstName;
  protected String lastName;
  protected String pesel;
  protected String dateOfBirth;
  protected String phoneNumber;
  protected String email;

  public Person(
      String firstName,
      String lastName,
      String pesel,
      String dateOfBirth,
      String phoneNumber,
      String email
  ) {
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

  protected int getAge() {
    LocalDate dateOfBirth = LocalDate.parse(this.dateOfBirth);
    LocalDate now = LocalDate.now();

    return (int) ChronoUnit.YEARS.between(dateOfBirth, now);
  }
}
