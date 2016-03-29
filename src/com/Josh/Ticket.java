package com.Josh;
import java.util.Date;
import java.util.*;

/**
 * Created by Destro on 3/22/2016.
 */
public class Ticket {

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateReported() {
        return dateReported;
    }

    public void setDateReported(Date dateReported) {
        this.dateReported = dateReported;
    }

    private int priority;
    private String reporter; //Stores person or department who reported issue
    private String description;
    private Date dateReported;


    //We can autogenerate get and set methods if and when we need

    //A constructor would be useful

    public Ticket(String desc, int p, String rep, Date date) {
        this.description = desc;
        this.priority = p;
        this.reporter = rep;
        this.dateReported = date;
        }

    //Called automatically if a Ticket object is an argument to System.out.println
    public String toString(){
        return(this.description + " Priority: " + this.priority + " Reported by: "
                + this.reporter + " Reported on: " + this.dateReported);
    }


    protected static void deleteTicket(LinkedList<Ticket> ticketQueue) {
        TicketManager outputTickets = new TicketManager();
        outputTickets.printAllTickets(ticketQueue);   //display list for user

        if (ticketQueue.size() == 0) {    //no tickets!
            System.out.println("No tickets to delete!\n");
            return;
        }

        Scanner deleteScanner = new Scanner(System.in);
        System.out.println("Enter ID of ticket to delete");
        int deleteID = deleteScanner.nextInt();

//        Loop over all tickets. Delete the one with this ticket ID
//        boolean found = false;
//        for (Ticket ticket : ticketQueue) {
//            if (ticket.getTicketID() == deleteID) {
//                found = true;
//                ticketQueue.remove(ticket);
//                System.out.println(String.format("Ticket %d deleted", deleteID));
//                break; //don't need loop any more.
//            }
//        }
//        if (found == false) {
//            System.out.println("Ticket ID not found, no ticket deleted");
//            //TODO – re-write this method to ask for ID again if not found
//        }
        outputTickets.printAllTickets(ticketQueue);  //print updated list

    }



}
