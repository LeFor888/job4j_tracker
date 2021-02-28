package ru.job4j.oop;

public class BallStory {
    public void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        hare.tryToEat(ball);
        ball.escape(hare);
        wolf.tryToEat(ball);
        ball.escape(wolf);
        fox.tryToEat(ball);
        ball.eaten(fox);
    }
}
