package chapter10;

public class Fruit {
    public double calories;
    private final double defaultCal = 10.0;

    public Fruit(){
        this.calories = defaultCal;
    }

    public Fruit(double calories) {
        this.calories = calories;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public void makeJuice(){
        System.out.println("Juice is made");
    }
}
