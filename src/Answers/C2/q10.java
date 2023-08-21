package Answers.C2;

import java.util.Scanner;

public class q10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please input waterQuantity: ");
        double waterquantity = input.nextDouble();
        System.out.print("Please input initial temp: ");
        double tem0 = input.nextDouble();
        System.out.print("Please input final temp: ");
        double tem1 = input.nextDouble();
        System.out.print("The energy needed is " + waterquantity * (tem1 - tem0) * 4184);
    }

}
