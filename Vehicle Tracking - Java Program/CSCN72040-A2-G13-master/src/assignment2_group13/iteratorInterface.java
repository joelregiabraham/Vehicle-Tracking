package assignment2_group13;
import java.util.Iterator;
/*
 * This iterator class will allow us to access
 * all coordinates previously implemented using the Memento
 * design pattern, and will be used to calculate
 * total distance.
 * 
 * This interface will be used to create iterators 
 * and traverse through coordinates stored in Memennto.
 */

public interface iteratorInterface {
	
	/*
	 * The Java Iterator library must be imported
	 * and added to implement functionality.
	 */
	public Iterator createIterator();

	// These two are used to iterate over stored coordinates.
	boolean hasNext();
	double[][] next();

}
