package hw2;

public class Task2 {
    public static void main(String[] args) {
        double firstNum = 10;
        double secondNum = 5;
        int operator = 9;
        double res;

        switch (operator){
            case 3:
                res = firstNum + secondNum;
                System.out.println(res);
                break;
            case 5:
                res = firstNum - secondNum;
                System.out.println(res);
                break;
            case 7:
                res = firstNum * secondNum;
                System.out.println(res);
                break;
            case 9:
                res = firstNum / secondNum;
                System.out.println(res);
                break;
            default:
                System.out.println("Ошибка");
        }
    }
}
