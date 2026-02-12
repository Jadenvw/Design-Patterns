/*
Design principle: Identify the aspects of your application that very and separate them from
what stays the same. (Encapsulate parts that vary -> fewer unintended consequences and more flexible systems)

Design principle: Favor composition over inheritance.
- Creating systems using composition gives you more flexibility and lets you change behavior at runtime
*/

package chapterOne;

import chapterOne.ducks.*;
import chapterOne.ducks.behavior.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        // calls MallardDuck's inherited behavior related methods delegated by each behavior object
        mallard.performQuack();
        mallard.performFly();

        System.out.println();

        Duck model = new ModelDuck();
        model.performFly(); // delegates behavior to instance set in constructor
        model.setFlyBehavior(new FlyRocketPowered()); // invokes inherited behavior
        model.performFly();// dynamically changes behavior to rocket powered

        // ----------- Ad
    }
}


/*
public class MiniDuckSimulator {
    public static void main(String[] args) {
        // Duck duck = new Duck();
        // cannot create an abstract object

        Duck mallard = new MallardDuck();
        // inherited "as-is" from Duck
        mallard.quack();
        mallard.swim();
        // inherits fly from Duck
        mallard.fly();
        // Abstract method display behavior implemented by MallardDuck
        mallard.display();

        System.out.println();

        Duck redhead = new RedheadDuck();
        // inherited "as-is" from Duck
        redhead.quack();
        redhead.swim();
        redhead.fly();
        // Abstract method display behavior implemented by RedheadDuck
        redhead.display();

        System.out.println();

        // Core OO principle: A subclass should be substitutable for its superclass w/o changing expected behavior
        Duck rubber = new RubberDuck();
        // RubberDuck class was forced to override assumed behavior
        rubber.quack();
        // inherited "as-is" from Duck
        rubber.swim();
        // override inheritance to do nothing
        rubber.fly();
        // Abstract method display behavior implemented by RubberDuck
        rubber.display();
    }
}
*/