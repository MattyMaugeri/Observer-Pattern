/**
 *  - This class implements Observer so it can get changes from the weatherData Object
 *  - this class implements DisplayElements because our API is going to require all the display
 *    elements to implement this interface 
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    /**
     * Constructor is passed a weatherData object (the Subject) and we use it to register
     * this display (CurrentConditionsDisplay) as an Observer
     * @param weatherData
     */
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    //When update is called we save the updated temp and humidity and then display it
    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    // display method will now print out the most recent temp and humidity
    @Override
    public void display() {
        System.out.println("Current Conditions: " + temperature
        + "F degrees and " + humidity + "% humidity");
    }
    
}