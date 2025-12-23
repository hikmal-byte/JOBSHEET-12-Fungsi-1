import java.util.Scanner;

public class Kubus14 {
    static int hitungVolume(int sisi){
        return sisi * sisi * sisi;
    }

    static int hitungLuasPermukaan(int sisi){
        return 6 * sisi * sisi;
    }

    public static void main(String[] args) {
        Scanner hikmal = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        int s = hikmal.nextInt();

        int volume = hitungVolume(s);
        int luasPermukaan = hitungLuasPermukaan(s);

        System.out.println("Volume Kubus = " + volume);
        System.out.println("Luas Permukaan Kubus = " + luasPermukaan);
    }
}