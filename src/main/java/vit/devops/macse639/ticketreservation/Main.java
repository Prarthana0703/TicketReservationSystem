/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sakha
 */
package vit.devops.macse639.ticketreservation;

public class Main {
    public static void main(String[] args) {

        // Create objects
        Passenger p = new Passenger("Prarthana", 22);
        Train train = new Train("Superfast", 123);
        Ticket ticket = new Ticket();
        Payment payment = new Payment();

        // Display details
        System.out.println("Passenger Name: " + p.getName());
        System.out.println("Passenger Age: " + p.getAge());

        System.out.println("Train Name: " + train.getTrainName());

        // Ticket booking
        boolean isBooked = ticket.bookTicket();
        System.out.println("Ticket Booked: " + isBooked);

        // Payment
        boolean isPaid = payment.makePayment(500);
        System.out.println("Payment Status: " + isPaid);

        // Cancel ticket (demo)
        System.out.println("Ticket Cancelled Successfully");
    }
}