package hw2;

public class Task4 {
    public static void main(String[] args) {
        int age = 50;
        int exp = 4;

        if (age > 100){
            System.out.println("Мы вам перезвоним");
        } else if (exp < 5){
            System.out.println("Вы подходите на должность стажера");
        } else if (exp >= 5){
            System.out.println("Вы подходите на должность разработчика");
        }
    }
}
