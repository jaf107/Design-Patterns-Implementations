package com.company.Abstract.Games;

import com.company.Abstract.AbstractFactory;
import com.company.Abstract.WeaponFactory.Weapon;

public class GameFactory extends AbstractFactory {


    @Override
    public Weapon getWeapon(String weapon) {
        return null;
    }

    @Override
    public Game getGame(String game) {
        if(game == null)
            return null;

        if(game.equalsIgnoreCase("Fortnite")){
            return new Fortnite();
        }else if(game.equalsIgnoreCase("Valorant")){
            return new Valorant();
        }

        return null;
    }
}
