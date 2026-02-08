package ducks;
// abstract classes are meant to be incomplete by design
// Duck is not created directly but is meant to be extended by other classes

// The duck class is an abstraction that models a simplified, high-level concept of a duck in the context of the
// system by defining its behavior and contracts while hiding implementation details
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
}
