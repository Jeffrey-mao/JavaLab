package Answers.C2;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHours = totalHours % 24;
        Scanner input = new Scanner(System.in);
        System.out.println("Please input your local timeZone compared to GMT with +/- integers: ");
        int timeZone = input.nextInt();
        long newHours = currentHours + timeZone;
        System.out.print("The current time is " + newHours + ":" + currentMinutes + ":" + currentSeconds);

    }
}
