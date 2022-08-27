import java.util.Scanner;
public class MaxMinDegerBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int a = input.nextInt();
        while(a<2){
            System.out.print("Lütfen en az 2 sayı giriniz: ");
            a= input.nextInt();
        }
        int v=1,b,c,enk,enb;
        System.out.print(v+". sayıyı giriniz: ");
        b= input.nextInt();
        v++;
        System.out.print(v+". sayıyı giriniz: ");
        c= input.nextInt();
        v++;
        if(b<=c) {
            enk = b;
            enb = c;
        }
        else {
            enk = c;
            enb = b;
        }
        for (a=a-2;a>0;a--){
            System.out.println(v+". sayıyı giriniz: ");
            b= input.nextInt();
            v++;
            if(b<enk)enk=b;
            else if (b>enb) enb=b;
        }
        System.out.println("En büyük sayı: "+enb+"\nEn küçük sayı: "+enk);

    }
}
