package ru.job4j.profession;

public class Programmer extends Engineer {

    private String programmingLang;

    public Programmer() {
    }

    public Programmer(String name, String surname, String education, String birthday, int experience) {
        super(name, surname, education, birthday, experience);
        this.programmingLang = programmingLang;
    }

    public Task debug(Client client) {
        Task task = new Task();
        return task;
    }
}
