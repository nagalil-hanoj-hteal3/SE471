package src;

public class AdvancedFactory implements PlayerFactoryIF {
    
    public CharacterIF selectCharacter() {
        return new Advanced_Character("Dal");
    }

    public WeaponIF selectWeapon() {
        return new Advanced_Weapon(1);
    }
    
}
