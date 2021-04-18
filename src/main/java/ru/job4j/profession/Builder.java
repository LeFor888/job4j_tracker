package ru.job4j.profession;

public class Builder extends Engineer {

    private boolean hardHat;

    public Builder() {
    }

    public Builder(String name, String surname, String education, String birthday, int experience) {
        super(name, surname, education, birthday, experience);
        this.hardHat = hardHat;
    }

    public Building constructionWork(Client client){
        Building building = new Building();
        return building;
    }
}
