package Adapter.Ex1;

public class main {
    public static void main(String[] args) {
        Adapter adapter = new AdapterImpl();
        System.out.println(adapter.twiceOf(100f));//200
        System.out.println(adapter.halfOf(50f));//25
    }
}
