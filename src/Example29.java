import java.util.Scanner;

public class Example29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        while(firstNumber >= secondNumber){
            firstNumber -= secondNumber;
        }

        System.out.println("The remainder is: " + firstNumber);
    }

}
