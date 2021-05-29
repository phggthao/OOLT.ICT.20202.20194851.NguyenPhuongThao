package hust.soict.globalict.aims;

import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.order.Order;

public class Aims {
    public static void main(String[] args) {
        //Create a new order
        Order Order1 = new Order();
        Order Order2 = new Order();
        Order Order3 = new Order();

        //Create new DVD objects and add them to the order
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        Order1.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        Order1.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        Order1.addDigitalVideoDisc(dvd3);

        //print total cost of the order
        System.out.println("Total cost is: " + Order1.totalCost() + "\n");

        //remove dvd2 from order
        Order1.removeDigitalVideoDisc(dvd2);

        //test addDigitalVideoDisc(DigitalVideoDisc [] dvdList)
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        DigitalVideoDisc[] dvdList = {dvd4,dvd5,dvd6};
        Order2.addDigitalVideoDisc(dvdList);

        //test addDigitalVideoDisc(DigitalVideoDisc disc1,DigitalVideoDisc disc2)
        DigitalVideoDisc dvd7 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd8 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        Order3.addDigitalVideoDisc(dvd7,dvd8);

        //print orders
        Order1.printOrder();
        Order2.printOrder();
        Order3.printOrder();
    }
}