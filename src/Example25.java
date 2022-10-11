import java.util.Scanner;

public class Example25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce a number: ");
        int number  = scanner.nextInt();

        for(int i = 1; i <= 10; ++i){
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }
}
