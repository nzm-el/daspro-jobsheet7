import java.util.Scanner;
public class Bioskop18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaTiket = 50000;
        int totalTiketTerjual = 0;
        double totalPenjualan = 0.0;

        while (true) {
            System.out.print("Masukan jumlah tiket yang dibeli (atau ketik '0' untuk keluar): ");
            int totalTiket = sc.nextInt();
            if (totalTiket == 0) {
                break;
            }
            if (totalTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Silahkan masukkan jumlah yang benar");
                continue;
            }
                double hargaTotal = totalTiket * hargaTiket;
                double diskon = 0.0;

            if (totalTiket > 10) { 
                diskon = 0.15;
            }else if (totalTiket > 4) { 
                diskon = 0.10;
            }
            double hargaTotalDisc = hargaTotal * (1 - diskon);
            totalTiketTerjual += totalTiket;
            totalPenjualan+= hargaTotalDisc;
            System.out.println("Harga total untuk " + totalTiket + " tiket adalah: Rp " + hargaTotalDisc);
        }
        System.out.println("===================================");
        System.out.println("Total tiket terjual  : " + totalTiketTerjual);  
        System.out.println("Total penjualan tiket: Rp " + totalPenjualan);
    }
}
