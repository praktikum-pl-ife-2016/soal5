
public class Ruang2D {
    static final double phi = 3.14;
    
    public static double hitungLuasSegitiga(double a, double t){
        return (0.5 * a * t);
    }
    
    public static double hitungKelSegitiga(double s){
        return (3 * s);
    }
    
    public static double hitungLuasSegiempat(double p, double l){
        return (p * l);
    }
    
    public static double hitungKelSegiempat(double p, double l){
        return (2 * (p + l));
    }
    
    public static double hitungLuasLingkaran(double r){
        return (phi * r * r);
    }
    
    public static double hitungKelLingkaran(double d){
        return (phi * d);
    }
}
