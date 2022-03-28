package practice.Abstract;

import com.company.Abstract.Games.GameFactory;
import com.company.Abstract.WeaponFactory.WeaponFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String factory){
        if(factory == null)
            return null;

        if(factory.equalsIgnoreCase("Weapon")){
            return new WeaponFactory();
        }else if(factory.equalsIgnoreCase("Game")){
            return new GameFactory();
        }

        return null;
    }
}
