package chapterOne.ducks;

// New class to show flaws with inheritance from Duck superclass
public class RubberDuck extends Duck {

//    @Override
//    public void quack() {
//        System.out.println("Squeak");
//    }
//
//    // Overriding behavior to undo inheritance is a red flag
//    @Override
//    public void fly() {
//        // Rubber ducks can't fly
//        // Do anything or throw an exception?
//    }

    @Override
    public void display() {
        System.out.println("I'm a rubber duck");
    }
}
