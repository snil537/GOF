package Ex1;

public class TaekwonV extends Robot{
    public TaekwonV(String name){
        super(name);
    };
    public void attack(){
        System.out.println("I have Missile.");
    };

    public void move(){
        System.out.println("Ican only walk");
    };
}
