public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);

        anOrder.addDigitalVideoDisc(dvd1);
        anOrder.addDigitalVideoDisc(dvd2);
        anOrder.addDigitalVideoDisc(dvd3);

        System.out.println("Total Cost is: " + anOrder.totalCost());

        anOrder.removeDigitalVideoDisc(dvd2);
        System.out.println("Total cost after removing Star Wars: " + anOrder.totalCost());

        anOrder.removeDigitalVideoDisc(dvd3);
        System.out.println("Total cost after removing Aladdin: " + anOrder.totalCost());
    }
}
