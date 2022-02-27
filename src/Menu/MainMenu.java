package Menu;

import ArmorPackage.*;
import CharacterPackage.*;
import CharacterPackage.Character;
import Map.Map;
import WeaponPackage.*;

import java.util.ArrayList;

public class MainMenu {
    Map map;
    MyScanner scanner;

    public MainMenu() {
        map = new Map();
        scanner = new MyScanner();
    }

    public void run() {
        boolean run = true;
        int choice;
        while (run) {
            MessageStore.mainMessage();
            choice = scanner.intChoice();

            System.out.println();

            switch (choice) {
                case 1:
                    addCharacterMenu();
                    break;
                case 2:
                    printCharacterList(map.charactersList(), true);
                    break;
                case 3:
                    printMap();
                    break;
                case 4:
                    chooseCharacterMenu();
                    break;

                case 0:
                    run = false;
                    break;
                default:
                    MessageStore.wrongNumberMessage();
            }
            clear();
        }
    }

    private void chooseCharacterMenu() {
        Character c = chooseCharacter(AllCharacters(true));
        System.out.println();
        System.out.println();

        if (c != null) chosenCharacterMenu(c);
    }

    private Character chooseCharacter(Character[] characters) {
        if (characters.length == 0) {
            System.out.println("No characters to choose from");
            return null;
        }

        int choice;

        choice = scanner.intChoice();

        if (choice <= 0 || choice > characters.length) {
            System.out.println("Wrong number");
            return null;
        }

        return characters[choice - 1];
    }

    private void chosenCharacterMenu(Character c) {
        System.out.println(c);
        System.out.println("What would you like to do with chosen character?");
        MessageStore.characterMenuMessage();
        int choice = scanner.intChoice();

        switch (choice) {
            case 1:
                System.out.println("Which character would you like to attack?");
                Character other = chooseCharacter(CharactersWithoutChosen(c, true));
                if (other != null) {
                    c.performAttack(other, map.getDistance(c, other));

                    //delete if other is dead
                    if (other.getHealth() <= 0) {
                        map.deleteCharacter(other);
                    }
                }
                break;

            case 2:
                c.performShowOff();
                break;

            case 3:
                MessageStore.chooseWeaponMessage();
                choice = scanner.intChoice();
                switch (choice) {
                    case 1:
                        c.setWeaponBehavior(new BowWeapon());
                        break;
                    case 2:
                        c.setWeaponBehavior(new FlameWeapon());
                        break;
                    case 3:
                        c.setWeaponBehavior(new ForkWeapon());
                        break;
                    case 4:
                        c.setWeaponBehavior(new RifleWeapon());
                        break;
                    case 5:
                        c.setWeaponBehavior(new RollingPinWeapon());
                        break;
                    case 6:
                        c.setWeaponBehavior(new SwordWeapon());
                        break;
                    default:
                        MessageStore.wrongNumberMessage();
                }
                break;

            case 4:
                MessageStore.chooseArmorMessage();
                choice = scanner.intChoice();
                switch (choice) {
                    case 1:
                        c.setArmorBehavior(new DirtyClothesArmor());
                        break;
                    case 2:
                        c.setArmorBehavior(new DragonSkinArmor());
                        break;
                    case 3:
                        c.setArmorBehavior(new DressArmor());
                        break;
                    case 4:
                        c.setArmorBehavior(new HeavyArmor());
                        break;
                    case 5:
                        c.setArmorBehavior(new KingsRobeArmor());
                        break;
                    case 6:
                        c.setArmorBehavior(new LightArmor());
                        break;
                    case 7:
                        c.setArmorBehavior(new ModernArmor());
                    default:
                        MessageStore.wrongNumberMessage();
                }
                break;

            case 5:
                MessageStore.moveCharacterMessage();
                choice = scanner.intChoice();
                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    c.move(map, choice);
                } else {
                    MessageStore.wrongNumberMessage();
                }
                break;

            default:
                MessageStore.wrongNumberMessage();
        }
    }

    private void printMap() {
        map.printMap();
    }

    private void printCharacterList(Character[] characters, boolean printXY) {
        for (int i = 0; i < characters.length; i++) {
            System.out.print((i + 1) + " " + characters[i]);
            if (printXY) {
                int[] XY = map.getCharacterXY(characters[i]);
                System.out.print(" x: " + XY[0] + " y: " + XY[1]);
            }
            System.out.println();
        }
    }

    private Character[] CharactersWithoutChosen(Character c, boolean printXY) {
        Character[] characters = map.charactersList();
        ArrayList<Character> characterArrayList = new ArrayList<>();

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != c) {
                characterArrayList.add(characters[i]);
            }
        }

        Character[] without = characterArrayList.toArray(new Character[0]);
        printCharacterList(without, printXY);

        return without;
    }

    private Character[] AllCharacters(boolean printXY) {
        Character[] characters = map.charactersList();

        printCharacterList(characters, printXY);
        return characters;
    }

    private void addCharacterMenu() {
        MessageStore.chooseCharacterMessage();

        int choice = scanner.intChoice();

        System.out.print("Name your character: ");
        String characterName = scanner.stringChoice();

        Character c;
        switch (choice) {
            case 1:
                c = new Countryman(characterName);
                break;
            case 2:
                c = new Countrywoman(characterName);
                break;
            case 3:
                c = new Dragon(characterName);
                break;
            case 4:
                c = new Elf(characterName);
                break;
            case 5:
                c = new King(characterName);
                break;
            case 6:
                c = new Knight(characterName);
                break;
            case 7:
                c = new Marine(characterName);
                break;
            default:
                MessageStore.wrongNumberMessage();
                return;
        }

        int x;
        int y;

        System.out.println("Choose x coordinate for your character: ");
        x = scanner.intChoice();
        System.out.println("Choose y coordinate for your character: ");
        y = scanner.intChoice();

        if (map.addCharacter(c, x, y)) {
            System.out.println("Succesfuly added your character: " + c);
        }
    }

    private void clear() {
        scanner.waitForEnter();
        for (int i = 0; i < 15; i++) {
            System.out.println();
        }
    }
}
