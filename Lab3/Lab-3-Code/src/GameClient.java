package src;

import java.util.Scanner;

public class GameClient {
    static CharacterSelectionPanel charpanel = new CharacterSelectionPanel();
    static WeaponSelectionPanel weappanel = new WeaponSelectionPanel();
    static GameUtility utility = new GameUtility();
    static PlayerFactoryIF factory;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose difficulty\n1 = Beginner\n2 = Intermediate\n3 = Advanced\nSelect: ");
        int input = scanner.nextInt();

        //while loop for false inputs
        while(input > 3 || input < 1) {
            System.out.print("Eres estupido, input again: ");
            input = scanner.nextInt();
        }

        factory = utility.createFactory(input);
        charpanel.printCharacter(factory.selectCharacter());
        weappanel.printWeapon(factory.selectWeapon());
        scanner.close();
    }
}