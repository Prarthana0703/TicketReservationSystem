/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sakha
 */
public class Ticket {
    int ticketNo;
    String startLocation;
    String destination;
    int passengerNo;

    public Ticket(int ticketNo, String startLocation, String destination, int passengerNo) {
        this.ticketNo = ticketNo;
        this.startLocation = startLocation;
        this.destination = destination;
        this.passengerNo = passengerNo;
    }

    public double paymentAmount() {
        return 500.0; // sample amount
    }

    public void cancelTicket() {
        System.out.println("Ticket " + ticketNo + " is cancelled.");
    }
}
