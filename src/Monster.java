import java.util.Arrays;

public class Monster {

    static char[][] battleBoard = new char[10][10];


    public static void buildBattleBoard() {
        for(char[] row : battleBoard) {
            Arrays.fill(row, '*');
        }
    }


    public final String TOMBSTONE = "Here Lies a Dead monster";

    private int health = 500;
    private int attack = 20;
    private int movement = 2;
    private int xPos = 0;
    private int yPos = 0;
    private boolean alive = true;

    public String name = "Big Mongster";


    public int getAttack() {
        return attack;
    }

    public int getMovement() {
        return movement;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int decHealth) {
        health -= decHealth;

        if (health < 0) {
            alive = false;
        }
    }

    public void setHealth(double decHealth) {
        int intDecHealth = (int) decHealth;
        health -= intDecHealth;

        if (health < 0) {
            alive = false;
        }
    }

    public Monster(int health, int newAttack, int newMovement) {
        this.health = health;
        attack = newAttack;
        movement = newMovement;

    }

    // Default Constructor
    public Monster() {

    }

}

