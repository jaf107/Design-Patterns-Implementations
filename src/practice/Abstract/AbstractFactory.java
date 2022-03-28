package practice.Abstract;

import practice.Abstract.Games.Game;
import practice.Abstract.WeaponFactory.Weapon;

public abstract class AbstractFactory {
    public abstract Weapon getWeapon(String weapon);
    public abstract Game getGame(String game);
}
