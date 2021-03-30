package ru.job4j.oop;

public class Error {

    private boolean active;

    private int status;

    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Error: " + active);
        System.out.println("Status: " + status);
        System.out.println("Error message: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error(true, 404, "Page Not Found");
        error.printInfo();
        Error error1 = new Error();
        error1.printInfo();
    }
}
