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

    public static void customerMenu(Scanner scanRole) {
        int chooseMenu = 10;
        Order newOrder = new Order();

        while (chooseMenu!=0) {
            showMenu();
            chooseMenu = Integer.parseInt(scanRole.nextLine());

            if (chooseMenu >= 0 && chooseMenu <= 4) {
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
                        System.out.println("What kind of item do you want to add? (enter \'book\' or \'dvd\' or \'cd\', case-insensitive)");
                        String item = scanRole.nextLine();

                        if (item.toLowerCase().equals("book")) {// if user want to add a book
                            newOrder.addMedia(newOrder.addBook(scanRole));
                        }

                        else if (item.toLowerCase().equals("dvd")) {// if user want to add a DVD
                            newOrder.addMedia(newOrder.addDVD(scanRole));
                        }

                        else if (item.toLowerCase().equals("cd")) {// if user want to add a CD
                            newOrder.addMedia(newOrder.addCD(scanRole));
                        }

                        else System.out.println("ERROR: Wrong input!");
                        break;
                    }

                    case 3: {
                        System.out.println("--Deleting item by ID...");
                        System.out.print("Enter the ID of the item you want to delete from order: ");
                        String deleteID = scanRole.nextLine();
                        newOrder.removeMediaByID(deleteID);
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

    public static void showAdminMenu() {
        System.out.println("\nProduct Management Application: ");
        System.out.println("--------------------------------");
        System.out.println("1. Create new item");
        System.out.println("2. Delete item by ID");
        System.out.println("3. Display the items list");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }

    public static void adminMenu(Scanner scanRole) {
        int chooseMenu = 10;
        Order newOrder = new Order();

        while (chooseMenu!=0) {
            showAdminMenu();
            chooseMenu = Integer.parseInt(scanRole.nextLine());

            if (chooseMenu >= 0 && chooseMenu <= 3) {
                switch(chooseMenu) {
                    case 1: {
                        System.out.println("--Creating new item..."); 
                        System.out.println("What kind of item do you want to create? (enter \'book\' or \'dvd\' or \'cd\', case-insensitive)");
                        String item = scanRole.nextLine();

                        if (item.toLowerCase().equals("book")) {// if admin want to create a book
                            newOrder.addMedia(newOrder.addBook(scanRole));
                        }

                        else if (item.toLowerCase().equals("dvd")) {// if admin want to create a DVD
                            newOrder.addMedia(newOrder.addDVD(scanRole));
                        }

                        else if (item.toLowerCase().equals("cd")) {// if admin want to create a CD
                            newOrder.addMedia(newOrder.addCD(scanRole));
                        }

                        else System.out.println("ERROR: Wrong input!");
                        break;
                    }

                    case 2: {
                        System.out.println("--Deleting item by ID...");
                        System.out.print("Enter the ID of the item you want to delete: ");
                        String deleteID = scanRole.nextLine();
                        newOrder.removeMediaByID(deleteID);
                        break;
                    }

                    case 3: {
                        System.out.println("--Displaying the items list...");
                        newOrder.printAvailableItems();
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
            else System.out.println("ERROR! You must enter a number from 0-3");
        }
    }
    
    public static void main(String[] args) {
        int chooseMenu = 10;

        while (chooseMenu!=0) {
            System.out.println("\nINTRO MENU: SELECT YOUR ROLE ");
            System.out.println("--------------------------------");
            System.out.println("1. Customer");
            System.out.println("2. Admin");
            System.out.println("0. Exit");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2");
            chooseMenu = Integer.parseInt(scan.nextLine());

            if (chooseMenu >= 0 && chooseMenu <= 2) {
                switch(chooseMenu) {
                    case 1: {
                        System.out.println("--WELCOM CUSTOMER--"); 
                        customerMenu(scan);
                        break;
                    }
                    case 2: {
                        System.out.println("--WELCOM ADMIN--"); 
                        adminMenu(scan);
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
            else System.out.println("ERROR! You must enter a number from 0 to 2");
        }
    }
}