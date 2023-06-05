package Strategy.Ex3.Character;

import Strategy.Ex3.WeaponType;

public class GameCharacter {
    //접근점
    private WeaponType weapon;

    //교환 가능
    public void setWeapon(WeaponType weapon){
        this.weapon = weapon;
    }
    public void attack(){
        if(weapon == null){
            System.out.println("맨손 공격");
        }else{
            //위임(Delegate)
            weapon.attack();
        }
    }
}
