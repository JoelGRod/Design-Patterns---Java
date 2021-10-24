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
// Decorator
import com.decorator.Beverage;
import com.decorator.DarkRoast;
import com.decorator.Decaf;
import com.decorator.HouseBlend;
import com.decorator.decorators.Milk;
import com.decorator.decorators.Mocha;
import com.decorator.decorators.Soy;
import com.decorator.decorators.Whip;
// Factory Abstract
import com.factory.factoryabstract.PizzaStore;
import com.factory.factoryabstract.TfPizzaStore;
import com.factory.factoryabstract.GCPizzaStore;

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

        // Decorator
        System.out.println("----------------\nDecorator Pattern\n----------------");
        Beverage beverage = new HouseBlend();
        beverage = new Mocha(beverage);
        beverage = new Soy(beverage);
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        System.out.println("--------");
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
        System.out.println("--------");
        Beverage beverage3 = new Decaf();
        beverage3 = new Milk(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
        System.out.println("--------");
        Beverage beverage4 = new Decaf();
        beverage4 = new Soy(beverage4);
        beverage4 = new Mocha(beverage4);
        beverage4 = new Whip(beverage4);
        beverage4.setSize("large");
        beverage4 = new Whip(beverage4);
        System.out.println(beverage4.getDescription() + 
            " - " + beverage4.getSize().toUpperCase() + 
            " - $" + beverage4.cost());
        System.out.println("--------");

        // Factory Abstract
        PizzaStore tfPizzaStore = new TfPizzaStore();
        tfPizzaStore.orderPizza("clam");

        System.out.println("-------------------------");
        
        PizzaStore gcPizzaStore = new GCPizzaStore();
        gcPizzaStore.orderPizza("clam");

        System.out.println("-------------------------");

        gcPizzaStore.orderPizza("veggie");

        System.out.println("--------");
    }
}
