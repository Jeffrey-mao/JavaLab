package Answers.C2;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please input cylinder's radius, and then length:");
        double radius=input.nextDouble();
        double length=input.nextDouble();
        double area= radius*radius*Math.PI;
        double volume =area*length;
        System.out.println("The area is "+area+" and the volume is "+volume);

    }
}
