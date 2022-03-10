package hw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число");
        int userNum;
        int sum = 0;
        int currentDigit;

        while (true){
            userNum = in.nextInt();
            currentDigit = userNum % 10;
            sum = sum + currentDigit;

            userNum = userNum /10;
            sum = sum + userNum;
            if (userNum == 0) break;
            System.out.println(sum);
        }
    }
}
