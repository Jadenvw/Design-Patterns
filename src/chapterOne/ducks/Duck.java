package chapterOne.ducks;
// abstract classes are meant to be incomplete by design
// Duck is not created directly but is meant to be extended by other classes

// The duck class is an abstraction that models a simplified, high-level concept of a duck in the context of the
// system by defining its behavior and contracts while hiding implementation details
public abstract class Duck {
    // ------ initial duck implementation --------
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
