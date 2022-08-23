import java.util.Scanner;
public class BasamakToplami {
    public static void main(String[] args) {
        int a, b=0,c,d,e=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        a = input.nextInt();
        c=a;
        for(a=a;a!=0;a/=10){
            b++;
        }
        for(b=b;b>0;b--){
            d=c%10;
            c/=10;
            e+=d;
        }
        System.out.println("Sayıların basamakları toplamı: "+e);
    }
}
