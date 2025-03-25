package utils;

/**
 * Interface to implement Observer
 */

public interface Observer {

    /**
     * Function to update message for the observer
     * @param p_s
     */
    void update(String p_s);
    
    /**
     * Clear all logs
     */
    void clearLogs();
}
