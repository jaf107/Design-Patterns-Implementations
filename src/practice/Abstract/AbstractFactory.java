package com.company.Abstract;

import com.company.Abstract.Games.Game;
import com.company.Abstract.WeaponFactory.Weapon;

public abstract class AbstractFactory {
    public abstract Weapon getWeapon(String weapon);
    public abstract Game getGame(String game);
}
