package src;

public class Intermediate_Character implements CharacterIF {
    private String archetype;
    private int level;

    public Intermediate_Character(String ch){
        this.archetype = ch;
        this.level = 2;
    }

    public String getArchetype() {
        return archetype;
        
    }
    
    public int getLevel() {
        return level;
    }

    public int levelUp(){
        return level++;
    }
}