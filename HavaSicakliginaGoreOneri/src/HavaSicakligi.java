import java.util.Scanner;
public class HavaSicakligi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        System.out.println("lütfen hava sıcaklığını giriniz: ");
        x = input.nextInt();
        if (x>=15 && x<=25) System.out.println("Pikniğe gidebilirsiniz.");
        if (x>=5 && x<=15) System.out.println("Sinamaya gidebilirisiniz.");
        else if (x<5) {
            System.out.println("Kayak yapmaya gidebilirsiniz.");
            
        }
        else System.out.println("Yüzmeye gidebilirsiniz.");
    }
}
