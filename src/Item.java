/**
 * Represents a lost or found item.
 */
public class Item {

    private String name;
    private String description;
    private String location;
    private boolean isFound;

    public Item(String name, String description, String location) {
        this.name = name;
        this.description = description;
        this.location = location;
        this.isFound = false;
    }

    public String getName() {
        return name;
    }

    public boolean isFound() {
        return isFound;
    }

    public void markFound() {
        isFound = true;
    }

    public String toString() {
        return name + " | " + description + " | " + location +
               " | Status: " + (isFound ? "Found" : "Lost");
    }
}
