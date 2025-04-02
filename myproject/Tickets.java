package com.mvj.ticketbooking;

public class Tickets {
	static int ticket=10;
	
	static {
		System.out.println("Ticket Booking....");
	}
	
	
	void available_tickets() {
		System.out.println("available tickets are"+ticket);
       if(ticket>0) {
    	   ticket--;
    	   System.out.println("Ticket booked successfully and Now the available tickets are"+ticket);
       }
      else {
    		   System.out.println("No tickets available");
    	   }
       }

}
