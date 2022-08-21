import java.util.Scanner;
public class ArtikYilHesabi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year,kalan;
        System.out.print("Yıl giriniz: ");
        year = input.nextInt();
        if((year%4==0)&&(year%400!=100)&&(year%400!=200)&&(year%400!=300)) System.out.println(year+"bir artık yıldır !");
        else System.out.println(year+"bir atık yıl değildir");
    }
}
