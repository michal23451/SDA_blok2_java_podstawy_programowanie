package pl.sdacademy.java.basic.day3.task9;

public class Order {
    private int maxOrderItem;
    private OrderItem[] items;
    private int coutner = 0;

    public Order(int maxOrderItem) {
        this.maxOrderItem = maxOrderItem;
        this.items = new OrderItem[maxOrderItem];

    }

    public boolean addItem(OrderItem orderItem) {
        if(!orderItem.isCorrect()) {
            System.out.println("Pozycja jest niepoprawna!");
            return false;
        }
        if(coutner >= items.length) {
        //lub if(coutner >= maxOrderItem) {
            System.out.println("Brak miejsca w tabeli!");
            return false;
        }
        items[coutner] = orderItem;
        coutner++;
        return true;
        }



    public double getTotalAmount() {
        double totalAmount = 0;
        for(OrderItem element : items) {
            if(element != null) {
                totalAmount += element.getAmount();
            }
        }
        return totalAmount;
    }

    public int getItemsCount() {
        int totalQuantity = 0;
        for(OrderItem element : items) {
            if(element != null) {
                totalQuantity += element.getQuantity();
            }
        }
        return totalQuantity;
    }

    public void print(){
        for(OrderItem element : items) {
            element.print();
        }
        System.out.println("Total amount: " + getTotalAmount() + " zł");
        System.out.println("Count: " + getItemsCount() + " pcs");
    }

}
