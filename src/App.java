// Strategy
import com.strategy.Duck;
import com.strategy.MallarDuck;
import com.strategy.ModelDuck;
import com.strategy.behaviors.FlyRocketPow;
// Observer
import com.observer.CurrentConditionsDisplay;
import com.observer.ForecastDisplay;
import com.observer.HeatIndexDisplay;
import com.observer.StaticsDisplay;
import com.observer.WeatherData;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        // Strategy
        System.out.println("----------------\nStrategy Pattern\n----------------");
        Duck mallarDuck = new MallarDuck();
        mallarDuck.performFly();
        mallarDuck.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior( new FlyRocketPow() );
        modelDuck.performFly();

        // Observer
        System.out.println("----------------\nObserver Pattern\n----------------");
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay cd = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay fd = new ForecastDisplay(weatherData);
        StaticsDisplay sd = new StaticsDisplay(weatherData);
        HeatIndexDisplay hi = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
