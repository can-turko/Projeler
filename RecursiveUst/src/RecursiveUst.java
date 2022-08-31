import java.util.Scanner;
public class RecursiveUst {
    static void ust(){
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen üssü alınacak sayıyı giriniz: ");
        int x = input.nextInt();
        System.out.print("Lütfen üssü giriniz: ");
        int y = input.nextInt();
        int sonuc = 1;
        while(y>0){
            sonuc *= x;
            y--;
        }
        System.out.println("Sonuç= "+sonuc);
    }
    public static void main(String[] args){
        ust();

    }
}
