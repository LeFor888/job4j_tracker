package ru.job4j.profession;

public class Doctor extends Profession {

    private String specialization;
    private boolean labCoat;

    public Doctor() {
        super();
    }

    public Doctor(String name, String surname, String education, String birthday, String specialisation, boolean labCoat) {
        super(name, surname, education, birthday);
        this.specialization = specialization;
        this.labCoat = labCoat;
    }

    public Diagnosis heal(Pacient pacient) {
        Diagnosis diagnosis = new Diagnosis();
        return diagnosis;
    }
}
