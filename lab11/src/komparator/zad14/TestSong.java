package komparator.zad14;

import java.util.ArrayList;
import java.util.Arrays;

public class TestSong {

    public static void main(String[] args) {
        Song[] tab = new Song[5];
        tab[0] = new Song("AA", "WW", 42);
        tab[1] = new Song("BB", "XX", 45);
        tab[2] = new Song("AA", "AA", 55);
        tab[3] = new Song("AA", "AA", 12);
        tab[4] = new Song("RR", "WW", 66);
        Arrays.sort(tab, new ArtistTitleComparator().thenComparing(new DurationComparator()));
        for(var elem: tab){
            System.out.println(elem);
        }
    }
}
