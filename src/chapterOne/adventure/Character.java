package chapterOne.adventure;

import chapterOne.adventure.behavior.WeaponBehavior;

public abstract class Character {
    WeaponBehavior weapon;

    public Character() {}

    public void setWeaponBehavior(WeaponBehavior w) {
        this.weapon = w;
    }

    public abstract void fight ();
}
