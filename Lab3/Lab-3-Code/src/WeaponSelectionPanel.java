package src;

public class WeaponSelectionPanel {
    public void printWeapon(WeaponIF we) {
        System.out.println("Weapon:\nType: " + we.getType() + ", Damage: " + we.getDamage());
    }
}
