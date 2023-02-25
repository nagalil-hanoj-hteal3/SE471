package src;

public class IntermediateFactory implements PlayerFactoryIF {
    
    public CharacterIF selectCharacter() {
        return new Intermediate_Character("EJ");
    }

    public WeaponIF selectWeapon() {
        return new Intermediate_Weapon(5);
    }
    
}
