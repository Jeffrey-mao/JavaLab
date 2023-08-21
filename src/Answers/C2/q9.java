package Answers.C2;

import java.util.Scanner;

public class q9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please input v_0, v_1, and t: ");
        double v_0 = input.nextDouble();
        double v_1 = input.nextDouble();
        double t = input.nextDouble();
        System.out.print("The acceleration is " + (v_1 - v_0) / t);
    }

}
