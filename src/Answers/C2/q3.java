package Answers.C2;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input feet: ");
        double feet = input.nextDouble();
        double meter = feet * 0.305;
        System.out.println(feet + " feets equal to " + meter + " meters");
        input.close();
    }

}
