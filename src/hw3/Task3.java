package hw3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        double randomValue =(int) (1 + Math.random() * 8);
        System.out.println("Введите загаданное число: ");
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();

        for (int i = 1; i < 9; i++) {
            if (randomValue > count) {
                System.out.println("Загаданное число меньше > твоего ");
                int number2 = in.nextInt();

            } else if (randomValue < count) {
                System.out.println("Загаданное число меньше < твоего ");
                int number3 = in.nextInt();

            } else {
                System.out.println("Верно!" + randomValue + " загаданное число");
            }
        }
    }
}
