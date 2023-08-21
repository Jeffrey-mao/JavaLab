package Answers.C2;

import java.util.Scanner;

public class q23 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter distance: ");
            double distance = input.nextDouble();
            System.out.print("Enter gallons: ");
            double gallons = input.nextDouble();
            System.out.print("Enter price: ");
            double price = input.nextDouble();

            System.out.print("Your cost will be " + distance / gallons * price);
            input.close();
        }

    }



