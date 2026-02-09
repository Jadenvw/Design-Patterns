package chapterOne.ducks;

import chapterOne.ducks.behavior.FlyNoWay;
import chapterOne.ducks.behavior.Quack;

public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck!");
    }
}
