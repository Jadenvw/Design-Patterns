/*
Flying behavior changes from duck to duck.
Design Principle: Determine what varies in your system and separate it from what stays the same.
By encapsulating Flying behavior in an interface, the system is more flexible to change
*/

package chapterOne.ducks.behavior;

public interface FlyBehavior {
    public void fly();
}
