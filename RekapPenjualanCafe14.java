import java.util.Scanner;

public class RekapPenjualanCafe14 {

    Scanner hikmal = new Scanner(System.in);
    String[] menu;
    int[][] penjualan;
    int jumlahMenu, jumlahHari;

    void inputUkuran() {
        System.out.print("Masukkan jumlah menu: ");
        jumlahMenu = hikmal.nextInt();
        System.out.print("Masukkan jumlah hari penjualan: ");
        jumlahHari = hikmal.nextInt();

        menu = new String[jumlahMenu];
        penjualan = new int[jumlahMenu][jumlahHari];
    }

    void inputDataPenjualan() {
        System.out.println("\n===== INPUT NAMA MENU =====");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Nama menu ke-" + (i + 1) + ": ");
            menu[i] = hikmal.next();
        }

        System.out.println("\n===== INPUT DATA PENJUALAN =====");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.println("Menu: " + menu[i]);
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = hikmal.nextInt();
            }
        }
    }

    void tampilTabelPenjualan() {
        System.out.println("\n===== TABEL PENJUALAN =====");
        System.out.print("Menu\t\t");
        for (int h = 1; h <= jumlahHari; h++) {
            System.out.print("H" + h + "\t");
        }
        System.out.println();

        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print(menu[i] + "\t");
            if (menu[i].length() < 8) System.out.print("\t");
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print(penjualan[i][j] + "\t");
            }
            System.out.println();
        }
    }

    void tampilMenuTerlaris() {
        int max = 0;
        int indexMenu = 0;

        for (int i = 0; i < jumlahMenu; i++) {
            int total = 0;
            for (int j = 0; j < jumlahHari; j++) {
                total += penjualan[i][j];
            }
            if (total > max) {
                max = total;
                indexMenu = i;
            }
        }

        System.out.println("\nMenu dengan penjualan tertinggi: " +
                menu[indexMenu] + " dengan total " + max + " porsi");
    }

    void tampilRataRata() {
        System.out.println("\n===== RATA-RATA PENJUALAN =====");
        for (int i = 0; i < jumlahMenu; i++) {
            int total = 0;
            for (int j = 0; j < jumlahHari; j++) {
                total += penjualan[i][j];
            }
            double rata = total / (double) jumlahHari;
            System.out.printf("%-15s : %.2f%n", menu[i], rata);
        }
    }

    public static void main(String[] args) {
        RekapPenjualanCafe14 cafe = new RekapPenjualanCafe14();

        cafe.inputUkuran();
        cafe.inputDataPenjualan();
        cafe.tampilTabelPenjualan();
        cafe.tampilMenuTerlaris();
        cafe.tampilRataRata();
    }
}
