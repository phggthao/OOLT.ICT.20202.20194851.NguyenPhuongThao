package hust.soict.globalict.test.disc;

import hust.soict.globalict.aims.disc.DigitalVideoDisc;

class DVDWrapper {
    DigitalVideoDisc dvd;
    DVDWrapper(DigitalVideoDisc dvd) {this.dvd = dvd;}
}

public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        DVDWrapper dvd1 = new DVDWrapper(jungleDVD);
        DVDWrapper dvd2 = new DVDWrapper(cinderellaDVD);

        swap(dvd1,dvd2);
        System.out.println("jungle dvd title: " + dvd1.dvd.getTitle());
        System.out.println("cinderella dvd title: " + dvd2.dvd.getTitle());

        changeTitle(jungleDVD,cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }

//The title of the 2 DVDs doesn't change because parameters are passed by value in Java. 
//So when we pass jungleDVD and cinderellaDVD to function swap(), the function creates a copy of these references.

    public static void swap(DVDWrapper dvd1,DVDWrapper dvd2) { //Correct swap() method
        DigitalVideoDisc tmp = dvd1.dvd;
        dvd1.dvd = dvd2.dvd;
        dvd2.dvd = tmp;
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
}
