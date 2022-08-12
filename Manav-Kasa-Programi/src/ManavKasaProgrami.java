import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,palican=5.00,toplamTutar,a1,a2,a3,a4,a5;
        int a,b,c,d,e;
        System.out.print("Armut Kaç Kilo ? :");
        a = input.nextInt();
         System.out.print("Elma Kaç Kilo ? :");
        b = input.nextInt();
         System.out.print("Domates Kaç Kilo ? :");
        c = input.nextInt();
         System.out.print("Muz Kaç Kilo ? :");
        d = input.nextInt();
         System.out.print("Patlıcan Kaç Kilo ? :");
        e = input.nextInt();
        a1=a*armut;
        a2=b*elma;
        a3=c*domates;
        a4=d*muz;
        a5=e*palican;
        toplamTutar = a1+a2+a3+a4+a5;
        System.out.println("Toplam Tutar: "+toplamTutar+" TL");


    }
}
