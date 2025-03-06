import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InventorySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> inventory = new HashMap<>();
        HashMap<String, Double> prices = new HashMap<>();
        
        while (true) {
            System.out.println("\nInventory Management System");
            System.out.println("1. Add Item");
            System.out.println("2. Update Quantity");
            System.out.println("3. Display Inventory");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter item price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter item quantity: ");
                    int quantity = scanner.nextInt();
                    
                    inventory.put(name, inventory.getOrDefault(name, 0) + quantity);
                    prices.put(name, price);
                    System.out.println("Item added successfully!");
                    break;
                    
                case 2:
                    System.out.print("Enter item name: ");
                    String itemName = scanner.nextLine();
                    if (inventory.containsKey(itemName)) {
                        System.out.print("Enter new quantity: ");
                        int newQuantity = scanner.nextInt();
                        if (newQuantity >= 0) {
                            inventory.put(itemName, newQuantity);
                            System.out.println("Quantity of \"" + itemName + "\" set to " + newQuantity + ".");
                        } else {
                            System.out.println("Quantity cannot be negative!");
                        }
                    } else {
                        System.out.println("Item not found!");
                    }
                    break;
                    
                case 3:
                    if (inventory.isEmpty()) {
                        System.out.println("Inventory is empty!");
                    } else {
                        System.out.printf("\n%-15s %-10s %-10s%n", "Item", "Price", "Quantity");
                        System.out.println("-----------------------------------------");
                        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
                            System.out.printf("%-15s $%-9.2f %-10d%n", 
                                    entry.getKey(), prices.get(entry.getKey()), entry.getValue());
                        }
                    }
                    break;
                    
                case 4:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
