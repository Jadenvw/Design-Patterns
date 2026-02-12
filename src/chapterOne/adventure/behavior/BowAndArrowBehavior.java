package chapterOne.adventure.behavior;

public class BowAndArrowBehavior implements WeaponBehavior {

    @Override
    public void useWeapon () {
        System.out.println("Slinging an arrow with a bow");
    }
}
