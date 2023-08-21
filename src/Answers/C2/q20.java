package Answers.C2;

import java.util.Scanner;

public class q20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter balance and interest rate: ");
        double balance = input.nextDouble();
        double intRate = input.nextDouble();
        System.out.print(balance * (intRate/1200));
        input.close();

    }
}
