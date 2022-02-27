package Map;

import CharacterPackage.Character;

import java.util.ArrayList;
import java.util.List;

public class Map {
    private final Character[][] characterPlacement;

    public Map() {
        characterPlacement = new Character[10][10];
    }

    public Map(int dimension) {
        characterPlacement = new Character[dimension][dimension];
    }


    public boolean addCharacter(Character character, int x, int y) {
        if (!checkIfInMapBound(x, y) || !placeIsFree(x, y)) {
            System.out.println("Can't choose this place");
            return false;
        }

        characterPlacement[x][y] = character;
        return true;
    }

    public void printMap() {
        //x cord row
        System.out.print("y\\x");
        for (int x = 0; x < characterPlacement.length; x++) {
            System.out.print("\t" + x);
        }
        System.out.println();

        for (int y = 0; y < characterPlacement.length; y++) {
            //y cord column
            System.out.print(y);
            for (int x = 0; x < characterPlacement.length; x++) {
                if (!placeIsFree(x, y)) {
                    System.out.print("\t" + characterPlacement[x][y].getMapDescription());
                } else System.out.print("\t");
            }
            System.out.println();
        }
    }

    public int[] getCharacterXY(Character character) {
        int[] XY = new int[2];
        for (int x = 0; x < characterPlacement.length; x++) {
            for (int y = 0; y < characterPlacement.length; y++) {
                if (characterPlacement[x][y] == character) {
                    XY[0] = x;
                    XY[1] = y;
                    return XY;
                }
            }
        }
        return XY;
    }

    public int getDistance(Character ch1, Character ch2) {
        int[] ch1XY = getCharacterXY(ch1);
        int[] ch2XY = getCharacterXY(ch2);

        double distance = Math.sqrt(Math.pow(ch1XY[0] - ch2XY[0], 2) + Math.pow(ch1XY[1] - ch2XY[1], 2));

        return (int) Math.ceil(distance);
    }

    private boolean checkIfInMapBound(int x, int y) {
        return (x >= 0 && x < characterPlacement.length) && (y >= 0 && y < characterPlacement.length);
    }

    private void moveIfValid(int[] initialXY, int desiredX, int desiredY) {
        int initialX = initialXY[0];
        int initialY = initialXY[1];
        if (checkIfInMapBound(desiredX, desiredY) && placeIsFree(desiredX, desiredY)) {
            characterPlacement[desiredX][desiredY] = characterPlacement[initialX][initialY];
            characterPlacement[initialX][initialY] = null;
        } else {
            System.out.println("Can't move there");
        }
    }

    public void moveCharacter(Character character, int direction) {
        //1-up 2-right 3-down 4-left
        int[] characterXY = getCharacterXY(character);
        int desiredX;
        int desiredY;

        switch (direction) {
            case 1:
                desiredX = characterXY[0];
                desiredY = characterXY[1] - 1;
                break;
            case 2:
                desiredX = characterXY[0] + 1;
                desiredY = characterXY[1];
                break;
            case 3:
                desiredX = characterXY[0];
                desiredY = characterXY[1] + 1;
                break;
            case 4:
                desiredX = characterXY[0] - 1;
                desiredY = characterXY[1];
                break;
            default:
                desiredX = characterXY[0];
                desiredY = characterXY[1];
        }
        moveIfValid(characterXY, desiredX, desiredY);
    }

    public Character[] charactersList() {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < characterPlacement.length; i++) {
            for (int j = 0; j < characterPlacement.length; j++) {
                if (!placeIsFree(i, j)) {
                    list.add(characterPlacement[i][j]);
                }
            }
        }
        return list.toArray(new Character[0]);
    }

    public void deleteCharacter(Character c){
        int [] XY = getCharacterXY(c);
        characterPlacement[XY[0]][XY[1]] = null;
    }

    private boolean placeIsFree(int x, int y) {
        return characterPlacement[x][y] == null;
    }
}
