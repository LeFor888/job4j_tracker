package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic vocabulary = new DummyDic();
        String word = vocabulary.engToRus("Safety");
        System.out.println(word);
    }
}
