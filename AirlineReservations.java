package airplane;

import java.util.Scanner;
import java.util.Arrays;

public class AirlineReservations 
{

public static void main(String[] args) 
{
    int totalSeats = 10;
    int firstClassSeats = 5;
    int economySeats = 5;
    int classChoice = 0;
    boolean continueInput = true;

    Scanner input = new Scanner(System.in);

    boolean[] seatingChart = new boolean[totalSeats];
    Arrays.fill(seatingChart, false);

    while (continueInput == true)
    {
        System.out.print("Please type 1 for First Class, 2 for Economy Class, or 3 to exit System: ");
        classChoice = input.nextInt();
        switch (classChoice)
        {
            case 1:
                if (firstClassSeats > 0)
                {
                    seatingChart[firstClassSeats-1]=true;
                    firstClassSeats--;
                    printBoardingPass((firstClassSeats+1), classChoice);
                    
                }
                else 
                    System.out.print("\nFirst class seats are now SOLD OUT!\n");
                break;

            case 2:
                if (economySeats > 0)
                {
                    seatingChart[economySeats+4]=true;
                    economySeats--;
                    printBoardingPass((economySeats+6),classChoice);
                    
                }
                else
                    System.out.print("\nEconomy seats are now SOLD OUT!\n");
                break;
            case 3:
                continueInput = false;
                break;
            default:
                System.out.print("\nIncorrect input.  Please enter only a 1, 2, or 3.");
                break;
        }          
    }
}

private static void printBoardingPass(int seat, int classChoice)
{
    String seatingClass = (classChoice == 1? "First" : "Economy");
    System.out.print("\nBoarding Pass:  " + seatingClass + " class, Seat # " + seat +"\n\n");
}


}