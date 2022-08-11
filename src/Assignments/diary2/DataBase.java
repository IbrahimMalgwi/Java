package africa.semicolon.Assignments.diary2;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class DataBase {
    private final ArrayList<Entry> entries;

    public DataBase() {
        entries = new ArrayList<>();
    }




    public ArrayList<Entry> findEntries(LocalDateTime dateTime, boolean byTime) {
        ArrayList<Entry> found = new ArrayList<>();
        for (Entry entry : entries) {
            if ((byTime && (entry.getDateTime().equals(dateTime))) // filtered by time and date
                    ||
                    ((!byTime) && (entry.getDateTime().toLocalDate().equals(dateTime.toLocalDate())))) { // filtered by date only
                found.add(entry);
            }
        }
        return found;
    }

    public void deleteEntries(LocalDateTime dateTime) {
        ArrayList<Entry> found = findEntries(dateTime, true);
        for (Entry entry : found) {
            entries.remove(entry);
        }
    }
    public void addEntry(LocalDateTime dateTime, String text) {
        entries.add(new Entry(dateTime, text));
    }
}
