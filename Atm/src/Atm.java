import java.util.Scanner;
public class Atm {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3, a, b, c;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("lütfen yapmak istediğiniz işlemi seçiniz");
                    System.out.println("1-Para yatırma\n2-Para Çekme\n3-Bakiye Sorgula\n4-Çıkış Yap");
                    a = input.nextInt();
                    switch (a) {
                        case 1:
                            System.out.print("Yatıracağınız para miktarı: ");
                            b = input.nextInt();
                            balance += b;
                            break;
                        case 2:
                            System.out.print("Çekeceğiniz para miktarı: ");
                            c = input.nextInt();
                            balance -= c;
                            break;
                        case 3:
                            System.out.println("Bakiye: " + balance);
                            break;
                        default:
                            break;
                    }
                } while (a != 4); break;

            }else {
                System.out.println("Hatalı giriş denemesi yaptınız!");
                right--;
                System.out.println("Kalan deneme sayısı: "+right);
            }


        }
    }
}
