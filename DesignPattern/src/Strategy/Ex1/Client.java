package Strategy.Ex1;

public class Client {
    public static void main(String[] args) {
        Robot taekwonV = new TaekwonV("TaekwonV");
        Robot atom = new Atom("Atom");
        Robot sungard = new Sungard("Sungard");

        System.out.println("My name is" + taekwonV.getName());
        taekwonV.move();
        taekwonV.attack();

        System.out.println();
        System.out.println("My name is " + atom.getName());
        atom.move();
        atom.attack();

        System.out.println();
        System.out.println("My name is " + sungard.getName());
        sungard.move();
        sungard.attack();
    }
}
