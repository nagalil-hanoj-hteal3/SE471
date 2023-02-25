package src;

/*
 * Character class that includes the
 * height and archetype (type of character)
 */
public interface CharacterIF {
  
    public String getArchetype();
    public int getLevel(); //int to determine levels
    public int levelUp(); //int for level-ups

}
