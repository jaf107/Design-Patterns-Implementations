package practice;

import practice.Abstract.AbstractFactory;
import practice.Abstract.FactoryProducer;
import practice.singleton.Singleton;
import practice.strategy.Jump;
import practice.strategy.Run;

public class Main {

    public static void main(String[] args) {
	// write your code here

        AbstractFactory gameFactory = FactoryProducer.getFactory("Game");

        gameFactory.getGame("Valorant").play();
        gameFactory.getGame("Fortnite").play();

        AbstractFactory weaponFactory = FactoryProducer.getFactory("Weapon");

        weaponFactory.getWeapon("Vandal").shoot();
        weaponFactory.getWeapon("Phantom").shoot();

        new Jump().execute();
        new Run().execute();

        Singleton s = Singleton.getInstance();
        s.show();


    }
}
