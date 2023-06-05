package Strategy.Ex3.Weapon;

import Strategy.Ex3.WeaponType;

public class Sword implements WeaponType {
    @Override
    public void attack() {
        System.out.println("검 공격");
    }
}
