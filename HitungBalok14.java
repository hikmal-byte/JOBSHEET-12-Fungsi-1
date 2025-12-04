import java.util.Scanner;

public class HitungBalok14 {

    public static void main(String[] args) {
        Scanner hikmal = new Scanner(System.in);
        int p, l, t, L, vol;

        System.out.println("Masukkan panjang");
        p = hikmal.nextInt();

        System.out.println("Masukkan lebar");
        l = hikmal.nextInt();

        System.out.println("Masukkan tinggi");
        t = hikmal.nextInt();
        
        L = p * l * t;
        System.out.println("Luas persegi panjang adalah " + L);
        vol = p * l * t;
        System.out.println("Volume balok adalah " + vol);

        
        hikmal.close();
    }
    static int hitungLuas(int panjang, int lebar) {
        int Luas = panjang * lebar;
        return Luas;
    }

    static int hitungVolume(int tinggi, int a, int b) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }
}