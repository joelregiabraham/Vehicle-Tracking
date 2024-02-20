package assignment2_group13;

import java.util.Scanner;
/**
 * The TotalDistance class provides a simple console application to calculate
 * distances related to coordinates input by the user. It calculates the distance
 * from the origin to an initial set of coordinates and the distance between
 * this initial set of coordinates and a new set provided by the user.
 */

public class TotalDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initial coordinates
        double[] initialCoordinates = {0, 0};

        // Get user input for initial coordinates
        System.out.print("Enter initial x-coordinate: ");
        double initialX = scanner.nextDouble();
        System.out.print("Enter initial y-coordinate: ");
        double initialY = scanner.nextDouble();

        // Update initial coordinates
        initialCoordinates[0] = initialX;
        initialCoordinates[1] = initialY;

        // Calculate distance from the origin
        double initialDistance = calculateDistance(initialCoordinates[0], initialCoordinates[1]);
        System.out.println("Distance from the origin: " + initialDistance);

        // Ask for new coordinates
        System.out.print("Enter new x-coordinate: ");
        double newX = scanner.nextDouble();
        System.out.print("Enter new y-coordinate: ");
        double newY = scanner.nextDouble();

        // Calculate distance from the previous point
        double distanceFromPrevious = calculateDistance(newX, newY, initialCoordinates[0], initialCoordinates[1]);
        System.out.println("Distance from the previous point: " + distanceFromPrevious);

        scanner.close();
    }

    /**
     * Calculates the Euclidean distance from the origin (0,0) to a point.
     * 
     * @param x The x-coordinate of the point.
     * @param y The y-coordinate of the point.
     * @return The distance from the origin to the point.
     */
    private static double calculateDistance(double x, double y) {
        return Math.sqrt(x * x + y * y);
    }
 /**
     * Calculates the Euclidean distance between two points.
     * 
     * @param newX The x-coordinate of the new point.
     * @param newY The y-coordinate of the new point.
     * @param prevX The x-coordinate of the previous point.
     * @param prevY The y-coordinate of the previous point.
     * @return The distance between the two points.
     */ // Calculate distance from the previous point
    private static double calculateDistance(double newX, double newY, double prevX, double prevY) {
        double deltaX = newX - prevX;
        double deltaY = newY - prevY;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}
