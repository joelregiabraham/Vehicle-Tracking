
package assignment2_group13;

public class DangerZoneDisplay implements Observer {
    private static final double DANGER_ZONE_RADIUS = 3.0; // Danger zone radius
    private static final double DANGER_ZONE_CENTER_X = 6.0;
    private static final double DANGER_ZONE_CENTER_Y = 6.0;

    @Override
    public void update(double[][] coordinates) {
        double currentX = coordinates[0][0];
        double currentY = coordinates[0][1];

        // Check if the vehicle is in the danger zone
        if (isInDangerZone(currentX, currentY)) {
            System.out.println("Danger Zone Alert! Vehicle is in the danger zone.");
        }
        else
        {
        	System.out.println("The vehicle is not in the danger zone.");
        }
    }

    private boolean isInDangerZone(double x, double y) {
        // Calculate the distance from the danger zone center
        double distanceFromCenter = Math.sqrt(Math.pow((x - DANGER_ZONE_CENTER_X), 2) + Math.pow((y - DANGER_ZONE_CENTER_Y), 2));
        return distanceFromCenter <= DANGER_ZONE_RADIUS;
    }
}

