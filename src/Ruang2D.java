public class Ruang2D {

    static final double phi = 3.14;
    
    public static double kelilingSegitiga(double alas, double tinggi) {
        double sisiMiring = Math.sqrt(Math.pow(alas, 2)+Math.pow(tinggi, 2));
        double keliling = sisiMiring + alas + tinggi;
        return keliling;
    }
    
    public static double luasSegitiga(double alas, double tinggi) {
        double luas = (alas * tinggi / 2);
        return luas;
    }
    
    public static double kelilingSegiempat(double panjang, double lebar) {
        double keliling = (panjang * 2) + (lebar * 2);
        return keliling;
    }
    
    public static double luasSegiempat(double panjang, double lebar) {
        double luas = panjang * lebar;
        return luas;
    }
    
    public static double kelilingLingkaran(double jari, double phi) {
        double keliling = (2 * phi * jari);
        return keliling;
    }
    
    public static double luasLingkaran(double jari, double phi) {
        double luas = (phi * jari * jari);
        return luas;
    }
}
