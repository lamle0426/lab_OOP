package AimsProject.src.hust.soict.globalict.aims.cart;

import AimsProject.src.hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered += 1;
            System.out.println("The disc has been added");
        } else System.out.println("The cart is almost full");
    }

    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
        if (dvdList.length > MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full");
        } else {
            for (int i = 0; i < dvdList.length; i++) {
                itemsOrdered[qtyOrdered] = dvdList[i];
                qtyOrdered +=1;
                System.out.println(dvdList[i].getTitle() + " has been added");
            }

        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
        DigitalVideoDisc [] dvdList = {dvd1, dvd2};
        addDigitalVideoDisc(dvdList);
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                found = true;
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null;
                qtyOrdered -= 1;
                System.out.println("The disc has been removed");
                break;
            }
        }
        if (!found) System.out.println("Disc not found in the cart");
    }

    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }

    public void searchByID(int id) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getId() == id) {
                System.out.println(itemsOrdered[i].getTitle() + " has been found");
                found = true;
            }
        }
        if (!found) System.out.println("Not found the DVD with the ID " + id);
    }

    public void searchByTitle(String title) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].isMatch(title)) {
                System.out.println(itemsOrdered[i].getTitle() + " has been found");
                found = true;
            }
        }
        if (!found) System.out.println("Not found the DVD with the title " + title);
    }

    public void searchByCategory(String category) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getCategory().equalsIgnoreCase(category)) {
                System.out.println(itemsOrdered[i].getTitle() + " has been found");
                found = true;
            }
        }
        if (!found) System.out.println("Not found the DVD with the category " + category);
    }

    public void searchByPrice(float maxCost) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getCost() <= maxCost) {
                System.out.println("Found" + itemsOrdered[i]);
                found = true;
            }
        }
        if (!found) System.out.println("Not found the DVD with the maximum cost provided!");
    }
    public void searchByPrice(float minCost, float maxCost) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getCost() >= minCost && itemsOrdered[i].getCost() <= maxCost) {
                System.out.println("Found" + itemsOrdered[i]);
                found = true;
            }
        }
        if (!found) System.out.println("Not found the DVD with the cost range between your specified minimum and maximum");
    }

    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println(i+1 + ". " + itemsOrdered[i]);
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }
}
