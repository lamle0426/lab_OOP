package AimsProject.src.hust.soict.globalict.test.media;

import AimsProject.src.hust.soict.globalict.aims.media.*;
import java.util.*;

public class MediaTest {
    public static void main(String[] args) {
        List<Media> listMedia = new ArrayList<Media>();

        DigitalVideoDisc dvd = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        Book book = new Book("The Valley of Fear", "Detective", 20.00f);


        CompactDisc cd = new CompactDisc("Adele - 30", "Music","Adele", 1500.98f);
        Track track1 = new Track("All Night Parking (interlude)", 161);
        Track track2 = new Track("To Be Loved", 403);
        Track track3 = new Track("Woman Like Me", 300);

        cd.addTrack(track1);
        cd.addTrack(track2);
        cd.addTrack(track3);

        listMedia.add(cd);
        listMedia.add(book);
        listMedia.add(dvd);

        for (Media media : listMedia) {
            System.out.println(media.toString());
        }
    }
}
