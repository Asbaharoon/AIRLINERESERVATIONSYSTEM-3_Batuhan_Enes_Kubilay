package airplane;

import java.util.Scanner;
import java.util.Arrays;

public class AirlineReservations {

private String name;
private String surname;
private int ticketno;
private int seatno;
public void setname(String n){name=n;}
public String getname(){return name;}
public void setsurname(String s){surname=s;}
public String getsurname(){return surname;}
public void setticketno(int t){ticketno=t;}
public int getticketno(){return ticketno;}
public void setseatno(int s){seatno=s;}
public int getseatno(){return seatno;}
public Boolean checkName() {
	
	if(name.length()>2){return true;}
	
		else {return false;}
	
	
	
}

public Boolean checkSurname() {
	
	if(surname.length()>2){return true;}
	if(surname.length()>20){return false;}
	else {return false;}
	
	
}
public Boolean checkTicket() {
	
	if(ticketno>0){return true;}
	else {return false;}
	
	
}
public Boolean checkSeat() {
	
	if(seatno>0){return true;}
	else {return false;}
	
	
}
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