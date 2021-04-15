package Lab04.AIMSproject.src;

public class Order {
    public static final int MAX_LIMITED_ORDERS = 5;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_LIMITED_ORDERS];
    private int qtyOrdered = 0;
    
    private MyDate dateOrdered = new MyDate();

    public int getQtyOrdered() { //get the total number of DVDs in current order
        return qtyOrdered;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc) { //add DVD
        if (getQtyOrdered() < MAX_LIMITED_ORDERS) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added");
            System.out.println("Current quantity: " + getQtyOrdered() + "\n");
        }
        else {
            System.out.println("The order is full!");
            System.out.println("Delete DVD(s) to add new DVD(s) to current order.\n");
        }
    }
    
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) { //remove DVD
        if (getQtyOrdered() == 0) System.out.println("There is no disc to remove!\n");
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
            System.out.println("Current quantity: " + getQtyOrdered() + "\n");
        }
    }

    public float totalCost() { //get the total cost of current order
        float total = 0;
        for (int i=0;i<getQtyOrdered();i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) { //pass by array parameter
        if (qtyOrdered + dvdList.length <= MAX_LIMITED_ORDERS) {
            for (int i=0;i<dvdList.length;i++){
                itemsOrdered[qtyOrdered] = dvdList[i];
                qtyOrdered++;
                System.out.println("The DVD list has been added");
                System.out.println("Current quantity: " + getQtyOrdered() + "\n");
            }
        }
        else {
            System.out.println("Cannot add DVD list to current order!");
            System.out.println("Each order can only have maximum 10 DVDs!\n");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc1,DigitalVideoDisc disc2,DigitalVideoDisc disc3) { //pass by 3 parameters
        if (getQtyOrdered() < MAX_LIMITED_ORDERS) {
            itemsOrdered[qtyOrdered] = disc1;
            qtyOrdered++;
            System.out.println("The disc has been added");
            System.out.println("Current quantity: " + getQtyOrdered() + "\n");
        }
        if (getQtyOrdered() < MAX_LIMITED_ORDERS) {
            itemsOrdered[qtyOrdered] = disc2;
            qtyOrdered++;
            System.out.println("The disc has been added");
            System.out.println("Current quantity: " + getQtyOrdered() + "\n");
        }
        if (getQtyOrdered() < MAX_LIMITED_ORDERS) {
            itemsOrdered[qtyOrdered] = disc3;
            qtyOrdered++;
            System.out.println("The disc has been added");
            System.out.println("Current quantity: " + getQtyOrdered() + "\n");
        }
        else {
            System.out.println("The order is full!");
            System.out.println("Delete DVD(s) to add new DVD(s) to current order.\n");
        }
    }
    /*I prefer the method addDigitalVideoDisc with array parameter. 
    It makes the code much shorter ==> time saving*/

    public void addDigitalVideoDisc(DigitalVideoDisc disc1,DigitalVideoDisc disc2) { //pass by 2 parameters
        if (getQtyOrdered() < MAX_LIMITED_ORDERS) {
            itemsOrdered[qtyOrdered] = disc1;
            qtyOrdered++;
            System.out.println("The disc has been added");
            System.out.println("Current quantity: " + getQtyOrdered() + "\n");
        }
        if (getQtyOrdered() < MAX_LIMITED_ORDERS) {
            itemsOrdered[qtyOrdered] = disc2;
            qtyOrdered++;
            System.out.println("The disc has been added");
            System.out.println("Current quantity: " + getQtyOrdered() + "\n");
        }
        else {
            System.out.println("The order is full!");
            System.out.println("Cannot add the DVD named \"" + disc2.getTitle() + "\"");
            System.out.println("Delete DVD(s) to add new DVD(s) to current order.\n");
        }
    }

    public void printOrder() {
        System.out.println("***********************Order***********************");
        System.out.printf("Date: ");
        dateOrdered.print();
        for (int i=0;i<qtyOrdered;i++) {
            System.out.println((i+1) + ". DVD - " + itemsOrdered[i].getTitle() + ": $" + itemsOrdered[i].getCost());
        }
        System.out.println("Total cost: $" + totalCost());
        System.out.println("***************************************************\n");
    }
}