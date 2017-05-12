package airplane;

import java.util.Scanner;
import java.util.Arrays;

public class AirlineReservations {

static Plane p=new Plane();
private static Scanner input;

public static void main(String[] args) 

{
    int totalSeats = 10;
    int firstClassSeats = 5;
    int economySeats = 5;
    int classChoice = 0;
    boolean continueInput = true;

    input = new Scanner(System.in);

    boolean[] seatingChart = new boolean[totalSeats];
    Arrays.fill(seatingChart, false);

  
    
    
    
    
    for(;;)
    {
    	
    	 System.out.println("Please enter passanger name:"); //User enter passenger name
         String name=input.nextLine();
         p.setname(name);
         
         System.out.println("Please enter passanger surname:"); // User enter passenger surname
         String surname=input.nextLine();
         p.setsurname(surname);
      
    	
         
        System.out.print("Please type 1 for First Class, 2 for Economy Class, or 3 to exit System: ");
        String uchoice=input.nextLine();
        classChoice = Integer.parseInt(uchoice);
        //classChoice = input.nextInt();
        
        if (classChoice == 3){
        	break ;
        }
        
    
        switch (classChoice) // System choose class type
        {
            case 1:
                if (firstClassSeats > 0)
                {
                    seatingChart[firstClassSeats-1]=true; // System control array
                    firstClassSeats--;//System decrease chart
                    printBoardingPass((firstClassSeats+1), classChoice);// We send parameters this function
                    
                }
                else 
                    System.out.print("\nFirst class seats are now SOLD OUT!\n");
                break;

            case 2:
                if (economySeats > 0)
                {
                    seatingChart[economySeats+4]=true;//System control another array
                    economySeats--;//System decrease capacity
                    printBoardingPass((economySeats+6),classChoice);// We send parameters this function
                    
                }
                else
                    System.out.print("\nEconomy seats are now SOLD OUT!\n"); //When the capacity is full,this line occur
                break;
            default:
                System.out.print("\nIncorrect input.  Please enter only a 1, 2, or 3.");// When user enter incorrect input this line exist
                break;
        } 
     
        
       
        
        
    }
    
    
}

private static void printBoardingPass(int seat, int classChoice)
{
    String seatingClass = (classChoice == 1? "First" : "Economy");
    System.out.print("\nBoarding Pass:  " + seatingClass + " class, Seat # " + seat +"\n\n");//System write seating information
    System.out.print("\nPassanger name:  " +p.getname() + " Passanger surname: " + p.getsurname() +"\n\n");//System write passanger information with the object
}



}