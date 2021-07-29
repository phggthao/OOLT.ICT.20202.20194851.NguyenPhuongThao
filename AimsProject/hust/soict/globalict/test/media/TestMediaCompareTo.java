package hust.soict.globalict.test.media;

import hust.soict.globalict.aims.media.DigitalVideoDisc;

public class TestMediaCompareTo {
    public static void main(String[] args) {
        java.util.Collection collection = new java.util.ArrayList();
        
        //Input DVD
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("001", "The Lion King", "Animation", 19.95f, 87);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("002", "Star Wars", "Science Fiction", 24.95f, 88);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("003", "Aladin", "Animation", 18.99f, 85);

        //Add the DVD objects to the ArrayList
        collection.add(dvd1);
        collection.add(dvd2);
        collection.add(dvd3);

        //Iterate through the ArrayList and output their titles
        //unsorted order
        java.util.Iterator iterator = collection.iterator();

        System.out.println("--------------------------------");
        System.out.println("The DVDs currently in the order are: ");

        while (iterator.hasNext()) {
            System.out.println(((DigitalVideoDisc)iterator.next()).getTitle());
        }

        //Sort the collection of DVDs - based on the compareTo() method
        java.util.Collections.sort((java.util.List)collection);

        //Iterate through the ArrayList and output their titles in sorted order
        //need debug, not ordered
        iterator = collection.iterator();

        System.out.println("--------------------------------");
        System.out.println("The DVDs in sorted order are: ");

        while (iterator.hasNext()) {
            System.out.println(((DigitalVideoDisc)iterator.next()).getTitle());
        }

        System.out.println("--------------------------------");
    }
}
