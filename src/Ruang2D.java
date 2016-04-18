
package ruang2d;


public class Ruang2D {
 public static final double phi = 3.14;
    
    public static void LuasSegitiga(int alas, int tinggi) {
        int LuasSegitiga = alas*tinggi/2;
        System.out.println("Luas Segitiga =" +LuasSegitiga);
    }   
    public static void KelilingSegitiga(double sisi1, double sisi2, double sisi3) {
     double KelilingSegitiga = sisi1+sisi2+sisi3;
        System.out.println("Keliling Segitiga =" +KelilingSegitiga);
    }   
    public static void LuasSegiempat(int sisi){
        int LuasSegiempat = sisi * sisi;
        System.out.print("Luas Segiempat =" + LuasSegiempat);    
    }
    public static void KelilingSegiempat(int sisi1, int sisi2) {
    int KelilingSegiempat= 2*sisi1+sisi2;
        System.out.print("Keliling Segiempat =" +KelilingSegiempat);
    }
    public static void LuasLingkaran(double r) {
            double LuasLingkaran = phi *r *r;
            System.out.println("Luas Lingkaran=" +LuasLingkaran);
    }
    public static void KelilingLingkaran( double r) {
    double KelilingLingkaran= phi*r*r;
        System.out.print("Keliling LIngkaran =" +KelilingLingkaran);
}
}
    

