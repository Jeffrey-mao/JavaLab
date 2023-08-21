package Answers.C2;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input minutes: ");
        int minutes = input.nextInt();
        int years = minutes / 525600;
        int remainingMinutes = minutes % 525600;
        int days = remainingMinutes / 1440;
        System.out.println(minutes + " minutes equal to " + years + " years and " + days + " days.");
        input.close();

    }
}
