/* 
* Proj2.java
* <Maria Traskowsky / Lab Section A / 2:30-4:20>

* This program generates 5 random cards, displaying the number and suit.
* This program also determines whether you have a pair, or triples of the same card.
* This program evaluates the highest card of the 5 and displays it. 
*
* EXTRA CREDIT: Program will show triples of cards.
*/

import java.util.*;

public class Proj2 {
    public static void main(String [] args) {


        String [] cardSuits = {"Diamonds", "Hearts", "Clubs", "Spades"};
        String [] cardNums = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        Random random = new Random();

        System.out.println("Your hand is: ");

        // Draws 5 random cards

        String card1 = cardNums[random.nextInt(13)] + " of " + cardSuits[random.nextInt(3)];
        String card2 = cardNums[random.nextInt(13)] + " of " + cardSuits[random.nextInt(3)];
        String card3 = cardNums[random.nextInt(13)] + " of " + cardSuits[random.nextInt(3)];
        String card4 = cardNums[random.nextInt(13)] + " of " + cardSuits[random.nextInt(3)];
        String card5 = cardNums[random.nextInt(13)] + " of " + cardSuits[random.nextInt(3)];

        System.out.println("    " + card1);
        System.out.println("    " + card2);
        System.out.println("    " + card3);
        System.out.println("    " + card4);
        System.out.println("    " + card5);

        String[] card1S = card1.split(" ");
        String[] card2S = card2.split(" ");
        String[] card3S = card3.split(" ");
        String[] card4S = card4.split(" ");
        String[] card5S = card5.split(" ");

        String firstCard = card1S[0];
        String secondCard = card2S[0];
        String thirdCard = card3S[0];
        String fourthCard = card4S[0];
        String fifthCard = card5S[0];

        System.out.println(""); // Prints blank line

        // This part of the program checks for pairs
        // EXTRA CREDIT: finding triples
        if (Objects.equals(firstCard, secondCard)) {
            if (Objects.equals(firstCard, thirdCard)) {
                System.out.println("You have triple " + firstCard + "s");
            } else if (Objects.equals(firstCard, fourthCard)) {
                System.out.println("You have triple " + firstCard + "s");
            } else if (Objects.equals(firstCard, fifthCard)) {
                System.out.println("You have triple " + firstCard + "s");
            } else { 
                System.out.println("You have a pair of " + card1S[0] + "s");
            }
        } else if (Objects.equals(firstCard, thirdCard)) {
            if (Objects.equals(firstCard, fourthCard)) {
                System.out.println("You have triple " + firstCard + "s");
            } else if (Objects.equals(firstCard, fifthCard)) {
                System.out.println("You have triple " + firstCard + "s");
            } else { 
                System.out.println("You have a pair of " + card1S[0] + "s");
            }
        }
        else if (Objects.equals(firstCard, fourthCard)) {
            if (Objects.equals(firstCard, fifthCard)) {
                System.out.println("You have triple " + firstCard + "s");
            } else { 
                System.out.println("You have a pair of " + card1S[0] + "s");
            }
        }
        else if (Objects.equals(firstCard, fifthCard)) {
            System.out.println("You have a pair of " + card1S[0] + "s");
        }
        else if (Objects.equals(secondCard, thirdCard)) {
            System.out.println("You have a pair of " + card2S[0] + "s");
        }
        else if (Objects.equals(secondCard, fourthCard)) {
            System.out.println("You have a pair of " + card2S[0] + "s");
        }
        else if (Objects.equals(secondCard, fifthCard)) {
            System.out.println("You have a pair of " + card2S[0] + "s");
        }
        else if (Objects.equals(thirdCard, fourthCard)) {
            System.out.println("You have a pair of " + card3S[0] + "s");
        }
        else if (Objects.equals(thirdCard, fifthCard)) {
            System.out.println("You have a pair of " + card3S[0] + "s");
        }
        else if (Objects.equals(fourthCard, fifthCard)) {
            System.out.println("You have a pair of " + card4S[0] + "s");
        }
        else {
            System.out.println("You have no pairs");
        }

        System.out.println(""); // Prints blank line

    // This is the part of the program that determines the highest card
        System.out.print("Your highest card is a(n) ");

    // checking all 5 cards to see if any equal to Ace
        if (Objects.equals(card1S[0], cardNums[12]))    {
            System.out.print(card1S[0]);
        } else if (Objects.equals(card2S[0], cardNums[12]))    {
            System.out.print(card2S[0]);
        } else if (Objects.equals(card3S[0], cardNums[12]))    {
            System.out.print(card3S[0]);
        } else if (Objects.equals(card4S[0], cardNums[12]))    {
            System.out.print(card4S[0]);
        } else if (Objects.equals(card5S[0], cardNums[12]))    {
            System.out.print(card5S[0]);            
    // checks all 5 cards to see if any are equal to King
        } else if (Objects.equals(card1S[0], cardNums[11]))    {
            System.out.print(card1S[0]);
        } else if (Objects.equals(card2S[0], cardNums[11]))    {
            System.out.print(card2S[0]);
        } else if (Objects.equals(card3S[0], cardNums[11]))    {
            System.out.print(card3S[0]);
        } else if (Objects.equals(card4S[0], cardNums[11]))    {
            System.out.print(card4S[0]);
        } else if (Objects.equals(card5S[0], cardNums[11]))    {
            System.out.print(card5S[0]);
    // checks all 5 cards to see if any are equal to Queen
        } else if (Objects.equals(card1S[0], cardNums[10]))    {
            System.out.print(card1S[0]);
        } else if (Objects.equals(card2S[0], cardNums[10]))    {
            System.out.print(card2S[0]);
        } else if (Objects.equals(card3S[0], cardNums[10]))    {
            System.out.print(card3S[0]);
        } else if (Objects.equals(card4S[0], cardNums[10]))    {
            System.out.print(card4S[0]);
        } else if (Objects.equals(card5S[0], cardNums[10]))    {
            System.out.print(card5S[0]);
    // checks all 5 cards to see if any are equal to Jack
        } else if (Objects.equals(card1S[0], cardNums[9]))    {
            System.out.print(card1S[0]);
        } else if (Objects.equals(card2S[0], cardNums[9]))    {
            System.out.print(card2S[0]);
        } else if (Objects.equals(card3S[0], cardNums[9]))    {
            System.out.print(card3S[0]);
        } else if (Objects.equals(card4S[0], cardNums[9]))    {
            System.out.print(card4S[0]);
        } else if (Objects.equals(card5S[0], cardNums[9]))    {
            System.out.print(card5S[0]);
    // checks all 5 cards to see if any are equal to 10
        } else if (Objects.equals(card1S[0], cardNums[8]))    {
            System.out.print(card1S[0]);
        } else if (Objects.equals(card2S[0], cardNums[8]))    {
            System.out.print(card2S[0]);
        } else if (Objects.equals(card3S[0], cardNums[8]))    {
            System.out.print(card3S[0]);
        } else if (Objects.equals(card4S[0], cardNums[8]))    {
            System.out.print(card4S[0]);
        } else if (Objects.equals(card5S[0], cardNums[8]))    {
            System.out.print(card5S[0]);
    // checks all 5 cards to see if any are equal to 9
        } else if (Objects.equals(card1S[0], cardNums[7]))    {
            System.out.print(card1S[0]);
        } else if (Objects.equals(card2S[0], cardNums[7]))    {
            System.out.print(card2S[0]);
        } else if (Objects.equals(card3S[0], cardNums[7]))    {
            System.out.print(card3S[0]);
        } else if (Objects.equals(card4S[0], cardNums[7]))    {
            System.out.print(card4S[0]);
        } else if (Objects.equals(card5S[0], cardNums[7]))    {
            System.out.print(card5S[0]);
    // checks all 5 cards to see if any are equal to 8
        } else if (Objects.equals(card1S[0], cardNums[6]))    {
            System.out.print(card1S[0]);
        } else if (Objects.equals(card2S[0], cardNums[6]))    {
            System.out.print(card2S[0]);
        } else if (Objects.equals(card3S[0], cardNums[6]))    {
            System.out.print(card3S[0]);
        } else if (Objects.equals(card4S[0], cardNums[6]))    {
            System.out.print(card4S[0]);
        } else if (Objects.equals(card5S[0], cardNums[6]))    {
            System.out.print(card5S[0]);
    // checks all 5 cards to see if any are equal to 7
        } else if (Objects.equals(card1S[0], cardNums[5]))    {
            System.out.print(card1S[0]);
        } else if (Objects.equals(card2S[0], cardNums[5]))    {
            System.out.print(card2S[0]);
        } else if (Objects.equals(card3S[0], cardNums[5]))    {
            System.out.print(card3S[0]);
        } else if (Objects.equals(card4S[0], cardNums[5]))    {
            System.out.print(card4S[0]);
        } else if (Objects.equals(card5S[0], cardNums[5]))    {
            System.out.print(card5S[0]);
    // checks all 5 cards to see if any are equal to 6
        } else if (Objects.equals(card1S[0], cardNums[4]))    {
            System.out.print(card1S[0]);
        } else if (Objects.equals(card2S[0], cardNums[4]))    {
            System.out.print(card2S[0]);
        } else if (Objects.equals(card3S[0], cardNums[4]))    {
            System.out.print(card3S[0]);
        } else if (Objects.equals(card4S[0], cardNums[4]))    {
            System.out.print(card4S[0]);
        } else if (Objects.equals(card5S[0], cardNums[4]))    {
            System.out.print(card5S[0]);
    // checks all 5 cards to see if any are equal to 5
        } else if (Objects.equals(card1S[0], cardNums[3]))    {
            System.out.print(card1S[0]);
        } else if (Objects.equals(card2S[0], cardNums[3]))    {
            System.out.print(card2S[0]);
        } else if (Objects.equals(card3S[0], cardNums[3]))    {
            System.out.print(card3S[0]);
        } else if (Objects.equals(card4S[0], cardNums[3]))    {
            System.out.print(card4S[0]);
        } else if (Objects.equals(card5S[0], cardNums[3]))    {
            System.out.print(card5S[0]);
    // checks all 5 cards to see if any are equal to 4
        } else if (Objects.equals(card1S[0], cardNums[2]))    {
            System.out.print(card1S[0]);
        } else if (Objects.equals(card2S[0], cardNums[2]))    {
            System.out.print(card2S[0]);
        } else if (Objects.equals(card3S[0], cardNums[2]))    {
            System.out.print(card3S[0]);
        } else if (Objects.equals(card4S[0], cardNums[2]))    {
            System.out.print(card4S[0]);
        } else if (Objects.equals(card5S[0], cardNums[2]))    {
            System.out.print(card5S[0]);
    // checks all 5 cards to see if any are equal to 3
        } else if (Objects.equals(card1S[0], cardNums[1]))    {
            System.out.print(card1S[0]);
        } else if (Objects.equals(card2S[0], cardNums[1]))    {
            System.out.print(card2S[0]);
        } else if (Objects.equals(card3S[0], cardNums[1]))    {
            System.out.print(card3S[0]);
        } else if (Objects.equals(card4S[0], cardNums[1]))    {
            System.out.print(card4S[0]);
        } else if (Objects.equals(card5S[0], cardNums[1]))    {
            System.out.print(card5S[0]);
    // checks all 5 cards to see if any are equal to 2
        } else if (Objects.equals(card1S[0], cardNums[0]))    {
            System.out.print(card1S[0]);
        } else if (Objects.equals(card2S[0], cardNums[0]))    {
            System.out.print(card2S[0]);
        } else if (Objects.equals(card3S[0], cardNums[0]))    {
            System.out.print(card3S[0]);
        } else if (Objects.equals(card4S[0], cardNums[0]))    {
            System.out.print(card4S[0]);
        } else if (Objects.equals(card5S[0], cardNums[0]))    {
            System.out.print(card5S[0]);
        }
        System.out.println(""); // prints blank line

    } // end main
} // end class