/* 
* Proj3.java
* <Maria Traskowsky / Lab Section A / 2:30-4:20>
*
* This program calculates and displays the cost of tickets and associated fees for the
* 2019 KSU Football season. The program accepts user inputs for category, seat location, 
* number of tickets, and whether the user wants to purchase a parking pass for an additional 
* fee. At the bottom of the program, the order total is calculated and displayed to the user.
*
*/

import java.util.*;
import java.text.DecimalFormat;

public class Proj3 {
    public static void main(String [] args) {

    Scanner s = new Scanner(System.in); // scans in user values
    DecimalFormat df = new DecimalFormat ("$#,###,###.00");

    int beginAgain = 0; 
while (beginAgain == 0) { // outer loop 

// declare variables used in the program
    double ticketPrice = 0;
    final double TICKET_PRICE_VIEW_LEVEL = 150;
    final double TICKET_PRICE_PREMIUM_VIEW_LEVEL = 272;
    final double TICKET_PRICE_PREMIUM_BENCH = 323;
    final double TICKET_PRICE_CLUB_LEVEL = 455;

    double PARKING_PRICE = 100;

    double discountRate = 0;
    final double DISCOUNT_PERCENT_ALUMNI = 0.05;
    final double DISCOUNT_PERCENT_FACULTY_AND_STAFF = 0.10;
    final double DISCOUNT_PERCENT_MILITARY = 0.20;
    final double DISCOUNT_PERCENT_STUDENT = 0.50;

    double taxAmount = 0;
    final double TAX_RATE = 0.066;

    double processingFee = 0;
    final double PROCESSING_FEE_PER_TICKET = 2;

    double requiredDonation = 0;
    final double DONATION_VIEW_LEVEL = 0;
    final double DONATION_PREMIUM_VIEW_LEVEL = 200;
    final double DONATION_PREMIUM_BENCH = 500;
    final double DONATION_CLUB_LEVEL = 1300;

    double orderTotal = 0;

    int category = 0;
    int seatLocation = 0;
    int numTickets;
    int parkingPassQuestion = 0;
    char parkingPassYesOrNo;
    double totalTicketPrice;
    double totalDiscountAmount;
    double subTotal = 0;
    String typeOfSeat = "None";
    String withOrWithoutParking = "None";

    int orderMoreTicketQuestion = 0;
    char orderMoreTickets;
    
    System.out.println();
    System.out.println("*** Welcome to the KSU Season Ticket App for the 2019 Season ***");
    System.out.println("            --- Show your Purple Pride! ---"); 
    System.out.println();

// user enters category
    System.out.println("Please select from the following categories: ");
    System.out.println("1) Student"); 
    System.out.println("2) Alumni"); 
    System.out.println("3) Faculty or Staff"); 
    System.out.println("4) Military"); 
    System.out.println("5) General Public"); 
    System.out.println();
    
    while (category == 0) { // while loop 1
        category = s.nextInt(); // reads user input: category 
    if (category >= 1 && category <= 5) { // while loop 2 
        if (category == 1) { // Student 
        System.out.println("Selection: 1");
        discountRate = DISCOUNT_PERCENT_STUDENT;
        processingFee = 0;
        requiredDonation = 0;
        }
        else if (category == 2) { // Alumni
        System.out.println("Selection: 2");
        discountRate = DISCOUNT_PERCENT_ALUMNI;
        processingFee = PROCESSING_FEE_PER_TICKET;
        }
        else if (category == 3) { // Faculty or staff
        System.out.println("Selection: 3");
        discountRate = DISCOUNT_PERCENT_FACULTY_AND_STAFF;
        }
        else if (category == 4) { // Military
        System.out.println("Selection: 4");
        discountRate = DISCOUNT_PERCENT_MILITARY;
        processingFee = 0;
        }
        else if (category == 5) { // General Public
        System.out.println("Selection: 5");
        discountRate = 0;
        processingFee = PROCESSING_FEE_PER_TICKET;
        } 
    }
    else { // if user does not select a value between 1 and 5, display error and ask again
        System.out.println("***Invalid Selection. Please enter a number 1-5 only.");
        category = 0; // reset category to 0 so that it enters the while loop again

    }// ends while loop 2
} // ends while loop 1
    
    System.out.println(); // spacing 

// user enters seat location
    System.out.println("Please select from the following seat locations: ");
    System.out.println("1) View Level"); 
    System.out.println("2) Premium View Level"); 
    System.out.println("3) Premium Bench"); 
    System.out.println("4) Club Level (non-students only)"); 
    System.out.println(); // spacing 


    while (seatLocation == 0 && typeOfSeat == "None") { // while loop 1
        seatLocation = s.nextInt(); // reads user input: seatLocation 
    if (seatLocation >= 1 && seatLocation <= 4) { // while loop 2 
        if (seatLocation == 1) { // View level 
        System.out.println("Selection: 1");
        typeOfSeat = "View Level";
        ticketPrice = TICKET_PRICE_VIEW_LEVEL;
        requiredDonation = DONATION_VIEW_LEVEL;
        } 
        else if (seatLocation == 2) { // Premium view level
        System.out.println("Selection: 2");
        typeOfSeat = "Premium View Level";
        ticketPrice = TICKET_PRICE_PREMIUM_VIEW_LEVEL;
        requiredDonation = DONATION_PREMIUM_VIEW_LEVEL;

        }
        else if (seatLocation == 3) { // Premium bench
        System.out.println("Selection: 3");
        typeOfSeat = "Premium Bench";
        ticketPrice = TICKET_PRICE_PREMIUM_BENCH;
        requiredDonation = DONATION_PREMIUM_BENCH;

        }
        else if (seatLocation == 4) { // Club level
            if (category == 1) { // Students cannot purchase club level seats
            System.out.println("Students cannot purchase club level seats. Please choose another seat location.");
            seatLocation = 0;
            typeOfSeat = "None";
            }
            else {
            System.out.println("Selection: 4");
            typeOfSeat = "Club Level";
            ticketPrice = TICKET_PRICE_CLUB_LEVEL;
            requiredDonation = DONATION_CLUB_LEVEL;
            }
        }
    }
    else { // if user does not select a value between 1 and 4, display error and ask again

        System.out.println("***Invalid Selection. Please enter a number 1-4 only.");
        seatLocation = 0; // reset category to 0 so that it enters the while loop again

    }// ends while loop 2
} // ends while loop 1

System.out.println(); // spacing 

// user enters numTickets
    System.out.print("How many tickets would you like to purchase? "); 
    numTickets = s.nextInt(); // reads user input: numTickets 
    System.out.println(); // spacing 

// user says Yes or No for parking pass 
// use if statement, if (nextline = Y) { Add 100 to total price} else add nothing
    System.out.println("Would you like to purchase a parking pass for an additional $100? (‘Y’ or ‘N’): ");
    while (parkingPassQuestion == 0 && withOrWithoutParking == "None") {
        parkingPassYesOrNo = s.next().charAt(0); // reads user input: parkingPassFee 
        if (parkingPassYesOrNo == 'Y' || parkingPassYesOrNo == 'y') {
            withOrWithoutParking = "WITH parking";
            break;
        }
       else {
           withOrWithoutParking = "WITHOUT parking";
           PARKING_PRICE = 0;
           break;
       }
    } // end while loop

    System.out.println();

// FINAL ORDER TICKET: calculates and displays all fees
    System.out.println("You ordered " + numTickets + " " + typeOfSeat + " seats " + withOrWithoutParking);
   
    totalTicketPrice = ticketPrice * numTickets;
    System.out.println("Tickets: " + df.format (totalTicketPrice));
    
    totalDiscountAmount = (totalTicketPrice * discountRate);
    System.out.println("Discount: " + df.format (totalDiscountAmount));
    
    System.out.println("Processing Fee: " + df.format ((processingFee * numTickets)));
    
    subTotal = (totalTicketPrice - totalDiscountAmount) + (processingFee * numTickets);
    System.out.println("Subtotal: " + df.format (subTotal));

    taxAmount = TAX_RATE * subTotal;
    System.out.println("Sales Tax: " + df.format (taxAmount));

    if (category == 1) { // Student does not to donate money
        requiredDonation = 0; 
        System.out.println("Required Donation: " + df.format (requiredDonation));
    }
    else { System.out.println("Required Donation: " + df.format (requiredDonation));
    }

    System.out.println("Parking: " + df.format (PARKING_PRICE));
    
    orderTotal = subTotal + taxAmount + requiredDonation + PARKING_PRICE;
    System.out.println("Total: " + df.format (orderTotal));

    System.out.println();
    System.out.println("Would you like to order more tickets? ('Y' or 'N'): ");
    orderMoreTickets = s.next().charAt(0); // reads user input: orderMoreTickets 

    if (orderMoreTickets == 'Y' || orderMoreTickets == 'y') { 
        beginAgain = 0;
    }
    else {
        break;
    }
} // end big while loop that restarts whole ticket order process
    
     } // end main
    } // end class
