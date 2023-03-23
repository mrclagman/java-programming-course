package chapter10;

public class Apple extends Fruit{
    public void peel(){
        System.out.println("Removing apple skin!");
    }

    public Apple(double calories) {
        super(calories);
    }

    @Override
    public void makeJuice(){
        System.out.println("Apple Juice is made");
    }
}
