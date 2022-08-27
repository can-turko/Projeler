import java.util.Scanner;

public class MukSayiBul {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = input.nextInt(),b=0;
        for(int i = n-1;i>0;i--){
            if(n%i==0)b+=i;
        }
        String sonuc = (b==n) ? " Mükemmel sayıdır.":" Mükemmel sayı değildir.";
        System.out.println(n+sonuc);
    }
}
