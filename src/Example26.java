import java.util.Scanner;

public class Example26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce a number: ");
        int number  = scanner.nextInt();

        System.out.print("The divisors of " + number + " are: ");

        for (int i=1; i <= number; i++){
            if (number % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
