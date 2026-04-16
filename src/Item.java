import java.time.LocalDate;

/**
 * Represents a lost or found item.
 */
public class Item {

    private String name;
    private String description;
    private String location;
    private boolean isFound;
    private LocalDate dateReported;


public Item(String name, String description, String location) {
    this.name = name;
    this.description = description;
    this.location = location;
    this.isFound = false;
    this.dateReported = LocalDate.now();
    }
