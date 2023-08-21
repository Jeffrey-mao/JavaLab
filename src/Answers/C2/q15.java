package Answers.C2;

import java.util.Scanner;

public class q15 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input x1, x2, y1, y2 accordingly: ");
        double x1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        System.out.print(Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5));
    }

}
