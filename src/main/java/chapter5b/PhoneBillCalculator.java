package chapter5b;

import java.util.Scanner;

public class PhoneBillCalculator {
    public static void main(String args[]){

        System.out.println("Enter base cost of the plan:");
        Scanner scanner = new Scanner(System.in);
        double baseCost = scanner.nextDouble();

        System.out.println("Enter overage minutes:");
        double overageMins = scanner.nextDouble();

        double charges = calculateCharges(overageMins);
        double tax = calculateTax(baseCost + charges);

        calculateAndPrintTotal(baseCost, tax, charges);


    }

    private static double calculateTax(double subtotal){
        double tax;
        tax = subtotal * 0.15;

        return tax;
    }

    private static double calculateCharges(double minutes){
        double charges;
        charges = minutes * 0.25;

        return charges;
    }

    private static void calculateAndPrintTotal(double base, double tax, double charges){
        double total;

        total = base + tax + charges;

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + String.format("%.2f", base));
        System.out.println("Overage: $" + String.format("%.2f", charges));
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", total));



    }
}
