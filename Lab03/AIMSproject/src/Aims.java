package Lab03.AIMSproject.src;
public class Aims {
    public static void main(String[] args) {
        //Create a new order
        Order anOrder = new Order();

        //Create new DVD objects and add them to the order
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        //print total cost of the order
        System.out.println("Total cost is: ");
        System.out.println(anOrder.totalCost());

        //remove dvd2 from order
        anOrder.removeDigitalVideoDisc(dvd2);
    }
}
