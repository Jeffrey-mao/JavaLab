package Answers.C2;

import java.util.Scanner;

public class q22 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total money as penny: ");
        int penny = input.nextInt();
        int dollar = penny / 100;
        int remainingPenny = penny % 100;
        System.out.print("You have " + dollar + " dollars and " + remainingPenny + " pennies");
        input.close();
    }

}
