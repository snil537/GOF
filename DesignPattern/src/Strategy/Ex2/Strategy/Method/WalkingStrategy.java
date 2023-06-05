package Strategy.Ex2.Strategy.Method;

import Strategy.Ex2.Strategy.Interface.MovingStrategy;

public class WalkingStrategy implements MovingStrategy {
    public void move(){
        System.out.println("I can only walk.");
    }
}
