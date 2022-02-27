package Menu;

public class MessageStore {
    public static void chooseCharacterMessage(){
        System.out.println("Choose a character you want to create: ");
        System.out.println("1. Countryman");
        System.out.println("2. Countrywoman");
        System.out.println("3. Dragon");
        System.out.println("4. Elf");
        System.out.println("5. King");
        System.out.println("6. Knight");
        System.out.println("7. Marine");
    }

    public static void chooseWeaponMessage(){
        System.out.println("Choose weapon: ");
        System.out.println("1. Bow");
        System.out.println("2. Flame");
        System.out.println("3. Fork");
        System.out.println("4. Rifle");
        System.out.println("5. Rolling pin");
        System.out.println("6. Sword");
    }

    public static void chooseArmorMessage(){
        System.out.println("Choose armor: ");
        System.out.println("1. Dirty clothes");
        System.out.println("2. Dragon skin");
        System.out.println("3. Dress");
        System.out.println("4. Heavy armor");
        System.out.println("5. King's robe");
        System.out.println("6. Light armor");
        System.out.println("7. Modern armor");
    }

    public static void mainMessage(){
        System.out.println("1. Add character");
        System.out.println("2. Print all characters");
        System.out.println("3. Print map");
        System.out.println("4. Choose character");
        System.out.println("0. Quit");
    }

    public static void wrongNumberMessage(){
        System.out.println("Wrong number!");
    }

    public static void characterMenuMessage(){
        System.out.println("1. Attack another character");
        System.out.println("2. Show off");
        System.out.println("3. Change weapon");
        System.out.println("4. Change armor");
        System.out.println("5. Move");
    }

    public static void moveCharacterMessage(){
        System.out.println();
        System.out.println("1. move up");
        System.out.println("2. move right");
        System.out.println("3. move down");
        System.out.println("4. move left");
    }
}
