package com.company.Abstract.WeaponFactory;

public class Vandal implements Weapon{
    @Override
    public void shoot() {
        System.out.println("Weapon Factory: Shooting Vandal");
    }
}
