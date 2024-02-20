package assignment2_group13;

import java.util.Arrays;
/**
 * The `coordinatesOriginatorClass` is responsible for creating and restoring states of
 * its coordinates. It acts as the originator in the Memento design pattern, which allows
 * for the state of an object to be saved and restored without breaking encapsulation.
 */
public class coordinatesOriginatorClass {
	/**
     * The current state of coordinates.
     */
	private double coordinates[][];
	/**
     * Sets the current coordinates state.
     *
     * @param coordinates A 2D array of doubles representing the coordinates.
     */
	public void setCoordinate(double coordinates[][])
	{
		this.coordinates = coordinates;
	}
	
	/**
     * Saves the current coordinates state into a memento object.
     * 
     * @return A new instance of `locationCoordinatesMemento` containing the current state.
     */
	
	public locationCoordinatesMemento storeInMemento()
	{
		System.out.println("From Originator: Saving to Memento");
		return new locationCoordinatesMemento(coordinates);
		
	}
	/**
     * Restores the coordinates state from a memento object.
     * 
     * @param memento The `locationCoordinatesMemento` object from which to restore the state.
     * @return The restored coordinates as a 2D array of doubles.
     */
	public double[][] restoreFromMemento(locationCoordinatesMemento memento)
	{
		coordinates = memento.getCoordinates();
		
		System.out.println("From Originator: Restoring Coordinate " +  Arrays.deepToString(coordinates) + "from Memento.");
		
		return coordinates;

	}

}
