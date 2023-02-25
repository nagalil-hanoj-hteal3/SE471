package src;

public class Beginner_Weapon implements WeaponIF {
    
    //private weaponType weapon;

    //weapon for beginner level
    String type = "pencil";
    int damage;

    public Beginner_Weapon(int d) {
        damage = d;
    }
    
    public String getType() {
        return type;
    }
    public int getDamage() {
        return damage;
    }
    
}
