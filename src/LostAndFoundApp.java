import java.util.Scanner;

/**
 * Lost and Found Tracker using arrays and user interface.
 */
public class LostAndFoundApp {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Item[] items = new Item[100]; // fixed-size array
        int count = 0;

        int choice;

        do {
            System.out.println("\n=== Lost & Found Tracker ===");
            System.out.println("1. Report Lost Item");
            System.out.println("2. View All Items");
            System.out.println("3. Search Item by Name");
            System.out.println("4. Mark Item as Found");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = scan.nextInt();
            scan.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    if (count >= items.length) {
                        System.out.println("Storage full!");
                        break;
                    }

                    System.out.print("Enter item name: ");
                    String name = scan.nextLine();

                    System.out.print("Enter description: ");
                    String desc = scan.nextLine();

                    System.out.print("Enter location: ");
                    String location = scan.nextLine();

                    items[count] = new Item(name, desc, location);
                    count++;

                    System.out.println("Item added!");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No items reported.");
                    } else {
                        for (int i = 0; i < count; i++) {
                            System.out.println((i + 1) + ". " + items[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter name to search: ");
                    String search = scan.nextLine();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (items[i].getName().equalsIgnoreCase(search)) {
                            System.out.println(items[i]);
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Item not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter item name to mark as found: ");
                    String foundName = scan.nextLine();

                    boolean updated = false;

                    for (int i = 0; i < count; i++) {
                        if (items[i].getName().equalsIgnoreCase(foundName)) {
                            items[i].markFound();
                            System.out.println("Item marked as found!");
                            updated = true;
                        }
                    }

                    if (!updated) {
                        System.out.println("Item not found.");
                    }
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        scan.close();
    }
}
