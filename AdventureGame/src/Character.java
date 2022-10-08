import java.util.Scanner;

public class Character {
    private String name;
    private int maxHealth;
    private int currentHealth;
    private int id;
    private int money;
    private int damage;
    private boolean charStatus = true;
    Inventory inventory = new Inventory();
    Scanner input = new Scanner(System.in);

    public Character() {
        System.out.println("""
                Wellcome to Adventure Game
                You need 3 items to finish game.(Water,Food,Firewood)
                Enjoy the game.
                                
                Please select a character by id number
                """);
        int a = 0;
        do {
            charInfo();
            a = input.nextInt();
            chooseCharacter(a);
        } while (a > 3 || a < 1);
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void chooseCharacter(int a) {
        switch (a) {
            case 1:
                setId(1);
                setCurrentHealth(21);
                setName("Samurai");
                setMaxHealth(21);
                setMoney(15);
                setDamage(5);
                break;
            case 2:
                setId(2);
                setCurrentHealth(18);
                setName("Archer");
                setMaxHealth(18);
                setMoney(20);
                setDamage(7);
                break;
            case 3:
                setId(3);
                setCurrentHealth(24);
                setName("Saber  ");
                setMaxHealth(24);
                setMoney(5);
                setDamage(8);
                break;
            default:
                System.out.println("Please select By ID number");

        }
    }

    public void charInfo() {
        for(int i = 1 ; i <=3 ; i++) {
            chooseCharacter(i);
            System.out.println("ID: " + getId() + "\tName: " + getName() + "\tDamage: " + getDamage() + "\tHealth: " + getCurrentHealth() + "\tMoney: " + getMoney());
        }
    }

    public void allInfo() {
        System.out.println("Name: " + getName() +
                "\n" + "Health Point: " + currentHealth +
                "\n" + "Money: " + money + "g" +
                "\n" + "Damage: " + (damage + inventory.getDamage()) +
                "\n" + "Armor: " + inventory.getArmor());
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isCharStatus() {
        return charStatus;
    }

    public void setCharStatus(boolean charStatus) {
        this.charStatus = charStatus;
    }
}
