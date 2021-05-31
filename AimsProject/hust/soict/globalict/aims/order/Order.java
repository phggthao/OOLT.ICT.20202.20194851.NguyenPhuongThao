package hust.soict.globalict.aims.order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import hust.soict.globalict.aims.media.Book;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
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

    public int orderSize() {
        return itemsOrdered.size();
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

    public Book addBook(Scanner scanInfo) {
        System.out.print("ID: "); 
        String id = scanInfo.nextLine();
        System.out.print("Title: "); 
        String title = scanInfo.nextLine();
        System.out.print("Category: "); 
        String category = scanInfo.nextLine();
        System.out.print("Authors (separate by\',\'): "); 
        String[] author = scanInfo.nextLine().split(",");
        System.out.print("Cost (enter a float, e.g. \"12.34\"): ");
        float cost = Float.parseFloat(scanInfo.nextLine());

        List<String> authors = new ArrayList<String>();
        for (String splitAuthor: author) {
            authors.add(splitAuthor.trim());
        }

        Book book = new Book(id, title, category, cost, authors);
        return book;
    }

    public DigitalVideoDisc addDVD(Scanner scanInfo) {
        System.out.print("ID: "); 
        String id = scanInfo.nextLine();
        System.out.print("Title: "); 
        String title = scanInfo.nextLine();
        System.out.print("Category: "); 
        String category = scanInfo.nextLine();
        System.out.print("Director: "); 
        String director = scanInfo.nextLine();
        System.out.print("Length (enter an integer): ");
        int length = Integer.parseInt(scanInfo.nextLine()); 
        System.out.print("Cost (enter a float, e.g. \"12.34\"): ");
        float cost = Float.parseFloat(scanInfo.nextLine());

        DigitalVideoDisc dvd = new DigitalVideoDisc(id, title, category, cost, director, length);
        return dvd;
    }

    public void removeMedia(Media m) {// remove item from order
        if (itemsOrdered.size() == 0) System.out.println("Order is empty. Nothing to remove");
        else {
            itemsOrdered.remove(m);
            System.out.println("Selected item has been removed from order.");
            System.out.println("Current quantity: " + itemsOrdered.size() + "\n");
        }
    }

    public void removeMediaByID(String mediaID) {// delete item by its ID
        if (itemsOrdered.size() == 0) System.out.println("Order is empty. Nothing to remove");
        else {
            for (int i=0; i<itemsOrdered.size(); i++) {
                if (itemsOrdered.get(i).getId().equalsIgnoreCase(mediaID)) {
                    itemsOrdered.remove(i);
                    System.out.println("Selected item has been removed from order.");
                    break;
                }
            }
            System.out.println("Cannot delete because item with ID \"" + mediaID + "\" has not been added to current order.");
            System.out.println("Current quantity: " + itemsOrdered.size() + "\n");
        }
    }

    public float totalCost() { // get the total cost of current order
        float total = 0;
        for (int i=0;i<itemsOrdered.size();i++) {
            total += itemsOrdered.get(i).getCost();
        }
        return (total);
    }

    public void printOrder() {
        Media luckyMedia = getALuckyItem();
        float realTotalCost = totalCost() - luckyMedia.getCost();

        System.out.println("***********************Order Details***********************");
        System.out.printf("Date: "); dateOrdered.print();
        System.out.println("ID\tTitle\t\t\t\tPrice");
        for (int i=0;i<itemsOrdered.size();i++) {
            System.out.print(itemsOrdered.get(i).getId()+ "\t" + itemsOrdered.get(i).getTitle() + "\t\t\t$" + itemsOrdered.get(i).getCost());
            if (itemsOrdered.get(i) == luckyMedia)
                System.out.print(" --> Free lucky item");
            System.out.print("\n");
        }
        System.out.println("Total cost: $" + realTotalCost);
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

    public Media getALuckyItem() {// random a lucky item that user can get for free if their order had >= 3 items
        if (itemsOrdered.size() >= 3) {
            int luckyItemIndex = 0;
            luckyItemIndex = (int) (Math.random() * itemsOrdered.size());
            return itemsOrdered.get(luckyItemIndex);
        }
        return null;
    }
} 