package pl.sdacademy.java.basic.day3.task9;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    OrderItem a = new OrderItem("product 1", 2, 4);
    OrderItem b = new OrderItem("product 2", 3, 7);
    OrderItem c = new OrderItem("producnt3", 9, 0);
    Order d = new Order(3);


    @Test
    void addItem() {
        //given
        //when

        //then
        assertTrue( d.addItem(a));
        assertTrue( d.addItem(a));
        assertFalse( d.addItem(c));
        assertTrue( d.addItem(a));
        assertFalse( d.addItem(a));
        assertEquals(c.isCorrect(),false,"zwrócono false");

    }

    @Test
    void getTotalAmount() {
        //given
        double totalAmount;
        //when
        d.addItem(a);
        d.addItem(b);
        totalAmount = d.getTotalAmount();
        //then
        assertEquals(29,totalAmount);
    }

    @Test
    void getItemsCount() {
        //given
        int itemsCount;
        //when
        d.addItem(a);
        d.addItem(b);
        itemsCount = d.getItemsCount();
        //then
        assertEquals(5,itemsCount);
    }
}