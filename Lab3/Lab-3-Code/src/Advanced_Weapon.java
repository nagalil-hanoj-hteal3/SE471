package src;

public class Advanced_Weapon implements WeaponIF {
    //private weaponType weapon;

    //weapon for advanced level
    String type = "Assault Rifle";
    int damage;

    public Advanced_Weapon(int d) {
        damage = d;
    }
    
    public String getType() {
        return type;
    }
    public int getDamage() {
        return damage;
    }
}
