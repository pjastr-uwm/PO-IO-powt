package komparator.zad14;

import java.util.Comparator;

public class DurationComparator implements Comparator<Song> {
    @Override
    public int compare(Song obj1, Song obj2) {
        return Integer.compare(obj1.getDuration(), obj2.getDuration());
    }
}
