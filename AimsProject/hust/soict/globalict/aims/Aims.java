package hust.soict.globalict.aims;

import java.util.Scanner;

import hust.soict.globalict.aims.order.Order;

public class Aims {
    public static Scanner scan = new Scanner(System.in);

    public static void showMenu() {
        System.out.println("\nOrder Management Application: ");
        System.out.println("--------------------------------");
        System.out.println("1. Create new order");
        System.out.println("2. Add items to the order");
        System.out.println("3. Delete item by ID");
        System.out.println("4. Display the items list of order");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }
    
    public static void main(String[] args) {
        int chooseMenu = 10;
        Order newOrder = new Order();

        while (chooseMenu!=0) {
            showMenu();
            chooseMenu = Integer.parseInt(scan.nextLine());

            if (chooseMenu >= 0 || chooseMenu <= 4) {
                switch(chooseMenu) {
                    case 1: {
                        System.out.println("--Creating new order...");
                        newOrder = new Order();
                        System.out.println("Your order has been created successfully.");
                        System.out.println("Current number of items: " + newOrder.orderSize());
                        break;
                    }

                    case 2: {
                        System.out.println("--Adding items to the order..."); 
                        System.out.println("Small tip: You'll get a random lucky item for free if you order >= 3 items");
                        System.out.println("What kind of item do you want to add? (enter \'book\' or \'dvd\', case-insensitive)");
                        //Scanner scanItem = new Scanner(System.in);
                        String item = scan.nextLine();

                        if (item.toLowerCase().equals("book")) {// if user want to add a book
                            newOrder.addMedia(newOrder.addBook(scan));
                        }

                        else if (item.toLowerCase().equals("dvd")) {// if user want to add a DVD
                            newOrder.addMedia(newOrder.addDVD(scan));
                        }

                        else System.out.println("ERROR: Wrong input!");
                        //scanItem.close();
                        break;
                    }

                    case 3: {
                        System.out.println("--Deleting item by ID...");
                        System.out.print("Enter the ID of the item you want to delete from order: ");
                        //Scanner scanID = new Scanner(System.in);
                        String deleteID = scan.nextLine();
                        newOrder.removeMediaByID(deleteID);
                        //scanID.close();
                        break;
                    }

                    case 4: {
                        System.out.println("--Displaying the list of items in order...");
                        newOrder.printOrder();
                        break;
                    }

                    case 0: {
                        System.out.println("Thank you for using this program!");
                        System.out.println("Exiting...");
                        System.exit(0);
                        break;
                    }
                }
            }
            else System.out.println("ERROR! You must enter a number from 0-4");
        }
    }
}