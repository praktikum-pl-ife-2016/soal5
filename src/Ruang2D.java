

public class Ruang2D {
    static final double phi = 3.14;
    static double alas;
    static double tinggi;
    static double sisiMiring;
    static double panjang;
    static double lebar;
    static double r;
    
    public static double KelilingSegitiga(double alas, double tinggi, double sisiMiring){
        return (alas + tinggi + sisiMiring);
    }
    public static double LuasSegitiga(double alas, double tinggi){
        return (0.5 * alas * tinggi);
    }
    public static double KelilingSegiempat(double panjang, double lebar){
        return (2 * (panjang + lebar));
    }
    public static double LuasSegiempat(double panjang, double lebar){
        return (panjang * lebar);
    }
    public static double KelilingLingkaran(double r){
        return (2 * phi * r);
    }
    public static double LuasLingkaran(double r){
        return (phi * r *r);
    }
}
