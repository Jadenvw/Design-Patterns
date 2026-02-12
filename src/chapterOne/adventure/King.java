package chapterOne.adventure;

import chapterOne.adventure.behavior.KnifeBehavior;

public class King extends Character {

    public King() {
        weapon = new KnifeBehavior();
    }

    @Override
    public void fight() {
        weapon.useWeapon();
    }
}
