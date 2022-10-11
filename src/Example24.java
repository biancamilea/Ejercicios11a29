import java.util.Scanner;

public class Example24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int factorial = 1;

        System.out.println("Introduce a number: ");
        int number = scanner.nextInt();

        for(int i=1; i <= number; i++){
            factorial *= factorial * i;
        }
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
