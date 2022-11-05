import java.util.*;

public class Fikstur {
    Scanner input = new Scanner(System.in);
    private String name;
    private int totalPoint;
    private String[] teamList;
    private boolean doubleNumber;
    private int countTeam;
    private ArrayList<LinkedHashMap<String, String>> line = new ArrayList<>();
    private String[] evSahibi;
    private String[] deplasman;

    public void teamMaker() {
        System.out.print("Lütfen yapmak istediğiniz takım sayısını giriniz: ");
        this.countTeam = input.nextInt();
        if (countTeam % 2 == 1) {
            teamList = new String[countTeam + 1];
        } else teamList = new String[countTeam];
        int b = 1;
        this.doubleNumber = countTeam % 2 == 0;
        for (int i = 0; i < countTeam; i++) {
            System.out.println(b++ + ". Takımı giriniz: ");
            String str = input.next();
            this.teamList[i] = str;
        }
        if (!doubleNumber) {
            this.teamList[countTeam] = "Bay";
            this.countTeam++;
        }
        this.evSahibi = new String[countTeam];
        this.deplasman = new String[countTeam];
    }

    public void putter() {
        for (int i = 0; i < teamList.length ; i++) {
            for (int j = 0; j < teamList.length; j++) {
                LinkedHashMap<String,String> a = new LinkedHashMap<>();
                if(j == i) continue;
                a.put(teamList[j],teamList[i]);
                line.add(a);
            }
        }
    }
    void print(){
        for(int i = 0 ; i < line.size();i++){
            System.out.println("----------------");
            System.out.println(line.get(i));
        }
    }

    /*public void matchMaker() {
        int raund = 0;
        while (raund < (countTeam - 1) * 2) {
            System.out.println("Round: " + (raund + 1));
            for (int i = 0; i < countTeam / 2; i++) {
                LinkedHashMap<>
            }
            raund++;
        }
    }

     */

    public void run(){
        teamMaker();
        putter();
        print();
    }
}
