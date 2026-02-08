package chapterOne.ducks;

public class DecoyDuck extends Duck {

    @Override
    public void quack() {
        // override to do nothing
    }

    @Override
    public void display() {
        System.out.println("I am a decoy duck!");
    }

    @Override
    public void fly() {
        // override to do nothing
    }
}
