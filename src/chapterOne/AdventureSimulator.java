/*
Character class will be an abstraction for character-based classes to extend
** Character gets the setWeapon method so each extension can alter fighting behavior at runtime
WeaponBehavior will act as an interface to enable us to implement different fighting behaviors
** WeaponBehavior for characters varies in our system so we don't want to use inheritance but instead composition
Queen, King, Knight, Troll all extend Character and each "HAS-A" specific fighting behavior (concrete classes)
Knife, Sword, BowAndArrow, Axe all implement the WeaponBehavior interface (concrete classes)
*/

package chapterOne;

import chapterOne.adventure.*;
import chapterOne.adventure.Character;
import chapterOne.adventure.behavior.*;

public class AdventureSimulator {
    public static void main(String[] args) {
        Character queen = new Queen();
        queen.fight();
        queen.setWeaponBehavior(new KnifeBehavior());
        queen.fight();

        System.out.println();

        Character king = new King();
        king.fight();
        king.setWeaponBehavior(new AxeBehavior());
        king.fight();
    }
}
