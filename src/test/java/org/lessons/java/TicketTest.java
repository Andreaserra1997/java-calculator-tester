package org.lessons.java;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {

    @Test
    @DisplayName("Test ticket")
    void price() {
        Ticket ticket = new Ticket(100, 20);
        double price = ticket.getPrice();
        assertEquals(21.0, price, 0.01);
        assertNotEquals(100,price,0.01);
    }

    @Test
    @DisplayName("Test 20%")
    void price20() {
        Ticket ticket = new Ticket(100, 17);
        double price = ticket.getPrice();
        assertEquals(16.8, price, 0.01);
        assertNotEquals(100,price,0.01);
    }

    @Test
    @DisplayName("Test 40%")
    void price40() {
        Ticket ticket = new Ticket(100, 66);
        double price = ticket.getPrice();
        assertEquals(12.6, price, 0.01);
        assertNotEquals(100,price,0.01);
    }

}