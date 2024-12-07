package org.clinic;

public class Main {
    public static void main(String[] args) {
        Clinic clinic = new Clinic();
        clinic.addPatient(new Patient("Natalia", "Nowakowska", "01212413167", "2001-01-24", (short)23, "123456780", "natalia@example.com"));
        clinic.addPatient(new Patient("Anna", "Kowalska", "12345678901", "1990-05-10", (short)34, "123456789", "anna@example.com"));
        clinic.addPatient(new Patient("Jan", "Nowak", "98765432109", "1985-03-20", (short)39, "987654321", "jan@example.com"));
        clinic.addPatient(new Patient("Maria", "Kowalska", "12312312312", "2000-11-15", (short)23, "555555555", "maria@example.com"));


        System.out.println(clinic.findPatientByPesel("98765432109"));
        System.out.println(clinic.findPatientByLastName("Kowalska"));

        MedicalStaff medicalStaff1 = new MedicalStaff("Anna", "Kowalska", "12345678942", "1999-12-02", (short) 25, "666666666", "anna.kowalska@example.com", "001", "Kardiolog");
        medicalStaff1.addspecialty(new Specialty("Ginekolog"));

        System.out.println(medicalStaff1);
    }

}