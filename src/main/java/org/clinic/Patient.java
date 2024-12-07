package org.clinic;

public class Patient {

    private String firstName;
    private String lastName;
    private String pesel;
    private String dateOfBirth;
    private short age;
    private String phoneNumber;
    private String email;


    public Patient(String firstName, String lastName, String pesel, String dateOfBirth, short age, String phoneNumber, String email) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.pesel = pesel;
            this.dateOfBirth = dateOfBirth;
            this.age = age;
            this.phoneNumber = phoneNumber;
            this.email = email;
    }
    public String getPesel() {
        return pesel;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Pacjent [Imie:" + firstName + ", Nazwisko:" + lastName
                + ", PESEL:" + pesel + ", Data urodzenia:" + dateOfBirth + ", wiek:" + age
                + ", numer telefonu:" + phoneNumber + ", email:" + email + "]";
    }
}
