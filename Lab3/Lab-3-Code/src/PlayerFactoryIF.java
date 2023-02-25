package src;

/*
 * Interface for the player class
 */
public interface PlayerFactoryIF {
    public abstract CharacterIF selectCharacter();
    public abstract WeaponIF selectWeapon();
}