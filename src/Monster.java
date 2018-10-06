import java.util.Arrays;

public class Monster {

    static char[][] battleBoard = new char[10][10];


    public static void buildBattleBoard() {
        for(char[] row : battleBoard) {
            Arrays.fill(row, '*');
        }
    }

    public static void redrawBoard() {
        int k = 1;
        while(k <= 30){
            System.out.print('-');
            k++;
        }
        System.out.println();

        for(int i = 0; i < battleBoard.length; i++) {
            for(int j = 0; j < battleBoard[i].length; j++) {
                System.out.print("|" + battleBoard[i][j] + "|");
            }
            System.out.println();
        }

        int p = 1;
        while(p <= 30){
            System.out.print('-');
            p++;
        }

    }


    public final String TOMBSTONE = "Here Lies a Dead monster";

    private int health = 500;
    private int attack = 20;
    private int movement = 2;
    private boolean alive = true;

    public String name = "Big Monster";
    public char nameChar1 = 'B';
    public int xPos = 0;
    public int yPos = 0;
    public static int numOfMonsters = 0;


    public int getAttack() {
        return attack;
    }

    public int getMovement() {
        return movement;
    }

    public int getHealth() {
        return health;
    }

    public boolean getAlive() {
        return alive;
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

    public Monster(int health, int attack, int movement, String name) {
        this.health = health;
        this.attack = attack;
        this.movement = movement;
        this.name = name;

        int maxXBoardSpace = battleBoard.length - 1;
        int maxYBoardSpace = battleBoard[0].length - 1;

        int randNumX, randNumY;

        do {

            randNumX = (int) (Math.random() * maxXBoardSpace);
            randNumY = (int) (Math.random() * maxYBoardSpace);

        } while(battleBoard[randNumX][randNumY] != '*');

        this.xPos = randNumX;
        this.yPos = randNumY;

        this.nameChar1 = this.name.charAt(0);

        battleBoard[this.yPos][this.xPos] = this.nameChar1;
    }

    // Default Constructor
    public Monster() {
        numOfMonsters++;
    }

}

