import java.util.Scanner;
public class Latihan1_TanpaLogika {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float bil1, bil2, bil3, bilTerbesar;

        System.out.print("Masukkan bilangan pertama: ");
        bil1 = sc.nextFloat();
        System.out.print("Masukkan bilangan kedua: ");
        bil2 = sc.nextFloat();
        System.out.print("Masukkan bilangan ketiga: ");
        bil3 = sc.nextFloat();

        if (bil1 > bil2) {
            if (bil1 > bil3) {
                bilTerbesar = bil1;
            } else {
                bilTerbesar = bil3;
            }
        } else {
            if (bil2 > bil3) {
                bilTerbesar = bil2;
            } else {
                bilTerbesar = bil3;
            }
        }
        System.out.print("Diantara 3 bilangan tersebut, bilangan terbesar adalah: " + bilTerbesar);
    }
}
