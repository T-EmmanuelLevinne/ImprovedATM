import java.util.*;

public class Main {
    public static void main(String[] args) {
       
   
        HashMap<String, String> accounts = new HashMap<>();
        double balance = 0.0;
       
        Scanner input = new Scanner(System.in);
        boolean exitApp = false;
       
     
        while (!exitApp) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                 
                    System.out.print("Enter account number to register: ");
                    String accountNumber = input.nextLine();
                   
                   
                    if (accounts.containsKey(accountNumber)) {
                        System.out.println("Account number already exists. Please try again.");
                    } else {
                        System.out.print("Enter a PIN for your account: ");
                        String pin = input.nextLine();
                        accounts.put(accountNumber, pin);
                        System.out.println("Registration successful! You can now log in.");
                    }
                    break;
               
                case 2:
                   
                    System.out.print("Enter account number: ");
                    String loginAccount = input.nextLine();
                    System.out.print("Enter PIN: ");
                    String loginPin = input.nextLine();
                   
                   
                    if (accounts.containsKey(loginAccount) && accounts.get(loginAccount).equals(loginPin)) {
                        System.out.println("Login Successful.");
                       
                       
                        boolean loggedIn = true;
                        while (loggedIn) {
                            System.out.println("\nATM Menu:");
                            System.out.println("1. Check Balance");
                            System.out.println("2. Deposit Money");
                            System.out.println("3. Withdraw Money");
                            System.out.println("4. Exit");
                            System.out.print("Choose an option: ");
                            int atmChoice = input.nextInt();

                            switch (atmChoice) {
                                case 1:
                                    System.out.println("Your balance is: $" + balance);
                                    break;
                                case 2:
                                    System.out.print("Enter deposit amount: ");
                                    double deposit = input.nextDouble();
                                    balance += deposit;
                                    System.out.println("Deposited: $" + deposit + ". New balance: $" + balance);
                                    break;
                                case 3:
                                    System.out.print("Enter withdrawal amount: ");
                                    double withdraw = input.nextDouble();
                                    if (withdraw <= balance) {
                                        balance -= withdraw;
                                        System.out.println("Withdrew: $" + withdraw + ". New balance: $" + balance);
                                    } else {
                                        System.out.println("Insufficient balance.");
                                    }
                                    break;
                                case 4:
                                    System.out.println("Exiting. Thank you for using the ATM.");
                                    loggedIn = false;
                                    break;
                                default:
                                    System.out.println("Invalid option. Please try again.");
                            }
                        }
                    } else {
                        System.out.println("Invalid account number or PIN. Access denied.");
                    }
                    break;
               
                case 3:
                   
                    System.out.println("Exiting. Thank you for using the ATM.");
                    exitApp = true;
                    break;
               
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
       
       
    }
}
