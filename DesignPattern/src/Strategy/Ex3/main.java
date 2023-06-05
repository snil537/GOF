package Strategy.Ex3;

import Strategy.Ex3.Character.GameCharacter;
import Strategy.Ex3.Weapon.Knife;
import Strategy.Ex3.Weapon.Sword;

public class main {
    public static void main(String[] args) {
        GameCharacter character = new GameCharacter();
        character.attack();

        character.setWeapon(new Knife());
        character.attack();

        character.setWeapon(new Sword());
        character.attack();
    }
}
