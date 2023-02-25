package src;

public class Advanced_Character implements CharacterIF {
    private String archetype;  //string fo different archetypes
    private int level; //string for levels

    public Advanced_Character(String ch){
        this.archetype = ch;
        this.level = 3; //1,2,3 different levels
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