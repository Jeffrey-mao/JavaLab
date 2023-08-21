package Answers.C2;

import java.util.Scanner;

public class q16 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input side: ");
        double side = input.nextDouble();
        System.out.print("The area is " + ((3 * Math.pow(3, 0.5))/2) * side * side);
        input.close();
    }

}
