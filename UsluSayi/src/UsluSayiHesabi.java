import java.util.Scanner;
public class UsluSayiHesabi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c=1;
        System.out.print("üssü alınacak sayı: ");
        a= input.nextInt();
        System.out.print("üs olacak sayı: ");
        b= input.nextInt();
        for(int i = 1;i<=b;i++){
            c*=a;
        }
        System.out.println("Sonuç= "+c);
    }
}
