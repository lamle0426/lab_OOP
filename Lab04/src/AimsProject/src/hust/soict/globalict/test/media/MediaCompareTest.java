package AimsProject.src.hust.soict.globalict.test.media;

import AimsProject.src.hust.soict.globalict.aims.media.*;
import java.util.*;

public class MediaCompareTest {
    public static void main(String[] args) {
        List<Media> listMedia = new ArrayList<Media>();

        DigitalVideoDisc dvd = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);


        Book book = new Book("The Valley of Fear", "Detective", 20.00f);
        Book book1 = new Book("A Living Remedy: A Memoir", "Biography", 202.00f);
        Book book2 = new Book("On the Origin of Time: Stephen Hawking's Final Theory", "Science", 120.00f);
        Book book3 = new Book("Looking Glass Sound", "Horror", 1.00f);


        CompactDisc cd = new CompactDisc("Adele - 30", "Music","Adele", 1500.98f);
        Track track1 = new Track("All Night Parking (interlude)", 161);
        Track track2 = new Track("To Be Loved", 403);
        Track track3 = new Track("Woman Like Me", 300);

        cd.addTrack(track1);
        cd.addTrack(track2);
        cd.addTrack(track3);

        listMedia.add(cd);
        listMedia.add(book);
        listMedia.add(book1);
        listMedia.add(book2);
        listMedia.add(book3);
        listMedia.add(dvd);
        listMedia.add(dvd2);
        listMedia.add(dvd3);

        // Sort using override compareto method
        System.out.println();
        System.out.println("*******SORT USING OVERRIDE compareTo method*******");
        Collections.sort(listMedia);
        Iterator<Media> iterator = listMedia.iterator();

        while (iterator.hasNext()) {
            System.out.println(((Media)iterator.next()).toString());
        }

        System.out.println("**************************************************");

        // Sort by title using comparator
        System.out.println();
        System.out.println("**********SORT BY TITLE USING COMPARATOR**********");
        Collections.sort((List<Media>)listMedia, Media.COMPARE_BY_TITLE_COST);
        iterator = listMedia.iterator();

        while (iterator.hasNext()) {
            System.out.println(((Media)iterator.next()).toString());
        }
        System.out.println("**************************************************");

        // Sort by cost using comparator
        System.out.println();
        System.out.println("**********SORT BY COST USING COMPARATOR************");
        Collections.sort((List<Media>)listMedia, Media.COMPARE_BY_COST_TITLE);
        iterator = listMedia.iterator();

        while (iterator.hasNext()) {
            System.out.println(((Media)iterator.next()).toString());
        }
        System.out.println("**************************************************");
    }
}
