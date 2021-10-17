// Strategy
import com.strategy.Duck;
import com.strategy.MallarDuck;
import com.strategy.ModelDuck;
import com.strategy.behaviors.FlyRocketPow;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        // Strategy
        Duck mallarDuck = new MallarDuck();
        mallarDuck.performFly();
        mallarDuck.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior( new FlyRocketPow() );
        modelDuck.performFly();
    }
}
