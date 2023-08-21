package Answers.C2;

import java.util.Scanner;

public class q17 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature(Fahrenheit, between -58 and 41), and wind spped(>= 2): ");
        double temp = input.nextDouble();
        double speed = input.nextDouble();
        System.out.print("The wind chill index is " + (35.74 + 0.6215 * temp - 35.75 * Math.pow(speed, 0.16) + 0.4275 * temp * Math.pow(speed, 0.16)));
        input.close();
    }

}
