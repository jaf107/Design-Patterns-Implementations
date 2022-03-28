package com.company;

import com.company.Abstract.AbstractFactory;
import com.company.Abstract.FactoryProducer;
import com.company.singleton.Singleton;
import com.company.strategy.Jump;
import com.company.strategy.Run;

public class Main {

    public static void main(String[] args) {
	// write your code here

    /*
        AbstractFactory gameFactory = FactoryProducer.getFactory("Game");

        gameFactory.getGame("Valorant").play();
        gameFactory.getGame("Fortnite").play();

        AbstractFactory weaponFactory = FactoryProducer.getFactory("Weapon");

        weaponFactory.getWeapon("Vandal").shoot();
        weaponFactory.getWeapon("Phantom").shoot();
*/
//        new Jump().execute();
//        new Run().execute();

        Singleton s = Singleton.getInstance();
        s.show();


    }
}
