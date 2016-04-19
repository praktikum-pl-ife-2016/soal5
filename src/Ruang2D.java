

public class Ruang2D {
    static final double phi = 3.14;
    
    public static double luasSegitiga (double x, double y){
        return (x*y)/2;
    }
    public static double luasSegiempat(double x, double y){
        return x*y;
    }
    public static double luasLingkaran(double r){
        return phi*r*r;
    }
    public static double KelSegitiga (double x){
        return 3*x;
    }
    public static double KelSegiempat (double x, double y){
        return 2*(x+y);
    }
    public static double KelLingkaran(double r){
        return phi*(r+r);
    }
}
