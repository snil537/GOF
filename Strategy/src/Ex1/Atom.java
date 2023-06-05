package Ex1;

public class Atom extends Robot{
    public Atom(String name){
        super(name);
    }
    public void  attack(){
        System.out.println("I have a Strong punch");
    }
    public void move(){
        System.out.println("I can fly");
    }
}
