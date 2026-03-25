/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sakha
 */
public class Main {
    public static void main(String[] args) {

        // Create objects
        Passenger p = new Passenger("Prarthana", 22, "Aurangabad");
        Train train = new Train("Superfast", 123);
        Ticket ticket = new Ticket(1, "Mumbai", "Pune", 101);
        Payment payment = new Payment(ticket.paymentAmount());
        TicketClerk clerk = new TicketClerk("Amit", "Station");
        RailwayDatabase db = new RailwayDatabase(5001);

        // Flow demonstration
        train.showTrain();

        p.searchTrains();
        p.viewSchedule();

        clerk.reserveSeat();
        clerk.reserveTicket();

        p.reserveSeat();
        p.purchaseTicket(ticket);

        p.makePayment(payment);
        clerk.receivePayment(payment.amount);

        db.response();

        p.cancelTicket(ticket);
        ticket.cancelTicket();
    }
}