public class Inventory {
    private int damage = 0;
    private String weaponName;
    private int armor = 0;
    private String armorName;
    private int id = 0;

    private boolean water = false;
    private boolean food = false;
    private boolean fireWood = false;
    private boolean control = false;

    public void showInventory() {
        if (weaponName == null && armorName == null && !getWater() && !getFood() && !getFireWood())
            System.out.println("Inventory is empty!!");
        else {
            if (weaponName != null) System.out.println("Weapon name: " + getWeaponName() + " Damage: " + getDamage());
            if (armorName != null) System.out.println("Armor name: " + getArmorName() + " Armor: " + getArmor()+" Defence");
            if (getWater()) System.out.println("Water");
            if (getFood()) System.out.println("Food");
            if (getFireWood()) System.out.println("FireWood");
        }
    }

    public static void printInfoWeapon() {
        System.out.println("ID: 1\t\tName: Gun\tDamage: 2\tCost: 25g");
        System.out.println("ID: 2\t\tName: Blade\tDamage: 3\tCost: 35g");
        System.out.println("ID: 3\t\tName: Rifle\tDamage: 7\tCost: 45g");
    }

    public static void printInfoArmor() {
        System.out.println("""
                ID: 1 \tName: Light Armor \t\tBlock: 1 \t\tCost: 15g
                ID: 2 \tName: Mid Armor\t \t\tBlock: 3 \t\tCost: 25g
                ID: 3 \tName: Heavy Armor \t\tBlock: 5 \t\tCost: 40g""");
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public String getArmorName() {
        return armorName;
    }

    public void setControl(boolean control) {
        this.control = control;
    }

    public void setArmorName(String armorName) {
        this.armorName = armorName;
    }

    public int getDamage() {
        return damage;
    }

    public boolean isControl() {
        return control;
    }


    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public boolean getWater() {
        return this.water;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public boolean getFood() {
        return this.food;
    }

    public void setFireWood(boolean fireWood) {
        this.fireWood = fireWood;
    }

    public boolean getFireWood() {
        return this.fireWood;
    }

}
