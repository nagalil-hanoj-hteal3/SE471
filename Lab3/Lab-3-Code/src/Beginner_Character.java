package src;

public class Beginner_Character implements CharacterIF {
    private String archetype;
    private int level;

    public Beginner_Character(String arch){
        this.archetype = arch;
        this.level = 1;
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
