package practice.Abstract.WeaponFactory;

public class Phantom implements Weapon{
    @Override
    public void shoot() {
        System.out.println("Weapon Factory: Shooting Phantom");
    }
}
