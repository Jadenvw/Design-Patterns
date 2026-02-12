package chapterOne.adventure;

import chapterOne.adventure.behavior.AxeBehavior;

public class Troll extends Character {

    public Troll() {
        weapon = new AxeBehavior();
    }

    @Override
    public void fight() {
        weapon.useWeapon();
    }
}
