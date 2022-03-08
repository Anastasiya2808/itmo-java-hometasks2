package hw2;

public class Task3 {
    public static void main(String[] args) {
        int sought = 500;
        int firstNum = 25;
        int lastNum = 200;

        if (sought >= firstNum && sought <= lastNum) {
            System.out.println("Число " + sought + " содержится в интервале");
        } else if (sought <= firstNum || sought >= lastNum){
            System.out.println("Число " + sought + " не содержится в интервале");
        }
    }
}
