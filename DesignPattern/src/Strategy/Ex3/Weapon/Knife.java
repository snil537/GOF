package Strategy.Ex3.Weapon;

import Strategy.Ex3.WeaponType;

public class Knife implements WeaponType {

    @Override
    public void attack() {
        System.out.println("칼 공격");
    }
}
