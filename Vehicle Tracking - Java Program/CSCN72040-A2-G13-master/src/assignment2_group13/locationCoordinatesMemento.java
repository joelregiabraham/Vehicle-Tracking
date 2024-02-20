package assignment2_group13;

/**
 * The `locationCoordinatesMemento` class represents a memento object in the Memento design pattern.
 * It is used to store the state of an object (in this case, location coordinates) so that it can be restored at a later time.
 * This class specifically handles the storage of location coordinates, encapsulating them in a manner that does not
 * expose the details of the stored state to other objects, except for the originator that created it.
 */

public class locationCoordinatesMemento {
   /**
     * The stored coordinates in a 2D array format.
     */
	private double coordinates[][];
	/**
     * Constructs a new `locationCoordinatesMemento` object to store a snapshot of location coordinates.
     *
     * @param coordinates A 2D array of doubles representing the coordinates to be stored.
     */
	public locationCoordinatesMemento(double coordinates[][])
	{
		this.coordinates = coordinates;
	}
	/**
     * Retrieves the stored coordinates.
     *
     * @return The stored coordinates as a 2D array of doubles.
     */
	public double[][] getCoordinates()
	{
		return coordinates;
	}
	

}
