import java.util.Scanner;

/**
 * Simple Lost and Found program using arrays and loops.
 *
 * This program allows users to:
 * - Add lost items
 * - View all items
 * - Search for an item by name
 * - Mark an item as found
 * - Exit the application
 *
 * The program stores up to 50 items using an array.
 */
public class LostAndFoundApp {

    /**
     * Main method where the program starts execution.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        // Scanner object used to read user input from the keyboard
        Scanner scan = new Scanner(System.in);

        // Array to store Item objects
        Item[] items = new Item[50];

        // Keeps track of the number of items currently stored
        int count = 0;

        // Stores the user's menu choice
        int choice = 0;

        /**
         * Main program loop.
         * Continues running until the user chooses option 5 (Exit).
         */
        while (choice != 5) {

            // Display menu options
            System.out.println("\n1. Add Item");
            System.out.println("2. View Items");
            System.out.println("3. Search Item");
            System.out.println("4. Mark Found");
            System.out.println("5. Exit");
            System.out.print("Choice: ");

            // Read the user's menu choice
            choice = scan.nextInt();

            // Clear the newline character left in the input buffer
            scan.nextLine();

            // ADD ITEM
            /**
             * Allows the user to add a new lost item.
             * The user enters the item name and location.
             */
            if (choice == 1) {
                System.out.print("Enter item name: ");
                String name = scan.nextLine();

                System.out.print("Enter location: ");
                String location = scan.nextLine();

                // Create a new Item object and store it in the array
                items[count] = new Item(name, location);

                // Increase item count
                count++;

                System.out.println("Item added.");
            }

            // VIEW ITEMS
            /**
             * Displays all items currently stored in the array.
             * If no items exist, a message is shown.
             */
            else if (choice == 2) {
                if (count == 0) {
                    System.out.println("No items.");
                } else {

                    // Loop through all stored items and print them
                    for (int i = 0; i < count; i++) {
                        System.out.println(items[i]);
                    }
                }
            }

            // SEARCH ITEM
            /**
             * Searches for items by name.
             * The search is case-insensitive.
             */
            else if (choice == 3) {
                System.out.print("Enter name: ");
                String search = scan.nextLine();

                // Tracks whether a matching item was found
                boolean found = false;

                // Loop through items to find matches
                for (int i = 0; i < count; i++) {

                    // Compare item name with user input
                    if (items[i].getName().equalsIgnoreCase(search)) {
                        System.out.println(items[i]);
                        found = true;
                    }
                }

                // Display message if no matching item exists
                if (!found) {
                    System.out.println("Not found.");
                }
            }

            // MARK FOUND
            /**
             * Marks an item as found using its name.
             * The search is case-insensitive.
             */
            else if (choice == 4) {
                System.out.print("Enter name: ");
                String name = scan.nextLine();

                // Search through items
                for (int i = 0; i < count; i++) {

                    // If item name matches, mark it as found
                    if (items[i].getName().equalsIgnoreCase(name)) {
                        items[i].markFound();
                        System.out.println("Marked as found.");
                    }
                }
            }

            // EXIT
            /**
             * Ends the program.
             */
            else if (choice == 5) {
                System.out.println("Goodbye.");
            }

            // INVALID OPTION
            /**
             * Displays an error message if the user enters
             * an invalid menu choice.
             */
            else {
                System.out.println("Invalid choice.");
            }
        }

        // Close scanner to prevent resource leaks
        scan.close();
    }
}
