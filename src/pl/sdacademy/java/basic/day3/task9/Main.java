package pl.sdacademy.java.basic.day3.task9;

import pl.sdacademy.java.basic.day2.StringHelper;

public class Main {
    public static void main(String[] args) {
        OrderItem orderItem1 = new OrderItem("Cukier", 1, 3.5);
        OrderItem orderItem2 = new OrderItem("Mąka", 2, 4);
        OrderItem orderItem3 = new OrderItem("Chleb", 3, 4);
        OrderItem orderItem4 = new OrderItem("Jaja", 4, 4);
        OrderItem orderItem5 = new OrderItem("Mleko", 5, 4);


        // lub z nadpisaną metodą toString
        //System.out.println(orderItem);
        //System.out.println(orderItem2);
        //System.out.println(orderItem3);

        Order order = new Order(5);
        order.addItem(orderItem1);
        order.addItem(orderItem2);
        order.addItem(orderItem3);
        order.addItem(orderItem4);
        order.addItem(orderItem5);

        order.print();

        OrderItem a = new OrderItem("product 1", 2, 4);
        OrderItem b = new OrderItem("product 2", 3, 7);
        OrderItem c = new OrderItem("producnt3", 9, 0);
        Order d = new Order(3);
        d.addItem(a);

    }
}
