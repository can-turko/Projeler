import java.util.ArrayList;
import java.util.Scanner;

public class BattlePlaces extends Locations {
    ArrayList<Monsters> enemy;
    static Scanner input = new Scanner(System.in);
    int randomNumber;
    Character character;

    public void places(Character character, String name, int damage, int health, int coin, String itemName) {
        this.character = character;
        makeEnemy(name, damage, health, coin);
        int u = 0;
        while (u != 1 && u != 2) {
            u = input.nextInt();
            if (u == 1) {
                while (u == 1) {
                    System.out.println("Enter number which enemy you want to hit");
                    showEnemy();
                    if (enemy.size() > 1) {
                        int k = input.nextInt();
                        k -= 1;
                        if (k >= enemy.size() || k < 0) {
                            while (k >= enemy.size() || k < 0) {
                                System.out.println("Please select by number besides enemy name");
                                System.out.println("");
                                k = input.nextInt();
                                k -= 1;
                                hitByPlayer(k);
                            }
                        } else hitByPlayer(k);
                    } else hitByPlayer(0);
                    hitByMonsters();
                    if (this.character.getCurrentHealth() == 0) {
                        this.character.setCharStatus(false);
                        break;
                    }
                    if (enemy.size() < 1) {
                        this.character.setMoney(this.character.getMoney() + coin);
                        this.character.inventory.setControl(true);
                        System.out.println("You got " + coin + " coin" + " and " + itemName);
                        System.out.println("");
                        break;
                    }
                    System.out.println("enter 1 to continue to fight\nenter 2 for escape");
                    u = input.nextInt();
                }
            }
        }

    }

    public void makeEnemy(String name, int damage, int health, int coin) {
        int randomNumber = (int) (Math.random() * 3) + 1;
        this.randomNumber = randomNumber;
        char y = 65;
        Monsters[] array = new Monsters[randomNumber];
        ArrayList<Monsters> enemy = new ArrayList<Monsters>();
        for (int i = 0; i < randomNumber; i++) {

            array[i] = new Monsters(name + " " + y, damage, health, coin);
            enemy.add(array[i]);
            y++;
        }
        System.out.println("There are " + randomNumber + " " + name + "\n1 Fight\n2 Run");
        this.enemy = enemy;
    }

    public void hitByPlayer(int choose) {
        this.enemy.get(choose).setHealth(this.enemy.get(choose).getHealth() - (this.character.getDamage()+this.character.inventory.getDamage()));
        if (this.enemy.get(choose).getHealth() < 0) this.enemy.get(choose).setHealth(0);
        System.out.println(this.enemy.get(choose).getName() + " get " + (this.character.getDamage()+this.character.inventory.getDamage()) + " damage" + "\nCurrent health =" + this.enemy.get(choose).getHealth());
        System.out.println("");
    }

    public void hitByMonsters() {
        for (int i = 0; i < enemy.size(); i++) {
            if (this.enemy.get(i).getHealth() == 0) {
                enemy.remove(i);
                i--;
                continue;
            }
            int finalDamage = this.enemy.get(i).getDamage() - this.character.inventory.getArmor();
            if (finalDamage < 0) finalDamage = 0;
            this.character.setCurrentHealth(this.character.getCurrentHealth() - finalDamage);
            if (character.getCurrentHealth() < 0) character.setCurrentHealth(0);
            System.out.println(this.character.getName() + " get " + finalDamage + " damage" + " by" + this.enemy.get(i).getName() + "\n" + this.character.getName() + " Current health =" + this.character.getCurrentHealth());
            System.out.println("");
            if (character.getCurrentHealth() == 0) {
                System.out.println("Player dead :/");
                break;
            }
        }
    }

    public void showEnemy() {
        int a = 1;
        for (int i = 0; i < enemy.size(); i++) {
            System.out.println(a + " " + this.enemy.get(i).getName());
            a++;
        }
    }

}
