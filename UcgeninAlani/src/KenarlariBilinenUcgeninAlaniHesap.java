import java.util.Scanner;


public class KenarlariBilinenUcgeninAlaniHesap {
    public static void main(String[] args) {
        double a,b,c,d,e;
        Scanner input = new Scanner(System.in);
        System.out.print("a kenarının ölçüsünü yazıp enter'a basınız:");
        a = input.nextDouble();
        System.out.print("b kenarının ölçüsünü yazıp enter'a basınız:");
        b = input.nextDouble();
        System.out.print("c kenarının ölçüsünü yazıp enter'a basınız:");
        c = input.nextDouble();
        d=(a+b+c)/2;
        e=d*(d-a)*(d-b)*(d-c);
        System.out.println("üçgenin alanı:"+e);


    }
}
