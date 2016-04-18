public class Ruang2D {
    final static double phi= 3.14;
    
    public static double LuasSegiTiga(double a, double t){
        return 0.5 * a * t;
    }
    
    public static double KelilingSegiTiga(double a, double s1, double s2){
        return a + s1 + s2;
    }
    
    public static double luasSegiEmpat(double p, double l){
        return p * l;
    } 
    
     public static double kelilingSegiEmpat(double p, double l){
        return 2 *(p+l);
    } 
     
     public static double luasLingkaran(double r){
         return phi * Math.pow(r,2);
     }
     
      public static double kelilingLingkaran(double r){
         return phi * (r * 2);
     }
}
