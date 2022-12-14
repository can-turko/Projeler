import java.util.Scanner;

public class Actions {
    static Scanner input = new Scanner(System.in);

    public static void run() {
        Character player = new Character();
        int y = 1;
        while (player.isCharStatus() && !player.isWinGame()) {
            System.out.println("""
                    Please enter a number which next to location you want to go
                    1.Safe Home
                    2.Grocer
                    3.Cave
                    4.Forest
                    5.River
                    6.Show Character Info
                    7.Show Inventory Info""");
            int a = input.nextInt();
            switch (a) {
                case 1:
                    SafeHome.enterHome(player);
                    if (player.inventory.getFireWood() & player.inventory.getFood() & player.inventory.getWater()) {
                        System.out.println("Congratulations you have all item (Food, Firewood, Water) to end the game!!");
                        System.out.println("Do you want to play again? yes for enter (y) and no for enter (n)");
                        char n = input.next().charAt(0);
                        if (n == 'y') {
                            player = new Character();
                        } else if (n == 'n') {
                            player.setWinGame(true);
                        }
                    }
                    break;
                case 2:
                    Grocer.enterGrocer(player);
                    break;
                case 3:
                    if(!player.inventory.getFood()) {
                        BattlePlaces cave = new BattlePlaces();
                        player.inventory.setControl(false);
                        cave.places(player, "Zombie", 3, 10, 4, "Food");
                        if (player.inventory.isControl()) player.inventory.setFood(true);
                    }
                    else System.out.println("This place already cleared");
                    break;
                case 4:
                    if(!player.inventory.getFireWood()) {
                        BattlePlaces forest = new BattlePlaces();
                        player.inventory.setControl(false);
                        forest.places(player, "Vampire", 4, 14, 7, "Firewood");
                        if (player.inventory.isControl()) player.inventory.setFireWood(true);
                    }
                    else System.out.println("This place already cleared");
                    break;
                case 5:
                    if(!player.inventory.getWater()) {
                        BattlePlaces river = new BattlePlaces();
                        player.inventory.setControl(false);
                        river.places(player, "Bear", 7, 20, 12, "Water");
                        if (player.inventory.isControl()) player.inventory.setWater(true);
                    }
                    else System.out.println("This place already cleared");
                    break;
                case 6:
                    player.allInfo();
                    break;
                case 7:
                    player.inventory.showInventory();
            }
            if (!player.isCharStatus()) {
                System.out.println("Do you want to play again? yes for enter (y) and no for enter (n)");
                char n = input.next().charAt(0);
                if (n == 'y') {
                    player = new Character();
                }
            }
        }
    }
}
