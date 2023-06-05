package Strategy.Ex1;

public class Sungard extends Robot{
    public Sungard(String name){
        super(name);
    }
    public void attack(){
        System.out.println("I have Missile");
    };
    public void move(){
        System.out.println("I can only walk");
    };
}
