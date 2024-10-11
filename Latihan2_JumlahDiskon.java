import java.util.Scanner;
public class Latihan2_JumlahDiskon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jenisBuku;
        Byte jmlBuku, jmlDiskon = 0;

        System.out.print("Masukkan jenis buku: ");
        jenisBuku = sc.nextLine();
        System.out.print("Masukkan jumlah buku: ");
        jmlBuku = sc.nextByte();

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            if (jmlBuku > 2) {
                jmlDiskon = 12; 
            } else {
                jmlDiskon = 10;
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            if (jmlBuku > 3) {
                jmlDiskon = 9;
            } else {
                jmlDiskon = 8;
            }
        } else {
            if (jmlBuku > 3) {
                jmlDiskon = 5;
            } else {
                jmlDiskon = 0;
            }
        }
        System.out.print("Jumlah diskon sebesar " + jmlDiskon + "%");
    }
}