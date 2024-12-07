package org.clinic;

public class Specialty {
    private String nameSpecialty;

    public Specialty(String nameSpecialty) {
        this.nameSpecialty = nameSpecialty;
    }

    public String getNameSpecialty() {
        return nameSpecialty;
    }

    @Override
    public String toString() {
        return "personel medyczny [Specjalizacja:" + nameSpecialty + "]";
    }
}
