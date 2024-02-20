package assignment2_group13;

/**
 * The Observer interface is part of the Observer design pattern.
 * It is used to update all observer objects automatically when a subject's state changes.
 * This particular Observer interface is designed to receive updates containing
 * a 2D array of doubles representing coordinates, which could signify a change in location
 * or any other significant event that observers need to react to.
 */
public interface Observer {
    /**
     * Updates the observer with the new state.
     * This method is called when the subject's state changes, providing the observer
     * with the new coordinates to react accordingly.
     *
     * @param coordinates A 2D array of doubles representing the new state to be updated with.
     */
    void update(double[][] coordinates);
}
