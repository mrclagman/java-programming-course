package chapter12;
import java.util.*;


public class CollectionsDemo {
    public static void main (String[] args){
        setDemo();
//        listDemo();
//        queueDemo();
        mapDemo();
    }

    public static void setDemo(){
//        Set fruit = new HashSet();
        Set<String> fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        var i = fruit.iterator();
//        while(i.hasNext())
//            System.out.println(i.next());

//        for (String item: fruit){
//            System.out.println(item);
//        }

        //Lambda
        fruit.forEach(x -> System.out.println(x));
        fruit.forEach(System.out::println);

    }

    public static void mapDemo(){

//        Map fruitCalories = new HashMap();
        Map<String,Integer> fruitCalories = new HashMap();

        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.put("lemon", 17);

        for(var entry : fruitCalories.entrySet()){
            System.out.println(entry.getValue());
        }

        fruitCalories.forEach(
                (k,v)->System.out.println("Fruit: " + k + ", Calories: " + v));
    }
}
