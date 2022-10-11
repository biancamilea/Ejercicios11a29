import java.time.LocalTime;
import java.util.Scanner;

public class Example17 {
    public static void main(String[] args) {
        int hours, minutes, seconds;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce hours:");
        hours = scanner.nextInt();
        System.out.println("Introduce minutes:");
        minutes = scanner.nextInt();
        System.out.println("Introduce seconds:");
        seconds = scanner.nextInt();

        LocalTime time = LocalTime.of(hours, minutes, seconds);
        time = time.plusSeconds(1);

        System.out.println("Hours: " + time.getHour());
        System.out.println("Minutes: " + time.getMinute());
        System.out.println("Seconds: " + time.getSecond());
    }
}
