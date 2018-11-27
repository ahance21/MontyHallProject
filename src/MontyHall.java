import java.util.Random;
import java.util.Scanner;

public class MontyHall {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		String bread = keyboard.nextLine();
		Random rand = new Random();
		
		
		
		int carDoor = rand.nextInt(3) + 1;
		int goatDoor = rand.nextInt(3) + 1;
		
		System.out.print("Please guess which car the door is behind");
		String doorStr = keyboard.nextLine();
		int door = Integer.parseInt(doorStr);
		if (door<1 || door>3)
		System.out.print("The door number is invalid ");
		
		System.out.print("\nYou guessed " + door);
		
		bread = keyboard.nextLine();
		
		System.out.print("Door " +" " + goatDoor +" " + "has the goat in it ");
		System.out.print("\nWould you like to open the last door? ");
		String answer = keyboard.nextLine();
		
		if(answer.equals("yes"))
		{
			System.out.print("Please hit enter to continue ");
			bread = keyboard.nextLine();
		
			System.out.print("Please enter the number of the last door ");
			String lastdoorStr = keyboard.nextLine();
			int lastdoor = Integer.parseInt(lastdoorStr);
			
			if (lastdoor == carDoor)
			System.out.print("You won! ");
			if (lastdoor != carDoor)
			System.out.print("You lost ");
		}
		
		 
		
		
		
			
		
			
		
	}

}
