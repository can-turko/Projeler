import java.util.Scanner;
public class HarmonikSayi {
    public static void main(String[] args) {
        int a,b;
        double c=0.0;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        a= input.nextInt();
        for(b=1;b<=a;b++){
            c+=(1.0/b);
        }
        System.out.println("Harmonik seri sayısı= "+c);
    }
}
