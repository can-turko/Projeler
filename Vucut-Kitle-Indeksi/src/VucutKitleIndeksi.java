import java.util.Scanner;
public class VucutKitleIndeksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double boy, kilo, kitleindeksi;
        System.out.print("Lütfen boyunuzu giriniz(metre cinsinden):");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz(kilogram cinsinden):");
        kilo = input.nextDouble();
        kitleindeksi = kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz:"+kitleindeksi);

    }
}
