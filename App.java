import java.util.*;

public class App {
    static Scanner sc = new Scanner(System.in);
    static Queue messageQueue = new Queue(10);
    public static void main(String[] args) throws Exception {
        int choice = 0;
        do {
            menu();
            choice = SelectChoice();
            sc.nextLine();
            switch(choice) {
                case 1:
                    System.out.print("The human send this message: ");
                    String human = sc.nextLine();
                    System.out.print("Input the message: ");
                    String message = sc.nextLine();
                    if (message.toCharArray().length > 250) {
                        System.out.println("Sorry, It's out of 250 characters!");
                        break;
                    }
                    Message mess = new Message(human, message);
                    messageQueue.enqueue(mess);
                break;
                case 2:
                    messageQueue.display();

                break;
                case 3:
                    messageQueue.delete();
                break;
                case 4:
                    System.out.println("Thank for using!");
                return;
                default:
                    System.out.println("Please input the correct number of function!");
                break;
            }
        } while(choice !=4);
    }

    public static void menu() {
        System.out.println("--------------------------");
        System.out.println("1. Input Message");
        System.out.println("2. Recieve Message and Send Message");
        System.out.println("3. Delete Message");
        System.out.println("4. Exit");
        System.out.println("");
    }
    
    public static int SelectChoice() {
        boolean check = true;
        int choice = 0;
        do {
            System.out.print("Your choice: ");
            try {
                choice = sc.nextInt();
                check = false;
            } catch (InputMismatchException e) {
                System.out.println("Please enter the number of the function!");
                sc.nextLine();
            }
        } while (check);
        return choice;
    }
}
