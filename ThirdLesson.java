package lesson3;

import java.util.Scanner;

public class ThirdLesson {
    public static void main(String[] args) {

        // Пользовательский ввод
        Scanner in = new Scanner(System.in); //java.util.Scanner - в папке
        System.out.println("Введите целое число");
        int userNem = in.nextInt(); // вернет число введенное с клавы число
        System.out.println(userNem * userNem);


        while (true){ // while (true) - бесконечный цикл
            System.out.println("Введите целое положительно число " + " или 0 для выхода из программы");
            userNem = in.nextInt();
            if (userNem == 0) break; // break - для выхода из текущего цикла
            if (userNem < 0) continue; // continue - переход на следующую интерацию
            System.out.println(userNem * userNem);
            }


        do { //
            System.out.println("Введите целое положительно число " + " или 0 для выхода из программы");
            userNem = in.nextInt(); // число, которое вводит клиент
            if (userNem < 0) continue;
            System.out.println(userNem * userNem);
        } while (userNem != 0);


        int start = 1, end = 12;
        // вывести все четные числа от start до end
        // четное число % 2 == 0
        // 2, 4, 6, 8, 10, 12
        while (start <= end){
            if (start % 2 == 0) System.out.println(start);
            start += 1;
        }

        // for цикл
        //for (;;) - бесконечный цикл
        // for ( инициализация переменных ; булевое выражение (условие); обновление значений переменных )

        for (start = 1, end = 12; // инициализация переменных (1)- раз
             start <= end; // булевое выражение (условие) (2) - если true - проверка условий....
             start += 1) // обновление значений переменных (3) - обновление счетчика
        {
            if (start % 2 == 0) System.out.println(start);
        }
        // for (start = 1, end = 12; start <= end; start += 1)

        // вывести все неотрицательные элементы последовательности
        // 90 85 80 75 70 65 и тд


       // int num = 90;
        for ( int num = 90; num >= 0; num = num - 5){
            System.out.println(num);
        }

        //вывести на экран первые 10 элементов последовательности
        // 2 4 6 8 10 и тд (for)
        int n = 10;

        for (int count = 0, num = 2; count < 10; num += 1, num += 2){
            System.out.println(num);
        }

        // задача на цикл while

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество тарелок");
        int plates = scanner.nextInt();
        System.out.println("Введите количество моющего средства");
        double fairy = scanner.nextInt();

        while (fairy >= 0.5 && plates >= 1){
            fairy -=0.5;
            plates -= 1;
            System.out.println(fairy);
        }
        System.out.println(fairy);
        System.out.println(plates);
    }
}
