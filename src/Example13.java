import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        int bigger,temp;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter the third number");
        int thirdNumber = scanner.nextInt();

        temp = firstNumber > secondNumber ? firstNumber : secondNumber;
        bigger = thirdNumber > temp ? thirdNumber : temp;
        System.out.println("The bigger number is: " +bigger);
    }
}
