
package ruang2d;

public class Ruang2D {
    static final double konstanta =3.14;
    
    public static double LuasSegitiga(double p,double l){
        return (p*l)/2;
    }
    public static double KelSegitiga(double s){
        return (s+s+s);
    }
    public static double LuasSegiempat(double p,double l){
        return (p*l);
    }
    public static double KelSegiempat(double p,double l){
        return (2*(p+l));
    }
    public static double LuasLingkaran(double r){
        return (konstanta*r*r);
        
    }
    public static double KelLingakaran(double r){
        return (konstanta*(r+r));
    }
    
    
}
