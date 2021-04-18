package ru.job4j.profession;

public class Surgeon extends Doctor {

    private int assistants;

    public Surgeon() {
    }

    public Surgeon(String name, String surname, String education, String birthday, String specialisation, boolean labCoat) {
        super(name, surname, education, birthday, specialisation, labCoat);
        this.assistants = assistants;
    }

    public Surgery operation(Pacient pacient) {
        Surgery surgery = new Surgery();
        return surgery;
    }
}
