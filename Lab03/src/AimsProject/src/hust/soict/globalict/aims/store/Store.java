package AimsProject.src.hust.soict.globalict.aims.store;

import AimsProject.src.hust.soict.globalict.aims.disc.DigitalVideoDisc;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<DigitalVideoDisc> listItems = new ArrayList<DigitalVideoDisc>();

    public void addDVD(DigitalVideoDisc dvd) {
        listItems.add(dvd);
        System.out.println(dvd.getTitle() + " has been added to the store.");
    }
    
    public void removeDVD(DigitalVideoDisc dvd) {
        if (listItems.remove(dvd)) {
            System.out.println(dvd.getTitle() + " has been removed");
        } else {
            System.out.println(" Not found the disc with title " + dvd.getTitle());
        }
    }

    public void print() {
        System.out.println("List of DVDs: ");
        for (int i = 0; i < listItems.size(); i++) {
            System.out.println(i+1 + ". " + listItems.get(i));
        }
    }
}
