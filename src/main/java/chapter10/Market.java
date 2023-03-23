package chapter10;

public class Market {
    public static void main (String[] args){
        Fruit apple = new Apple(15.5);
        apple.makeJuice();
        ((Apple) apple).peel();

        Fruit apple2 = new Orange(17.9);
        ((Orange) apple2).removeSeeds();

        Orange orange = new Orange(16.9);
        orange.removeSeeds();
        orange.makeJuice();

    }
}
