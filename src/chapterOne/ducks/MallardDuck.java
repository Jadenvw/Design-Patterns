/*
We must update the MallardDuck class so the responsibility for quacking is
delegated to the Quack object and flying is delegated to FlyWithWings
*/

package chapterOne.ducks;

import chapterOne.ducks.behavior.FlyWithWings;
import chapterOne.ducks.behavior.Quack;

public class MallardDuck extends Duck {
    // When a MallardDuck is instantiated, its constructor initializes the MallardDuck's
    // inherited quackBehavior instance var to a new instance of type Quack and the
    // flyBehavior instance var to FlyWithWings
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
