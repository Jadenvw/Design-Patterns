package chapterOne.ducks;

import chapterOne.ducks.behavior.FlyWithWings;
import chapterOne.ducks.behavior.Quack;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Redhead duck");
    }
}
