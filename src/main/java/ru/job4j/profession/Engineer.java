package ru.job4j.profession;

public class Engineer extends Profession {

    private int experience;

    public Engineer() {
        super();
    }

    public Engineer(String name, String surname, String education, String birthday, int experience) {
        super(name, surname, education, birthday);
        this.experience = experience;
    }

    public Project creating(Client client) {
        Project project = new Project();
        return project;
    }
}
