package chapterOne.adventure;

import chapterOne.adventure.behavior.BowAndArrowBehavior;

public class Queen extends Character {
    public Queen () {
        weapon = new BowAndArrowBehavior();
    }

    @Override
    public void fight() {
        weapon.useWeapon();
    }
}
