package pl.sdacademy.java.basic.day3.task9;

import pl.sdacademy.java.basic.day2.StringHelper;

public class OrderItem {
    private String productName;
    private int quantity;
    private double price;

    public OrderItem (String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getAmount() {
        return quantity * price;
    }

    public boolean isCorrect() {
        return StringHelper.isValid(productName) && quantity > 0 && price > 0;
    }

    public void print() {
        System.out.println(productName + "\t|\t " + price + " zł \t|\t " + quantity + " pcs\t|\t " + getAmount() + " zł");

        /*
        StringBuilder sb = new StringBuilder();
        sb.append(productName).append("\t|\t");
        sb.append(price).append(" zł").append("\t|\t");
        sb.append(quantity).append(" pcs").append("\t|\t");
        sb.append(getAmount()).append(" zł").append("\t|\t");
        System.out.println(sb);
         */
    }

    //lub zamiast metody print() nadpisujemy metodę toString()
    //@Override
    //public String toString() {
    //    return productName + "\t|\t " + price + " zł \t|\t " + quantity + " pcs\t|\t " + getAmount() + " zł";
    //}
}
