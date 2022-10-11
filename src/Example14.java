import java.util.Arrays;
import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce number 1: ");

        int number1 = scanner.nextInt();
        System.out.println("Introduce number 2: ");
        int number2 = scanner.nextInt();
        System.out.println("Introduce number 3: ");
        int number3 = scanner.nextInt();

        int [] numbers = {number1, number2, number3};
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
