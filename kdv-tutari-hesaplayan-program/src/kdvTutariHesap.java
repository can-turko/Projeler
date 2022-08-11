import java.util.Scanner;


public class kdvTutariHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double para,kdv,kdvlitutar18,kdvlitutar8,tutar,str;
        String kdvtutari18 = "%18", kdvtutari8= "%8",str1;
        System.out.print("Miktarı giriniz;");
        para = input.nextInt();
        boolean kdvdusuk = para < 1000;
        kdvlitutar18 = (0.18*para)+para;
        kdvlitutar8 = (0.8*para)+para;
        str = kdvdusuk ? (kdvlitutar18) : (kdvlitutar8);
        str1 = kdvdusuk ? kdvtutari18 : kdvtutari8;
        System.out.println("kdvli tutar:"+str);
        System.out.println("kdv oranı:"+str1);




    }


}
