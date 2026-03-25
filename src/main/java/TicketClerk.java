/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sakha
 */
public class TicketClerk {
    String name;
    String location;

    public TicketClerk(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void reserveSeat() {
        System.out.println(name + " reserved a seat for passenger.");
    }

    public void reserveTicket() {
        System.out.println(name + " booked a ticket.");
    }

    public void cancelTicket() {
        System.out.println(name + " cancelled a ticket.");
    }

    public void receivePayment(double amount) {
        System.out.println(name + " received payment of ₹" + amount);
    }
}