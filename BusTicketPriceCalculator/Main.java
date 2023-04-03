import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int km = 0;
        int age = 0;
        int type = 1;
        double ticketPrice = 0;
        double ageDiscountRate = 0;
        double ticketDiscountPrise = 0;
        double tripDiscount = 0;

        System.out.print("Please enter km: ");
        km = scanner.nextInt();
        System.out.print("Please enter your age: ");
        age = scanner.nextInt();
        System.out.println("Please select the type of trip ");
        System.out.print("1) One direction  2) Round-Trip : ");
        type = scanner.nextInt();


        if (km > 0 && age > 0 && (type == 1 || type == 2)) {
            ticketPrice = 0.10 * km;

            if (age < 12) {
                ageDiscountRate = 0.50;
            } else if (age <= 24) {
                ageDiscountRate = 0.10;
            } else if (age > 65) {
                ageDiscountRate = 0.30;
            }

            ticketPrice = ticketPrice - (ticketPrice * ageDiscountRate);

            if (type == 2) {
                ticketPrice -= ticketPrice * 0.20;
                ticketPrice *= 2;
            }
            System.out.println("Total amount= " + ticketPrice);


        } else {
            System.out.println("You entered incorrect data!");
        }
    }
}