package chapter12;

import java.util.HashMap;
import java.util.Map;

public class CollateResults {
    public static void main(String[] args){
        Map <String, Integer> originalGrades = TestResults.getOriginalGrades();
        Map <String, Integer> makeUpGrades = TestResults.getMakeUpGrades();

//        System.out.println("Original Grades");
//        originalGrades.forEach(
//                (k,v)->System.out.println("Person: " + k + ", Grade: " + v));
//
//        System.out.println("MakeUp Grades");
//        makeUpGrades.forEach(
//                (k,v)->System.out.println("Person: " + k + ", Grade: " + v));

        for(var student: makeUpGrades.entrySet()){
            Integer firstGrade = originalGrades.get(student.getKey());
            Integer secondGrade = makeUpGrades.get(student.getKey());

            System.out.println(student);
            System.out.println(firstGrade);
            System.out.println(secondGrade);

            if(secondGrade > firstGrade){
                originalGrades.put(student.getKey(), secondGrade);
            }
        }

        System.out.println("Final Grades:");
        originalGrades.forEach(
                (k,v)->System.out.println("Student: " + k + ", Grade: " + v));
    }
}
