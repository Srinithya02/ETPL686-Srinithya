package com.evergent.coreJAVA.Srinithya.CaseStudy1;

import java.util.ArrayDeque;
import java.util.Deque;

public class SupportTicketSystem {
    // Initializing ticketQueue directly
    private Deque<String> ticketQueue = new ArrayDeque<>();

    // Method to add a ticket to the queue
    public void addTicket(String ticket) {
        ticketQueue.add(ticket);
        System.out.println("Added: " + ticket);
    }

    // Method to process the next ticket
    public void processNextTicket() {
        String ticket = ticketQueue.poll();
        if (ticket != null) {
            System.out.println("Processed: " + ticket);
        } else {
            System.out.println("No tickets to process.");
        }
    }

    // Method to peek at the next ticket without removing it
    public void peekNextTicket() {
        String ticket = ticketQueue.peek();
        if (ticket != null) {
            System.out.println("Next ticket: " + ticket);
        } else {
            System.out.println("No tickets in the queue.");
        }
    }

    // Method to display all tickets currently in the queue
    public void displayQueue() {
        System.out.println("Current queue: " + ticketQueue);
    }

    // Main method (entry point)
    public static void main(String[] args) {
        SupportTicketSystem system = new SupportTicketSystem();
        
        // Using the methods
        system.addTicket("Ticket 1: Issue with recipt generation");
        system.addTicket("Ticket 2: Issue with booking multiple tickets");
        system.addTicket("Ticket 3: Issue with sign up");
        
        system.displayQueue();
        system.processNextTicket();
        system.peekNextTicket();
        system.displayQueue();
        system.processNextTicket();
        system.processNextTicket();
        system.processNextTicket();  // Handling empty queue gracefully
    }
}