/**
 * Simple Item class for lost and found.
 */
public class Item {

    private String name;
    private String location;
    private boolean found;

    public Item(String name, String location) {
        this.name = name;
        this.location = location;
        this.found = false;
    }

    public String getName() {
        return name;
    }

    public void markFound() {
        found = true;
    }

    public String toString() {
        return name + " at " + location + " | " + (found ? "Found" : "Lost");
    }
}
