package Answers.C2;

import java.util.Scanner;

public class q12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please input speed and acceleration: ");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();
        System.out.println("The minumum length for taking off is: " + speed * speed / (2 * acceleration) );
    }


}
