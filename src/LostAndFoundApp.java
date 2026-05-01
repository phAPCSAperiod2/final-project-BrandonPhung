import java.util.Scanner;

/**
 * Simple Lost and Found program using arrays and loops.
 */
public class LostAndFoundApp {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Item[] items = new Item[50];
        int count = 0;

        int choice = 0;

        while (choice != 5) {

            System.out.println("\n1. Add Item");
            System.out.println("2. View Items");
            System.out.println("3. Search Item");
            System.out.println("4. Mark Found");
            System.out.println("5. Exit");
            System.out.print("Choice: ");

            choice = scan.nextInt();
            scan.nextLine(); // clear buffer

            // ADD ITEM
            if (choice == 1) {
                System.out.print("Enter item name: ");
                String name = scan.nextLine();

                System.out.print("Enter location: ");
                String location = scan.nextLine();

                items[count] = new Item(name, location);
                count++;

                System.out.println("Item added.");
            }

            // VIEW ITEMS
            else if (choice == 2) {
                if (count == 0) {
                    System.out.println("No items.");
                } else {
                    for (int i = 0; i < count; i++) {
                        System.out.println(items[i]);
                    }
                }
            }

            // SEARCH ITEM
            else if (choice == 3) {
                System.out.print("Enter name: ");
                String search = scan.nextLine();

                boolean found = false;

                for (int i = 0; i < count; i++) {
                    if (items[i].getName().equalsIgnoreCase(search)) {
                        System.out.println(items[i]);
                        found = true;
                    }
                }

                if (!found) {
                    System.out.println("Not found.");
                }
            }

            // MARK FOUND
            else if (choice == 4) {
                System.out.print("Enter name: ");
                String name = scan.nextLine();

                for (int i = 0; i < count; i++) {
                    if (items[i].getName().equalsIgnoreCase(name)) {
                        items[i].markFound();
                        System.out.println("Marked as found.");
                    }
                }
            }

            // EXIT
            else if (choice == 5) {
                System.out.println("Goodbye.");
            }

            else {
                System.out.println("Invalid choice.");
            }
        }

        scan.close();
    }
}
