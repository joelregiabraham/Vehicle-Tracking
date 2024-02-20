package assignment2_group13;

import java.util.ArrayList;
/**
 * The Caretaker class for the Memento pattern. It is responsible for keeping track of
 * the `locationCoordinatesMemento` objects. This class can add new memento objects to
 * the internal list and retrieve them based on an index, enabling the functionality to
 * restore to a previously saved state.
 */
public class caretakerForMemento {
/**
  * A list to hold saved `locationCoordinatesMemento` objects.
  */
	ArrayList<locationCoordinatesMemento> savedCoordinates = new ArrayList<locationCoordinatesMemento>();
 /**
  * Adds a new `locationCoordinatesMemento` object to the list of saved coordinates.
  *
  * @param m The memento object to add.
  */
	public void addNewCoordinatesMemento(locationCoordinatesMemento m) { savedCoordinates.add(m); }
	
/**
  * Retrieves a `locationCoordinatesMemento` object from the list of saved coordinates
  * based on the specified index. This enables the ability to restore to a previously
  * saved state.
  *
  * @param index The index of the memento object to retrieve.
  * @return The `locationCoordinatesMemento` object at the specified index.
  */
	
	public locationCoordinatesMemento getCoordinates(int index) {return savedCoordinates.get(index);}
	

}
