import java.util.Scanner;

public class Example20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce a year: ");
        int year = scanner.nextInt();

        if((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))){
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year + " is NOT leap year");
        }
    }
  }
