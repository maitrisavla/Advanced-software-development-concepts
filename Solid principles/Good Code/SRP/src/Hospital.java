import java.util.Scanner;

public class Hospital{

    public static void main(String[] args) {
        String appID = null;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your full name: ");
        String name = input.nextLine();

        System.out.println("Please enter your phone number: ");
        String phone = input.nextLine();

        Appointment hs = new Appointment(name, phone, appID);
        CancelApp hc = new CancelApp(name,phone,appID);

        while (true) {
            System.out.println("Please enter your choice : \n" +
                    "1: BookApp \n" +
                    "2: CancelApp");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    //bookApp
                    hs.bookApp();
                    System.out.println("Appointment booked!");
                    System.out.println(hs.appDetails.toString());
                    break;
                case 2:
                    //cancelApp
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter your appID:");
                    appID = scanner.nextLine();
                    hc.cancelApp(appID);
                    System.out.println("Appointment Cancelled!");
                    break;
                default:
                    System.out.println("Please make a valid choice!");
            }
        }

    }
}

