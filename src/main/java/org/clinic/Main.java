package org.clinic;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    Clinic clinic = new Clinic();
    clinic.addPatient(
        new Patient("Natalia", "Nowakowska", "01212413167", "2001-01-24", "123456780",
            "natalia@example.com"));
    clinic.addPatient(
        new Patient("Anna", "Kowalska", "12345678901", "1990-05-10", "123456789",
            "anna@example.com"));
    clinic.addPatient(
        new Patient("Jan", "Nowak", "98765432109", "1985-03-20", "987654321",
            "jan@example.com"));
    clinic.addPatient(
        new Patient("Maria", "Kowalska", "12312312312", "2000-11-15", "555555555",
            "maria@example.com"));


    System.out.println("findPatientByPesel: 98765432109");
    System.out.println(clinic.findPatientByPesel("98765432109"));
    System.out.println();

    System.out.println("findPatientsByLastName: Kowalska");
    System.out.println(clinic.findPatientsByLastName("Kowalska"));
    System.out.println();

    clinic.addPhysician(
        new Physician("Katarzyna", "Wiśniewska", "93071065789", "1993-07-10", "503216879",
            "katarzyna.wisniewska93@example.com", "001", List.of(Specialty.CARDIOLOGY))
    );

    clinic.addPhysician(
        new Physician("Piotr", "Kamiński", "78021578456", "1978-02-15", "601495782",
            "piotr.kaminski78@example.com", "002", List.of(Specialty.DENTISTRY))
    );

    clinic.addPhysician(
        new Physician("Magdalena", "Lewandowska", "91050145632", "1991-05-01", "794628150",
            "magdalena.lewandowska91@example.com", "003",
            List.of(Specialty.CARDIOLOGY, Specialty.ONCOLOGY))
    );

    clinic.addPhysician(
        new Physician("Tomasz", "Zieliński", "80032098754", "1980-03-20", "728394651",
            "tomasz.zielinski80@example.com", "004", List.of(Specialty.UROLOGY))
    );

    System.out.println("findPhysicianById: 001");
    System.out.println(clinic.findPhysicianById("001"));
    System.out.println();

    System.out.println("findPhysiciansBySpecialty: DENTISTRY");
    System.out.println(clinic.findPhysiciansBySpecialty(Specialty.DENTISTRY));
    System.out.println();

    System.out.println("findPhysiciansBySpecialty: CARDIOLOGY");
    System.out.println(clinic.findPhysiciansBySpecialty(Specialty.CARDIOLOGY));
    System.out.println();
  }

}