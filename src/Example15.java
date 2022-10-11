import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce the exam mark:");
        double mark = scanner.nextDouble();

        if (mark >= 0 && mark < 3) {
            System.out.println("Muy deficiente");
        } else if (mark >= 3 && mark <5 ) {
            System.out.println("Insuficiente");
        } else if (mark >= 5 && mark < 6) {
            System.out.println("Suficiente");
        } else if (mark >= 6 && mark < 7) {
            System.out.println("Bien");
        } else if (mark >= 7 && mark < 9) {
            System.out.println("Notable");
        }else
            System.out.println("Sobresaliente");
    }
}
