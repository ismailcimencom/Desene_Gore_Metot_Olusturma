import java.util.Scanner;

public class Main {

    static void printPattern(int sayi, int islem, boolean kontrol) {
        System.out.print(islem + " ");
        if (!kontrol && sayi == islem) return;

        if (kontrol) {
            printPattern(sayi, islem - 5, islem - 5 > 0);
        } else {
            printPattern(sayi, islem + 5, false);
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("N Sayısı: ");
        int number = scan.nextInt();
        System.out.print("Çıktısı: ");
        printPattern(number, number, true);
    }
}
