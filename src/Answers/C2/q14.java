package Answers.C2;

import java.util.Scanner;

public class q14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input height in inches: ");
        double height = scanner.nextDouble();
        System.out.print("Input weight in pounds: ");
        double weight = scanner.nextDouble();
        double BMI = (weight * 0.45359237)/Math.pow(height * 0.0254, 2);
        System.out.printf("Your BMI is " + BMI);
    }

}
