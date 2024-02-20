package assignment2_group13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class coordinatesIterator implements iteratorInterface, Iterator<double[][]> {

    private ArrayList<locationCoordinatesMemento> mementos = new ArrayList<>();
    private int index;
    private int innerIndex;

    public coordinatesIterator(ArrayList<locationCoordinatesMemento> mementos) {
        this.mementos = mementos;
        this.index = 0;
        this.innerIndex = 0;
    }

 // Overriding the hasNext method from the Iterator interface
    @Override
    public boolean hasNext() {
        return index < mementos.size() && innerIndex < mementos.get(index).getCoordinates().length;
    }

 // Overriding the next method from the Iterator interface
    @Override
    public double[][] next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more elements to iterate over");
        }
        double[][] coordinates = mementos.get(index).getCoordinates();
        innerIndex++;
        if (innerIndex >= coordinates.length) {
            index++;
            innerIndex = 0;
        }
        return coordinates;
    }
    
    /*
     * These functions serve to calculate the total distance between all coordinates
     * stored in the memento.
     * 
     * The upper function traverses through all the coordinates and calls the
     * calculateDistance function to get the distance between two specific points.
     */

 // Updated the calculateTotalDistance method to use the iterator
    public static double calculateTotalDistance(ArrayList<locationCoordinatesMemento> mementos) {
        double totalDistance = 0.0;
        coordinatesIterator iterator = new coordinatesIterator(mementos);  // Create an instance of the iterator
        double[] previousCoordinates = null;
        
        // Use the iterator to traverse through the coordinates
        while (iterator.hasNext()) {
            double[][] currentCoordinates = iterator.next();
            
            if (previousCoordinates != null) {
                for (int i = 0; i < currentCoordinates.length; i++) {
                    double[] currentCoord = currentCoordinates[i];
                    // Calculate distance between previous and current coordinates
                    totalDistance += calculateDistance(previousCoordinates, currentCoord);
                    previousCoordinates = currentCoord;
                }
            } else {
                previousCoordinates = currentCoordinates[0];
            }
        }
        return totalDistance;
    }

    // Updated the calculateDistance method to use double[] instead of double[][]
    private static double calculateDistance(double[] coord1, double[] coord2) {
        // Calculate distance between two coordinates using the distance formula
        return Math.sqrt(Math.pow(coord2[0] - coord1[0], 2) + Math.pow(coord2[1] - coord1[1], 2));
    }

 // Overriding the createIterator method from the iteratorInterface
    @Override
    public Iterator<double[][]> createIterator() {
        return new coordinatesIterator(mementos);  // Return an instance of the iterator
    }


}
