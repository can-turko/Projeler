import java.util.Scanner;
public class DaireDilimiAlani {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r,a;
        double pi = 3.14, alan;
        System.out.print("dairenin yarıçapını giriniz(cm):");
        r = input.nextInt();
        System.out.print("merkez açısının ölçüsünü giriniz:");
        a = input.nextInt();
        alan = (pi*(r*r)*a)/360;
        System.out.println("Daire Diliminin Alanı:"+alan+"cm2");

    }
}
