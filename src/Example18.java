import java.util.Scanner;

public class Example18 {

    public static void main(String[] args) {
        double pricePerHour, hours;
        double grossPay = 0;
        double netPay = 0;
        double taxes = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce the number of hours: ");
        hours = scanner.nextDouble();
        System.out.println("Introduce the price per hour: ");
        pricePerHour = scanner.nextDouble();


        //calculate the gross pay
        if(hours < 35){
            grossPay = hours * pricePerHour;
        }else{
            grossPay = 35 * pricePerHour + (hours - 35) * pricePerHour * 1.5;
        }

        //calculate taxes
        if(grossPay > 500 && grossPay <= 900){
            taxes = (grossPay - 500) * 0.25;
        }else if(grossPay > 900){
            taxes = 400 * 0.25 + (grossPay - 900) * 0.45;
        }else{
            taxes = 0;
        }

        //calculate net pay
        netPay = grossPay - taxes;

        System.out.println("Gross salary = " + grossPay);
        System.out.println("Taxes = " + taxes);
        System.out.println("Net pay = " + netPay);
    }


}
