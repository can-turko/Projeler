import java.util.Arrays;
import java.util.Scanner;

public class MineSweeper {
    int rowNumber;
    int colNumber;
    int[][] field;
    String[][] str;
    String[][] map;
    Scanner input = new Scanner(System.in);


    MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        int[][] cField = new int[this.rowNumber][this.colNumber];
        String[][] str = new String[this.rowNumber][this.colNumber];
        String[][] map = new String[this.rowNumber][this.colNumber];
        for (int i = 0; i < str.length; i++) {
            for (int k = 0; k < str[i].length; k++) {
                str[i][k] = "-";
            }
        }
        this.str = str;
        for (int i = 0; i < str.length; i++) {
            for (int k = 0; k < map[i].length; k++) {
                map[i][k] = "-";
            }
        }
        this.map=map;
        this.field = cField;
    }

    public void fillField() {
        for (int i = ((rowNumber) * (colNumber) - 2) / 4; i >= 0; i--) {
            int randomNumber1 = (int) (Math.random() * (rowNumber));
            int randomNumber2 = (int) (Math.random() * (colNumber));
            if (field[randomNumber1][randomNumber2] == -1) {
                i++;
                continue;
            }
            this.field[randomNumber1][randomNumber2] = -1;
            this.map[randomNumber1][randomNumber2] = "*";
            if (randomNumber1 > 0) {
                if (field[randomNumber1 - 1][randomNumber2] != -1)
                    field[randomNumber1 - 1][randomNumber2] += 1;
                if (randomNumber2 > 0 && field[randomNumber1 - 1][randomNumber2 - 1] != -1)
                    field[randomNumber1 - 1][randomNumber2 - 1] += 1;
                if (randomNumber2 < colNumber - 1 && field[randomNumber1 - 1][randomNumber2 + 1] != -1)
                    field[randomNumber1 - 1][randomNumber2 + 1] += 1;
            }
            if (randomNumber2 > 0 && field[randomNumber1][randomNumber2 - 1] != -1)
                field[randomNumber1][randomNumber2 - 1] += 1;
            if (randomNumber2 < colNumber - 1 && field[randomNumber1][randomNumber2 + 1] != -1)
                field[randomNumber1][randomNumber2 + 1] += 1;
            if (randomNumber1 < rowNumber - 1) {
                if (randomNumber2 > 0 && field[randomNumber1 + 1][randomNumber2 - 1] != -1)
                    field[randomNumber1 + 1][randomNumber2 - 1] += 1;
                if (field[randomNumber1 + 1][randomNumber2] != -1)
                    field[randomNumber1 + 1][randomNumber2] += 1;
                if (randomNumber2 < colNumber - 1 && field[randomNumber1 + 1][randomNumber2 + 1] != -1)
                    field[randomNumber1 + 1][randomNumber2 + 1] += 1;
            }
        }


    }

    public void run() {
        int a = 0;
        System.out.println("Mayın Tarlası Oyununa Hoş Geldiniz!");
        while ((rowNumber * colNumber) - (((rowNumber) * (colNumber) - 2) / 4) > a) {
            for (int k = 0; k < field.length; k++) {
                System.out.println(Arrays.toString(this.str[k]));
            }
            System.out.print("Lütfen satır numarasını giriniz: ");
            int u = input.nextInt();
            System.out.print("Lütfen sütun numarasını giriniz: ");
            int o = input.nextInt();
            if (u >= rowNumber || u < 0 || o < 0 || o >= colNumber) {
                System.out.println("Lütfen satır ve sütun numarasını doğru giriniz!");
                continue;
            }
            if (field[u][o] == -1) {
                System.out.println("Mayına bastınız! \n-------------OYUN BİTTİ------------");
                for (int k = 0; k < field.length; k++) {
                    System.out.println(Arrays.toString(this.str[k]));
                }
            }
            str[u][o] = String.valueOf(field[u][o]);
            a++;
            if (a == (rowNumber * colNumber) - (((rowNumber) * (colNumber) - 2) / 4)-1) {
                System.out.println("Tebrikler oyunu kazandınız!!");
                for (int k = 0; k < field.length; k++) {
                    System.out.println(Arrays.toString(this.str[k]));
                }
                break;
            }

        }
    }

    public void showMap() {
        fillField();
        System.out.println("---------------------------------------");
        for (int k = 0; k < field.length; k++) {
            System.out.println(Arrays.toString(this.map[k]));

        }
        System.out.println("---------------------------------------");
    }
}
