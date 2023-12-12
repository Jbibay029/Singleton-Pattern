import java.util.Scanner;

public class CentralizedQueueSystem {
    public static void main(String[] args) {
        QueueSystem queuingsystem = new QueueSystem();

        HelpDesk helpDeskStation1 = new HelpDesk(queuingsystem);
        HelpDesk helpDeskStation2 = new HelpDesk(queuingsystem);
        HelpDesk helpDeskStation3 = new HelpDesk(queuingsystem);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Serve next customer");
            System.out.println("2. Reset queue number");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    helpDeskStation1.serveNextCust();
                    break;
                case 2:
                    System.out.print("Enter new queue number: ");
                    int newQueueNumber = scanner.nextInt();
                    helpDeskStation1.resetQueueNum(newQueueNumber);
                    break;
                case 3:
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

    }
}