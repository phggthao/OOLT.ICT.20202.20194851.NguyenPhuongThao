package Lab03.AIMSproject.src;
public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered<MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added");
            System.out.println("Current quantity: " + getQtyOrdered());
        }
        else {
            System.out.println("The order is full!");
            System.out.println("Delete DVD(s) to add new DVD(s) to current order.");
        }
    }
    
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (getQtyOrdered() == 0) System.out.println("There is no disc to remove!");
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
            System.out.println("Current quantity: " + getQtyOrdered());
        }
    }

    public float totalCost() {
        float total = 0;
        for (int i=0;i<qtyOrdered;i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
}
