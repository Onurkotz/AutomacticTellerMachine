import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String password = "abc123", customerNumber = "123456";
        int right = 3, select;
        double balance = 1500, money;

        while (right > 0) {
            System.out.print("Please enter your custumer number: ");
            customerNumber = input.nextLine();
            System.out.print("Please enter your password: ");
            password = input.nextLine();
            if (customerNumber.equals("123456") && password.equals("abc123")) {
                System.out.println("Welcome to new generation banking.");
                do {
                    System.out.println("Now redirected to menu. Please wait!");
                    System.out.println("1-Withdraw money\n2-Deposit money\n3-Show my balance\n4-Exit");
                    System.out.print("Please choose a option: ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.println("How much money do you want to withdraw? : ");
                            money = input.nextDouble();
                            balance -= money;
                            System.out.println("Remaining balance: " + balance + "₺");
                            if (balance < 0) {
                                System.out.println("You  are debt.\nAlarm: Balance: " + balance + "₺");
                            }
                            break;
                        case 2:
                            System.out.println("How much money do you deposit? : ");
                            money = input.nextDouble();
                            balance += money;
                            System.out.println("Your new balance: " + balance + "₺");
                            break;
                        case 3:
                            System.out.println("Your balance:" + balance + "₺");
                            break;
                    }
                } while (select != 4);
                System.out.println("See you again!");
                break;
            } else {
                right--;
                if (right == 0) {
                    System.out.println("Your account blocked. Please call the call centre.");
                } else {
                    System.out.println("Wrong customer number or password. Please try carefully!");
                    System.out.println("Your remaining right is " + right);
                }
            }
        }
    }
}
