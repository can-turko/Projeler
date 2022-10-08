public class SafeHome extends Locations {
    public static void enterHome(Character character){
        character.setCurrentHealth(character.getMaxHealth());
        System.out.println("Your health recovered!!");
    }
}
