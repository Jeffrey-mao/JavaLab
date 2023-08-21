package Answers.C2;

import java.util.Scanner;

public class q21 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter balance and interest rate: ");
        double investment = input.nextDouble();
        double annualrate = input.nextDouble();
        double years = input.nextDouble();
        System.out.print(investment * Math.pow(1 + annualrate / 12 / 100, years * 12));
        input.close();
    }

}
