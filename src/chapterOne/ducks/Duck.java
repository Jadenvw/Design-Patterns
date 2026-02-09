package chapterOne.ducks;
/*
abstract classes are meant to be incomplete by design
Duck is not created directly but is meant to be extended by other classes
The duck class is an abstraction that models a simplified, high-level concept of a duck in the context of the
system by defining its behavior and contracts while hiding implementation details
*/

/*
Now that we have seen the issues that can occur by implementing fly and quack in Duck
we must change the Duck class to delegate its flying and quacking behaviors.
*/

import chapterOne.ducks.behavior.FlyBehavior;
import chapterOne.ducks.behavior.QuackBehavior;

public abstract class Duck {

    // Create instance variables for Duck behaviors
    // Concrete duck objects will assign these at runtime
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Duck() { }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public abstract void display();

    // behaviors are delegated to the object referenced by each behavior
    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    // These methods allow us to dynamically change behaviors "on the fly"
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

}


// ------ initial duck implementation --------
/*
public abstract class Duck {

    public void quack() {
        System.out.println("Quack");
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    // abstract method: subclasses must provide their own version
    // i.e, duck doesn't define how to display a mallard
    public abstract void display();

    // ------ Original idea to make ducks fly --------
    // Should all subclasses of ducks be able to fly? How about rubber duckies?
    public void fly() {
        System.out.println("All ducks can fly!");
    }
    // What's wrong with this?
    // 1. Duck is claiming behavior that is not universally true
    // 2. Subclasses are forced to display inherited behavior
    // 3. We can't safely assume all Ducks can fly or quack
}
*/
