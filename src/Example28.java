import java.util.Scanner;

public class Example28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        for(int i=1; i <= firstNumber; i++){
            sum += secondNumber;
        }
        System.out.println("The multiplication of " + firstNumber + " and "+ secondNumber + " is: " + sum);
    }
}
