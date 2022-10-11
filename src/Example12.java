import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce the first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Introduce the second number");
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber){
            System.out.println("The biggest number is " + firstNumber);
        }else{
            System.out.println("The biggest number is " + secondNumber);
        }
    }
}
