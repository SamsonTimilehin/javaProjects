package ourDiary;

import java.util.ArrayList;

public class Diary {
    ArrayList<Entry> entries = new ArrayList<Entry>();

//    public void addEntry(String entryBody) {
//        entries.add(new Entry(entryBody));
//    }

    public int getTotalNumberOfEntry() {
        return entries.size();
    }
}
