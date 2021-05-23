package hust.soict.globalict.aims.order;

import hust.soict.globalict.aims.disc.DigitalVideoDisc;
import hust.soict.globalict.aims.utils.MyDate;

public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10; // max number of items in an order
    public static final int MAX_LIMITED_ORDERS = 5; // max number of orders
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;
    private static int nbOrders = 0;
    float freeDisc = 0; 
    
    private MyDate dateOrdered = new MyDate();

    public Order() {// not working
        if (nbOrders < MAX_LIMITED_ORDERS) nbOrders++;
        else {
            System.out.println("You have reached maximum number of orders!");
            System.out.println("Cannot create new order!");
            System.exit(0);
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc) { //add DVD
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added");
            System.out.println("Current quantity: " + qtyOrdered + "\n");
        }
        else {
            System.out.println("The order is full!");
            System.out.println("Delete DVD(s) to add new DVD(s) to current order.\n");
        }
    }
    
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) { //remove DVD
        if (qtyOrdered == 0) System.out.println("There is no disc to remove!\n");
        else {
            int j=0;
            while (!disc.equals(itemsOrdered[j])){
                j++;
            }
            for (int i=j;i<qtyOrdered-1;i++){
                itemsOrdered[i]=itemsOrdered[i+1];
            }
            qtyOrdered--;
            System.out.println("Selected DVD has been removed successfully!");
            System.out.println("Current quantity: " + qtyOrdered + "\n");
        }
    }

    public float totalCost() { //get the total cost of current order
        float total = 0;
        for (int i=0;i<qtyOrdered;i++) {
            total += itemsOrdered[i].getCost();
        }
        return (total-this.freeDisc);
    }

    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) { //pass by array parameter
        if (qtyOrdered + dvdList.length <= MAX_NUMBERS_ORDERED) {
            for (int i=0;i<dvdList.length;i++){
                itemsOrdered[qtyOrdered] = dvdList[i];
                qtyOrdered++;
                System.out.println("The DVD list has been added");
                System.out.println("Current quantity: " + qtyOrdered + "\n");
            }
        }
        else {
            System.out.println("Cannot add DVD list to current order!");
            System.out.println("Each order can only have maximum 10 DVDs!\n");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc1,DigitalVideoDisc disc2,DigitalVideoDisc disc3) { //pass by 3 parameters
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc1;
            qtyOrdered++;
            System.out.println("The disc has been added");
            System.out.println("Current quantity: " + qtyOrdered + "\n");
        }
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc2;
            qtyOrdered++;
            System.out.println("The disc has been added");
            System.out.println("Current quantity: " + qtyOrdered + "\n");
        }
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc3;
            qtyOrdered++;
            System.out.println("The disc has been added");
            System.out.println("Current quantity: " + qtyOrdered + "\n");
        }
        else {
            System.out.println("The order is full!");
            System.out.println("Delete DVD(s) to add new DVD(s) to current order.\n");
        }
    }
    /*I prefer the method addDigitalVideoDisc with array parameter. 
    It makes the code much shorter ==> time saving*/

    public void addDigitalVideoDisc(DigitalVideoDisc disc1,DigitalVideoDisc disc2) { //pass by 2 parameters
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc1;
            qtyOrdered++;
            System.out.println("The disc has been added");
            System.out.println("Current quantity: " + qtyOrdered + "\n");
        }
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc2;
            qtyOrdered++;
            System.out.println("The disc has been added");
            System.out.println("Current quantity: " + qtyOrdered + "\n");
        }
        else {
            System.out.println("The order is full!");
            System.out.println("Cannot add the DVD named \"" + disc2.getTitle() + "\"");
            System.out.println("Delete DVD(s) to add new DVD(s) to current order.\n");
        }
    }

    public void printOrder() {
        System.out.println("***********************Order Details***********************");
        System.out.printf("Date: ");
        dateOrdered.print();
        for (int i=0;i<qtyOrdered;i++) {
            System.out.println((i+1) + ". DVD - " + itemsOrdered[i].getTitle() + ": $" + itemsOrdered[i].getCost());
        }
        System.out.println("Total cost: $" + totalCost());
        System.out.println("***************************************************\n");
    }

    public DigitalVideoDisc getALuckyItem() {
        int luckyItemID = 0;
        
        if (qtyOrdered > 0) {
            luckyItemID = (int) (Math.random() * qtyOrdered);
        }
        this.freeDisc = itemsOrdered[luckyItemID].getCost();
        return itemsOrdered[luckyItemID];
    }
}