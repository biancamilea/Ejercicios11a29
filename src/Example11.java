import java.util.Arrays;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce number 1: ");
        int number1 = scanner.nextInt();
        System.out.println("Introduce number 2: ");
        int number2 = scanner.nextInt();

        if(number1 > number2){
            System.out.println(number2 + " " + number1);
        }else{
            System.out.println(number1 + " " + number2);
        }
    }
}
