package Rohith.taxibooking;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner sc = new Scanner(System.in);

        boolean looping = true;
        while(looping) {
            System.out.println("Choose any one ");
            System.out.println("1.Book Tax");
            System.out.println("2.Display Details");
            System.out.println("3.Exit");
            int n = sc.nextInt();
            System.out.println(".............................");

            switch (n) {
                case 1: {

                    System.out.println("Enter Pickup Location");
                    char pickupLocation = sc.next().charAt(0);
                    System.out.println("Enter Drop Location");
                    char dropLocation = sc.next().charAt(0);
                    System.out.println("Enter Pickup Time");
                    int pickupTime = sc.nextInt();
                    System.out.println(Booking.booking(pickupLocation, dropLocation, pickupTime));
                    System.out.println(".............................");
                    break;
                }

                case 2: {
                    System.out.println("Booking Details");
                    Booking.display();
                    break;
                }

                case 3: {
                    looping = false;
                    System.out.println("\tThank You!!!");
                    sc.close();
                    break;
                }
            }
        }
    }
}
