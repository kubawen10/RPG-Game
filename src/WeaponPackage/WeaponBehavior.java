package WeaponPackage;

import CharacterPackage.Character;

public interface WeaponBehavior {
    void attack(Character defencer);

    void showOff();

    boolean checkIfInRange(int distance);



}
