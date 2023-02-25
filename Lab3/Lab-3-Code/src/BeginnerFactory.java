package src;

public class BeginnerFactory implements PlayerFactoryIF {


    public CharacterIF selectCharacter(){
        return new Beginner_Character("Neo");
    }
    public WeaponIF selectWeapon(){
        return new Beginner_Weapon(200);
    }
}
