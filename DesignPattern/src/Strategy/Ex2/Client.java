package Strategy.Ex2;

import Strategy.Ex2.Robot.Atom;
import Strategy.Ex2.Robot.Robot;
import Strategy.Ex2.Robot.TaekwonV;
import Strategy.Ex2.Strategy.Method.FlyingStrategy;
import Strategy.Ex2.Strategy.Method.MissileStrategy;
import Strategy.Ex2.Strategy.Method.PunchStrategy;
import Strategy.Ex2.Strategy.Method.WalkingStrategy;

public class Client {
    public static void main(String[] args) {
        Robot taekwonV = new TaekwonV("TaekwonV");
        Robot atom = new Atom("Atom");

    /*수정된 부분: 전략 변경 방법*/
    taekwonV.setMovingStrategy(new WalkingStrategy());
    taekwonV.setAttackStrategy(new MissileStrategy());
    atom.setMovingStrategy(new FlyingStrategy());
    atom.setAttackStrategy(new PunchStrategy());

    /*아래부터는 동일*/
    System.out.println("My name is " + taekwonV.getName());
    taekwonV.move();
    taekwonV.attack();

    System.out.println();
    System.out.println("My name is " + atom.getName());
    atom.move();
    atom.attack();
    }
}
