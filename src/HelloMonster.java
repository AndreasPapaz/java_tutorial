import java.util.Arrays;
//import org.apache.commons.lang3.ArrayUtils;

public class HelloMonster {

    public static void main(String[] args) {
        Monster.buildBattleBoard();

        char[][] tempBattleBoard = new char[10][10];

        //ObjectName[] ArrayName = new ObjectName[4];
        Monster[] Monsters = new Monster[4];
        Monsters[0] = new Monster(1000, 20, 1, "Frank");
        Monsters[1] = new Monster(1000, 20, 1, "Paul");
        Monsters[2] = new Monster(1000, 20, 1, "George");
        Monsters[3] = new Monster(1000, 20, 1, "Darko");

        Monster.redrawBoard();
    }

}
