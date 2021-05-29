package hust.soict.globalict.aims;

import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.order.Order;

public class Aims {
    public static void main(String[] args) {
        //Create a new order
        Order Order = new Order();

        //Create new DVD objects and add them to the order
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", 19.95f, "Roger Allers", 87);
        Order.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", 24.95f, "George Lucas", 87);
        Order.addMedia(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        Order.addMedia(dvd3);

        //print total cost of the order
        System.out.println("Total cost is: " + Order.totalCost() + "\n");

        //remove dvd2 from order
        Order.removeMedia(dvd2);

        //print orders
        Order.printOrder();

        //test search() method
        Order.search();
    }
}