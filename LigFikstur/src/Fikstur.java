import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Fikstur {
    static Scanner input = new Scanner(System.in);
    static LinkedList<String> teams = new LinkedList<>();
    static LinkedList<LinkedHashMap<String, String>> allRound = new LinkedList<>();


    static void teamMakers() {
        System.out.print("Please enter team quantity: ");
        int q = input.nextInt();
        boolean odd = q % 2 == 1;
        for (int i = 0; i < q; i++) {
            System.out.print("Please enter " + (i + 1) + ". team name: ");
            String a = input.next();
            teams.add(a);
        }
        if (odd) {
            teams.add("Bay");
        }
        int b = teams.size();
        LinkedList<String> mixer = new LinkedList<>();
        for (int j = 0; j < b; j++) {
            int a = (int) ((Math.random()) * teams.size());
            mixer.add(teams.get(a));
            teams.remove(a);
        }
        teams = mixer;
    }

    static void roundMaker() {
        int roundSize = teams.size() - 1;
        int roundMatch = teams.size() / 2;
        for (int i = 0; i < roundSize; i++) {
            LinkedHashMap<String,String> mada = new LinkedHashMap<>();
            for (int j = 0; j < roundMatch; j++) {
                mada.put(teams.get(j),teams.get(teams.size()-(j+1)));
            }
            allRound.add(mada);
            LinkedList<String> mixer = new LinkedList<>();
            mixer.add(teams.get(0));
            mixer.add(teams.get(teams.size()-1));
            int a = teams.size();
            teams.remove(0);
            teams.remove(teams.size()-1);
            for(int k = 0 ; k < (a-2);k++){
                mixer.add(teams.get(0));
                teams.remove(0);
            }
            System.out.println(mixer);
            teams = mixer;
        }
    }
    static void print(){
        int a = 1;
        for(int i = 0 ; i < teams.size()-1;i++){
            Iterator itr = allRound.get(i).keySet().iterator();
            Iterator itr2 = allRound.get(i).values().iterator();
            System.out.println("Round "+a++);
            for(int j = 0 ; j < allRound.get(i).size();j++){
                System.out.println(itr2.next()+"------------"+itr.next());
            }
        }
        for(int i = 0 ; i < teams.size()-1;i++){
            Iterator itr = allRound.get(i).keySet().iterator();
            Iterator itr2 = allRound.get(i).values().iterator();
            System.out.println("Round "+a++);
            for(int j = 0 ; j < allRound.get(i).size();j++){
                System.out.println(itr.next()+"------------"+itr2.next());
            }
        }
    }
    static void run(){
        teamMakers();
        roundMaker();
        print();
    }

}
