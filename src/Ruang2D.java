/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruang2d;

public class Ruang2D {

    private final static double phi = 3.14;

    public static void luasSegitiga(int a, int b, int c) {
        int luasSegitiga = a * b;
        int kelilingSegitiga = a + b + c;
        System.out.println("Luas Segitiga =" + luasSegitiga);
        System.out.println("Keliling Segitiga =" + kelilingSegitiga);
    }

    public static void luasSegiempat(int sisi1, int sisi2) {
        int luasSegiempat = sisi1 * sisi2;
        int kelilingSegiempat = 2 * sisi1 * sisi2;
        System.out.println("Luas Segiempat =" + luasSegiempat);
        System.out.println("Keliling Segiempat =" + kelilingSegiempat);
    }

    public static void luasLingkaran(double r) {
        double luasLingkaran = phi * r * r;
        double kelilingLingkaran = phi * (2 * r);
        System.out.println("Luas Lingkaran =" + luasLingkaran);
        System.out.println("Keliling lingkaran =" + kelilingLingkaran);

    }

}
