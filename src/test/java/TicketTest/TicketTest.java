/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TicketTest;

import org.junit.Test;
import static org.junit.Assert.*;
import vit.devops.macse639.ticketreservation.*;

public class TicketTest {

    // Test Case 1
    @Test
    public void testPassengerCreation() {
        Passenger p = new Passenger("Prarthana", 22);
        assertEquals("Prarthana", p.getName());
        assertEquals(22, p.getAge());
    }

    // Test Case 2
    @Test
    public void testTrainDetails() {
        Train t = new Train("Express", 101);  // ✅ fixed
        assertEquals("Express", t.getTrainName());
    }

    // Test Case 3
    @Test
    public void testTicketBooking() {
        Ticket t = new Ticket();
        assertTrue(t.bookTicket());
    }

    // Test Case 4
    @Test
    public void testPaymentSuccess() {
        Payment p = new Payment();
        assertTrue(p.makePayment(500));
    }

    // Test Case 5
    @Test
    public void testPaymentFailure() {
        Payment p = new Payment();
        assertFalse(p.makePayment(-100));
    }
}