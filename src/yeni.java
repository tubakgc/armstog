import java.util.Scanner;

public class yeni {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("3 basamaklı armstrong sayılar :");
        int numberPow = 1;
        for (int i = 100; i <= 9999; i++) {
            int mod;
            int tempI = i, tempII = i;
            int total = 0, sayac = 0;
            while (tempI != 0) {
                tempI /= 10;
                sayac++;
            }
            while (tempII != 0) {
                mod = tempII % 10;
                for (int j = 1; j <= sayac; j++) {
                    numberPow *= mod;
                }
                total += numberPow;
                numberPow = 1;
                tempII /= 10;

            }

            if (i == total) {
                System.out.println(i);
            }
        }
    }
}
