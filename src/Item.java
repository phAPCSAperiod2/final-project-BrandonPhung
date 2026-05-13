/**
 * Simple Item class for lost and found.
 *
 * This class represents a lost item with:
 * - A name
 * - A location where it was lost or found
 * - A status indicating whether it has been found
 */
public class Item {

    // Stores the name of the item
    private String name;

    // Stores the location related to the item
    private String location;

    // Indicates whether the item has been found
    private boolean found;

    /**
     * Constructor used to create a new Item object.
     *
     * @param name the name of the item
     * @param location the location where the item was lost
     */
    public Item(String name, String location) {

        // Assign the provided name to the instance variable
        this.name = name;

        // Assign the provided location to the instance variable
        this.location = location;

        // New items are marked as not found by default
        this.found = false;
    }

    /**
     * Returns the name of the item.
     *
     * @return the item name
     */
    public String getName() {
        return name;
    }

    /**
     * Marks the item as found.
     * Changes the found status to true.
     */
    public void markFound() {
        found = true;
    }

    /**
     * Returns a formatted string representation of the item.
     * Displays the item name, location, and current status.
     *
     * @return formatted item information
     */
    public String toString() {

        // Uses a ternary operator to display Found or Lost
        return name + " at " + location + " | " + (found ? "Found" : "Lost");
    }
}
