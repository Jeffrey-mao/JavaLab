package Answers.C2;

import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input monthly saving: ");
        double saving = input.nextDouble();
        double total1 = saving * 1.00417;
        double total2 = (saving + total1) * 1.00417;
        double total3 = (saving + total2) * 1.00417;
        double total4 = (saving + total3) * 1.00417;
        double total5 = (saving + total4) * 1.00417;
        double total6 = (saving + total5) * 1.00417;
        System.out.println("The 6th saving is: " + total6);
    }
}
