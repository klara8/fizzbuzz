import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int delenoTrema = 3;
        int delenoPeti = 5;
        int delenoTremaAPeti = 3*5;


        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();


        if(number%delenoTremaAPeti == 0){
            System.out.println("FizzBuzz");
        }
        else if(number%delenoTrema == 0){
            System.out.println("Buzz");
        }
        else if (number%delenoPeti == 0) {
            System.out.println("Fizz");
        }
        else System.out.println(number);


    }
}