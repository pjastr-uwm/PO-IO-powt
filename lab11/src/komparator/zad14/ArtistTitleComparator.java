package komparator.zad14;

import java.util.Comparator;

public class ArtistTitleComparator implements Comparator<Song> {
    @Override
    public int compare(Song obj1, Song obj2) {
        int base = obj1.getArtist().compareTo(obj2.getArtist());
        if (base!=0)
            return base;
        return obj1.getTitle().compareTo(obj2.getTitle());
    }
}
