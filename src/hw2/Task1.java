package hw2;

public class Task1 {
    public static void main(String[] args) {
        int count = 50;

        if (count > 0 && count < 40){
            System.out.println("Попробуй в следующий раз");
        } else if (count > 39 && count < 60){
            System.out.println("Удовлетворительно");
        } else if (count > 59 && count < 90){
            System.out.println("Хорошо");
        } else if (count > 89 && count < 101){
            System.out.println("Отлично");
        } else {
            System.out.println("Ошибка");
        }
    }
}
