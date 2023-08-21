package Answers.C2;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please input your Celsius temperature: ");
        double celsius=input.nextDouble();
        double fahrenheit=(9.0/5)*celsius +32;
        System.out.println(celsius + " Celsius is "+fahrenheit+" Fahrenheit");


    }
}
