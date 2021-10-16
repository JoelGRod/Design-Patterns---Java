// Basic
import com.supertypes.Duck;
import com.supertypes.MallarDuck;
import com.supertypes.ModelDuck;
import com.supertypes.behaviors.FlyRocketPow;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        // Basic
        Duck mallarDuck = new MallarDuck();
        mallarDuck.performFly();
        mallarDuck.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior( new FlyRocketPow() );
        modelDuck.performFly();
    }
}
