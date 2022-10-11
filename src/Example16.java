import java.util.Scanner;

public class Example16 {
    public static void main(String[] args) {
        int grade;
        System.out.println("Enter a number from 1 to 10:");
        //Reading the value
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        grade = inputValue.nextInt();
        switch (grade) {
            case 1 -> System.out.println("one");
            case 2 -> System.out.println("two");
            case 3 -> System.out.println("three");
            case 4 -> System.out.println("four");
            case 5 -> System.out.println("five");
            case 6 -> System.out.println("six");
            case 7 -> System.out.println("seven");
            case 8 -> System.out.println("eight");
            case 9 -> System.out.println("nine");
            case 10 -> System.out.println("ten");
            default -> System.out.println("ERROR");
        }
    }
}
