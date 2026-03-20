import java.util.HashMap;

public class AvailabilityTable {

    private HashMap<String, Boolean> table = new HashMap<>();

    public void put(String isbn, boolean available) {
        table.put(isbn, available);
    }

    public boolean contains(String isbn) {
        return table.containsKey(isbn);
    }

    public Boolean get(String isbn) {
        return table.get(isbn);
    }

    public void update(String isbn, boolean available) {
        table.put(isbn, available);
    }
}
