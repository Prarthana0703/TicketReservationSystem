/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sakha
 */
public class Passenger {
    String name;
    int age;
    String address;

    public Passenger(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void searchTrains() {
        System.out.println(name + " is searching for trains...");
    }

    public void viewSchedule() {
        System.out.println(name + " is viewing train schedule...");
    }

    public void reserveSeat() {
        System.out.println(name + " reserved a seat.");
    }

    public void purchaseTicket(Ticket ticket) {
        System.out.println(name + " purchased ticket: " + ticket.ticketNo);
    }

    public void cancelTicket(Ticket ticket) {
        System.out.println(name + " cancelled ticket: " + ticket.ticketNo);
    }

    public void makePayment(Payment payment) {
        System.out.println(name + " made payment of ₹" + payment.amount);
    }
}
