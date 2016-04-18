package PRAKTIKUM5;

public class Ruang2D {

    private final static double phi = 3.14;

//SEGITIGA
    public static double LuasSegitiga() {
        double alas = 7;
        double tinggi = 9;
        double result = (alas * tinggi) / 2;
        return result;
    }

    public static double KelilingSegitiga() {
        double sisi1 = 3;
        double sisi2 = 4;
        double sisi3 = 5;
        double result = sisi1 + sisi2 + sisi3;
        return result;
    }

//SEGIEMPAT
    public static double LuasSegiEmpat() {
        double sisi = 6;
        double result = sisi * sisi;
        return result;
    }

    public static double KelilingSegiEmpat() {
        double sisi = 10;
        double result = 4 * sisi;
        return result;
    }

//LINGKARAN
    public static double LuasLingkaran() {
        double r = 5.5;
        double result = phi * r * r;
        return result;
    }

    public static double KelilingLingkaran() {
        double r = 5.5;
        double result = 2 * phi * r;
        return result;
    }
}
