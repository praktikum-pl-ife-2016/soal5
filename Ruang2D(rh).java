package latihan.pkg1;

public class Ruang2D {

    static final double phi = 3.14;

    public static double kelSegitiga(double alas, double tinggi) {
        double miring = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        return miring + alas + tinggi;
    }

    public static double luasSegitiga(double alas, double tinggi) {
        return (alas * tinggi) / 2;
    }
    
    public static double kelSegiEmpat(double panjang, double lebar) {
        return (panjang + lebar) * 2;
    }
    
    public static double luasSegiEmpat(double panjang, double lebar) {
        return panjang * lebar;
    }
    
    public static double kelLingkaran(double jari) {
        return 2 * phi * jari;
    }
    
    public static double luasLingkaran(double jari) {
        return phi * jari * jari;
    }
}