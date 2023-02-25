package src;

public class Intermediate_Weapon implements WeaponIF{
    //private weaponType weapon;

    //weapon for intermediate level
    String type = "sword";
    int damage;

    public Intermediate_Weapon(int d) {
        damage = d;
    }
    
    public String getType() {
        return type;
    }
    public int getDamage() {
        return damage;
    }
}
