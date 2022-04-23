package pl.sdacademy.java.basic.day3.task9;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderItemTest {

    OrderItem a = new OrderItem("product 1", 2, 4);
    OrderItem b = new OrderItem("product 2", 3, 7);
    OrderItem c = new OrderItem("producnt3", 9, 0);

    @Test
    void getQuantity() {
        //given
        int quantity;
        //when
        quantity = a.getQuantity();
        //then
        assertEquals(2,quantity,"niezgodna ilość");
    }

    @Test
    void getAmount() {
        //given
        double amount;
        //when
        amount = b.getAmount();
        //then
        assertEquals(21, amount, "niezgodna wartość");
    }

    @Test
    void isCorrect() {
        //given
        boolean valid;
        //when
        valid = a.isCorrect();
        //then
        assertTrue(valid);
        assertFalse(c.isCorrect());
    }


}