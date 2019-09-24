public interface Observer {
    public void update(float temp, float humidity, float pressure);
}

/**
 * 'temp', 'humidity' and 'pressure' are the state values the Observers get
 * from the Subject when a weather measurement changes.
 */
