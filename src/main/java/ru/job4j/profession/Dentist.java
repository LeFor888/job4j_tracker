package ru.job4j.profession;

public class Dentist extends Doctor {

    private int numOfDrills;

    public Dentist() {
    }

    public Dentist(String name, String surname, String education, String birthday, String specialisation, boolean labCoat) {
        super(name, surname, education, birthday, specialisation, labCoat);
        this.numOfDrills = numOfDrills;
    }

    public Bill payment(Pacient pacient) {
        Bill bill = new Bill();
        return bill;
    }
}
