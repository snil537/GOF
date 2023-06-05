package Strategy.Ex2.Strategy.Method;

import Strategy.Ex2.Strategy.Interface.AttackStrategy;

public class PunchStrategy implements AttackStrategy {
    public void attack(){
        System.out.println("I have strong punch.");
    }
}
