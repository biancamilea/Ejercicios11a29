import java.util.Scanner;

public class Example27 {
    public static void main(String[] args) {
        int numOfTerms = 40, first = 0,next = 1;

        System.out.print("The first " + numOfTerms + " Fibonacci numbers are: ");
        System.out.print(first + " " + next);
        for (int i = 1; i <= numOfTerms-2; ++i){
            int sum = first + next;
            first = next;
            next = sum;
            System.out.print(" " + sum);
        }
    }
}
