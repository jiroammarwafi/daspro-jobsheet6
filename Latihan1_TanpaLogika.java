import java.util.Scanner;
public class Latihan1_TanpaLogika {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float bil1,bil2,bil3, bilTerbesar;

        System.err.println("Masukkan bilangan pertama :");
        bil1 = sc.nextFloat();
        System.out.println("Masukkan bilangan kedua : ");
        bil2 = sc.nextFloat();
        System.out.println("Masukkan bilangan ketiga : ");
        bil3 = sc.nextFloat();

if (bil1 > bil2) {
    if (bil1 > bil3){
        bilTerbesar = bil1;
    } else {
        bilTerbesar = bil3;
        
    }
    
}
    }
}