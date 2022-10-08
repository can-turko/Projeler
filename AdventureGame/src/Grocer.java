import java.util.Scanner;

public class Grocer extends Locations {
    Inventory inventory;
    static Scanner input = new Scanner(System.in);

    public static void enterGrocer(Character character) {
        String x = "y";
        while (x.charAt(0) == 'y') {
            System.out.println("""
                    1.Weapons
                    2.Armors
                    3.Exit
                    """);
            int a = input.nextInt();
            switch (a) {
                case 1:
                    Inventory.printInfoWeapon();
                    int b = input.nextInt();
                    switch (b) {
                        case 1:
                            if (character.getMoney() >= 25) character.inventory.setDamage(2);
                            else System.out.println("Insufficient balance");
                            break;
                        case 2:
                            if (character.getMoney() >= 35) character.inventory.setDamage(3);
                            else System.out.println("Insufficient balance");
                            break;
                        case 3:
                            if (character.getMoney() >= 45) character.inventory.setDamage(7);
                            else System.out.println("Insufficient balance");
                            break;
                        default:
                            System.out.println("Entered wrong!");
                            Inventory.printInfoWeapon();
                            break;
                    }
                    break;
                case 2:
                    Inventory.printInfoArmor();
                    int c = input.nextInt();
                    switch (c) {
                        case 1:
                            if (character.getMoney() >= 15) {
                                character.inventory.setArmor(1);
                                character.inventory.setArmorName("Light");
                                System.out.println("Light Armor is purchased");
                            } else System.out.println("Insufficient balance");
                            break;
                        case 2:
                            if (character.getMoney() >= 25) {
                                character.inventory.setArmor(3);
                                character.inventory.setArmorName("Mid");
                                System.out.println("Mid Armor is purchased");
                            } else System.out.println("Insufficient balance");
                            break;
                        case 3:
                            if (character.getMoney() >= 40) {
                                character.inventory.setDamage(5);
                                character.inventory.setArmorName("Heavy");
                                System.out.println("Heavy Armor is purchased");
                            } else System.out.println("Insufficient balance");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Left the grocer");
                    break;
                default:
                    System.out.println("""
                            Entered wrong!
                                                                
                            """);
                    break;


            }
            if (a == 3) break;
            System.out.println("Do you want to stay at grocer?\nEnter (y) for yes\nEnter (n) for no");
            x = input.next();
            while (x.charAt(0) != 'y' && x.charAt(0) != 'n' || x.length() != 1) {
                System.out.println("Wrong key\nEnter (y) for yes\nEnter (n) for no");
                x = input.next();
            }
        }
    }
}
