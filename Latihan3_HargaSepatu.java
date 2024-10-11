import java.util.Scanner;
public class Latihan3_HargaSepatu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kategori, merek;
        byte ukuran;
        double harga = 0;

        System.out.print("Masukkan merek ( Specs / 910 / Ortus ) : ");
        merek = sc.nextLine();

switch (merek.toLowerCase()){
    case "specs":
        System.out.print("Pilih kategori ( Slip On / High top ) : ");
        kategori = sc.nextLine();
        switch (kategori.toLowerCase()){
            case "slip on":
            System.out.print("Pilih Ukuran : ");
            ukuran = sc.nextByte();
            if (ukuran >= 36) {
                if (ukuran <= 40)
                    harga = 800000;
                    System.out.print("Harga sepatu : " + harga);
            }break;
            case "high top":
            System.out.print("Pilih Ukuran : ");
            ukuran = sc.nextByte();
            if (ukuran >= 40) {
                if (ukuran <=41)
                    harga = 1200000;
                    System.out.print("Harga sepatu : " + harga);
            }break;
        default:
        System.out.print("Data tidak tersedia");
        }
        break;
    case "910":
        System.out.print("Pilih Kategori ( Woman / Man ) : ");
        kategori = sc.nextLine();
        switch (kategori.toLowerCase()){
            case "woman":
            System.out.print("Pilih Ukuran : ");
            ukuran = sc.nextByte();
            if (ukuran >= 36) {
                if (ukuran <=41)
                    harga = 1000000;
                    System.out.print("Harga sepatu : " + harga);
            }break;
            case "man":
            System.out.print("Pilih Ukuran : ");
            ukuran = sc.nextByte();
            if (ukuran >= 41) {
                if (ukuran <=44)
                    harga = 1800000;
                    System.out.print("Harga sepatu : " + harga);
            }break;
        default:
        System.out.print("Data tidak tersedia");
        }
        break;
    case "ortus":
        System.out.print("Pilih Kategori ( Kids / Adult ) : ");
        kategori = sc.nextLine();
        switch (kategori.toLowerCase()){
            case "kids":
            System.out.print("Pilih Ukuran : ");
            ukuran = sc.nextByte();
            if (ukuran >= 36) {
                if (ukuran <=40)
                    harga = 750000;
                    System.out.print("Harga sepatu : " + harga);
            }break;
            case "adult":
            System.out.print("Pilih Ukuran : ");
            ukuran = sc.nextByte();
            if (ukuran >= 40) {
                if (ukuran <=44)
                    harga = 1500000;
                    System.out.print("Harga sepatu : " + harga);
            }break;
        default:
        System.out.print("Data tidak tersedia");
        }
        break;
    default:
        System.out.print("Data tidak tersedia");
    }
}
}