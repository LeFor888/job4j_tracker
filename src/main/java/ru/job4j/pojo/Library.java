package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book lotr = new Book("Lord Of The Rings", 1244);
        Book witcher = new Book("The witcher", 1344);
        Book schildt = new Book("Java: The Complete Reference", 1488);
        Book cleancode = new Book("Clean Code", 464);
        Book[] book = new Book[4];
        book[0] = lotr;
        book[1] = witcher;
        book[2] = schildt;
        book[3] = cleancode;
        for (int index = 0; index < book.length; index++) {
            Book bo = book[index];
            System.out.println(bo.getName() + " - " + bo.getPages());
        }

        System.out.println("Replacement:");
        Book temp = book[0];
        book[0] = book[3];
        book[3] = temp;
        for (int index = 0; index < book.length; index++) {
            Book bo = book[index];
            System.out.println(bo.getName() + " - " + bo.getPages());
        }

        System.out.println("Show only Clean code:");
        for(int index = 0; index < book.length; index++) {
            Book bo = book[index];
            if (book[index].equals(cleancode)) {
                System.out.println(bo.getName() + " - " + bo.getPages());
            }
        }
    }
}
