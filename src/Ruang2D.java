/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruang2d;

public class Ruang2D {

    static final double phi = 3.14;

    //Method static untuk menghitung luas segitiga
    public static double luasSegitiga(double alas, double tinggi) {
        System.out.println("LUAS DAN KELILING SEGITIGA");
        double luasSegitiga = (alas * tinggi) / 2;
        System.out.println("Jadi Luas Segitiga adalah : (alas x tinggi)/2 =  " + luasSegitiga);
        return luasSegitiga;
    }

    //Method static untuk menghitung keliling segitiga
    public static double kllSegitiga(double sisi) {
        double kllSegitiga = sisi + sisi + sisi;
        System.out.println("Jadi Keliling Segitiga adalah : sisi + sisi + sisi = " + kllSegitiga);
        System.out.println("");
        return kllSegitiga;
    }
    //Method static untuk menghitung luas segiempat
    public static double luasSegiempat(double panjang, double lebar) {
        System.out.println("LUAS DAN KELILING SEGIEMPAT");
        double luasSegiEmpat = panjang * lebar;
        System.out.println("Jadi Luas Segiempat adalah : panjang x lebar =  " + luasSegiEmpat);
        return luasSegiEmpat;
    }
    //Method static untuk menghitung keliling segiempat
    public static double kllSegiEmpat(double panjang, double lebar) {
        double kllSegiEmpat = 2 * (panjang + lebar);
        System.out.println("Jadi Keliling Segiempat adalah : 2 x (panjang + lebar) = " + kllSegiEmpat);
        System.out.println("");
        return kllSegiEmpat;
    }
    //Method static untuk menghitung luas lingkaran
    public static double lingkaran(double jari) {
        System.out.println("LUAS DAN KELILING LINGKARAN");
        double luasLingkaran = phi * jari * jari;
        System.out.println("Jadi Luas Lingkaran adalah : phi x r x r =  " + luasLingkaran);
        return luasLingkaran;
    }
    //Method static untuk menghitung keliling lingkaran
    public static double kllLingkaran(double jari) {
        double kllLingkaran = 2 * phi * jari;
        System.out.println("Jadi Keliling Lingkaran adalah : 2 x phi x r = " + kllLingkaran);
        System.out.println("");
        return kllLingkaran;
    }
}
