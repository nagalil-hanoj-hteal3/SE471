package src;

public class CharacterSelectionPanel {
    public void printCharacter(CharacterIF ch) {
        System.out.println("Character:\nArchetype: " + ch.getArchetype() + ", Level: " + ch.getLevel());
    }
}
