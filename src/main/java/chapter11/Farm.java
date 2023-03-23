package chapter11;

public class Farm {
    public static void main(String[] args){
        Animal donald = new Duck();
        donald.makeSound();

        Duck daffy = new Duck();
        daffy.makeSound();
        daffy.eat();

        Pig porky = new Pig();
        porky.makeSound();
        porky.eat();
    }
}
