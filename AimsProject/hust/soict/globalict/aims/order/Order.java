package hust.soict.globalict.aims.order;

import java.util.ArrayList;
import java.util.Scanner;
import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.utils.MyDate;

public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10; // max number of items in an order
    public static final int MAX_LIMITED_ORDERS = 5; // max number of orders
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    private static int nbOrders = 0;
    float freeDisc = 0;
    int count = 0; 
    
    private MyDate dateOrdered = new MyDate();

    public Order() {
        if (nbOrders < MAX_LIMITED_ORDERS) nbOrders++;
        else {
            System.out.println("You have reached maximum number of orders!");
            System.out.println("Cannot create new order!");
            System.exit(0);
        }
    }
    
    public void addMedia(Media m) {// add item to order
        if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(m);
            System.out.println("Selected item has been added to order.");
            System.out.println("Current quantity: " + itemsOrdered.size() + "\n");
        }

        else {
            System.out.println("The order is full.");
            System.out.println("Delete item(s) to add new items to order.");
        }
    }

    public void removeMedia(Media m) {// remove item from order
        if (itemsOrdered.size() == 0) System.out.println("Order is empty. Nothing to remove");
        else {
            itemsOrdered.remove(m);
            System.out.println("Selected item has been removed from order.");
            System.out.println("Current quantity: " + itemsOrdered.size() + "\n");
        }
    }

    public float totalCost() { //get the total cost of current order
        float total = 0;
        for (int i=0;i<itemsOrdered.size();i++) {
            total += itemsOrdered.get(i).getCost();
        }
        return (total);
    }

    public void printOrder() {
        Media luckyMedia = getALuckyItem();

        System.out.println("***********************Order Details***********************");
        System.out.printf("Date: ");
        dateOrdered.print();
        for (int i=0;i<itemsOrdered.size();i++) {
            System.out.print((i+1) + ". DVD - " + itemsOrdered.get(i).getTitle() + ": $" + itemsOrdered.get(i).getCost());
            if (itemsOrdered.get(i) == luckyMedia)
                System.out.print(" --> Free lucky item");
            System.out.print("\n");
        }
        System.out.println("Total cost: $" + totalCost());
        System.out.println("***********************************************************\n");
    }

    public void search() {// search an item by title
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter item title: ");
        String titleInput = scan.next();
        for (int i=0;i<itemsOrdered.size();i++) {
            if (itemsOrdered.get(i).getTitle().contains(titleInput.toLowerCase())) {
                count++;
                System.out.println(itemsOrdered.get(i).getTitle());
            }
        }
        System.out.println("~~ " + count + " result(s) found ~~");
        scan.close();
    }

    public Media getALuckyItem() {
        int luckyItemID = 0;
        
        if (itemsOrdered.size() > 0) {
            luckyItemID = (int) (Math.random() * itemsOrdered.size());
        }
        itemsOrdered.get(luckyItemID).setCost(this.freeDisc);
        return itemsOrdered.get(luckyItemID);
    }
} 