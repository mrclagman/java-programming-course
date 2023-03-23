package chapter10;

public class Orange extends Fruit{
    public void removeSeeds(){
        System.out.println("Removing orange seeds!");
    }

    public Orange(double calories) {
        super(calories);
    }

    @Override
    public void makeJuice(){
        System.out.println("Orange Juice is made");
    }
}
