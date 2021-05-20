package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ivan Ivanov");
        student.setGroup("H125");
        student.setDate("01.09.20");

        System.out.println("Name: " + student.getName() + System.lineSeparator() +
                "Group: " + student.getGroup() + System.lineSeparator() +
                "Student since: " + student.getDate());
    }
}
