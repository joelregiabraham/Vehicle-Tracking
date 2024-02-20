package assignment2_group13;

import java.util.Scanner;

/*
 * Project made using JDK 21.
 *  *** WILL NOT RUN UNDER VERSION 17 ***
 */

public class Main {

	public static void main(String[] args) {
		
		/*
		 * This commit includes
		 * the base for assignment 2.
		 * 
		 * Please add your changes and push
		 * accordingly.
		 */

		// Declaring some variables and objects:
		int userChoice;
		boolean isProgramRunning = true;
		// Originator instance of Memento pattern that will be used
		// in tandem with caretaker instance to save coordinates to
		// Memento.
		coordinatesOriginatorClass coordinates = new coordinatesOriginatorClass();
		Scanner coordinatesInput = new Scanner(System.in);
		
		// First greeting message:
		System.out.println("Welcome! Please choose an option:");
		caretakerForMemento caretaker = new caretakerForMemento(); // Initialize caretaker outside the loop
		while (isProgramRunning)
		{
			// Second and onward message to choose an option.
			// Added as a fun attention to detail :)
			System.out.println("Please choose an option:");
			System.out.println("1. Add a coordinate.");
			System.out.println("2. Display total travelled distance.");
			System.out.println("3. Exit the program.");
			
			Scanner userInput = new Scanner(System.in);
			// Only takes an integer. Otherwise, exception is thrown.
			userChoice = userInput.nextInt();
			
			/*
			 * These three outputs are explicit, meaning that the 
			 * user must choose either option to get that specific
			 * output.
			 * 
			 * However, in the background, two things should happen:
			 * 
			 * 1. When a user adds a coordinate, the updateLocation class
			 * must be called and the new coordinates must be saved using memento
			 * (my responsibility - Salah).
			 * 
			 * 2. The program should always print, in a new line, whether the
			 * user enters the danger zone or not (observer design pattern,
			 * responsibility of Joel Abrahan).
			 *  
			 */
			
			switch (userChoice)
			{
			case 1:
				System.out.println("Please enter two coordinates separated by a comma:");
				
				/*
				 * Coordinates need to be parsed and stored to their own variable
				 * so that they can be saved into the 2-D array.
				 * 
				 * Otherwise we will get errors. To do this, we must first
				 * declare an x and y double that will parse the input and save
				 * the two doubles the user provides:
				 */
				
				/*
				 * Parsing needed to be implemented as exceptions were thrown if 
				 * we were just using .nextDouble();
				 */
				String input = coordinatesInput.next();
				String[] parts = input.split(",");
				if (parts.length != 2) {
				    System.out.println("Invalid input format. Please try again.");
				    break;
				}
				double x = Double.parseDouble(parts[0]);
				double y = Double.parseDouble(parts[1]);
				
				// Storing the coordinates in the memento.
                coordinates.setCoordinate(new double[][]{{x, y}});
                locationCoordinatesMemento memento = coordinates.storeInMemento();
                caretaker.addNewCoordinatesMemento(memento);
			 
			  
			    double[][] currentCoordinates = { { x, y } };  
			    DangerZoneDisplay object = new DangerZoneDisplay();
			    object.update(currentCoordinates);


				break;
			case 2:
				
                double totalDistance = coordinatesIterator.calculateTotalDistance(caretaker.savedCoordinates);
                System.out.println("Total travelled distance: " + totalDistance);
			    break;
			case 3:
				// Program exits.
				isProgramRunning = false;
				break;
			default:
				System.out.println("No valid input. Please, try again.");	
			}
		}
		System.out.println("Thanks for using the program! :)");
	}

}
