package ruang2d;
public class Ruang2D {
static final double pi = 3.14;
public static void KelilingSegitiga(double a, double b, double c){
double nilai = a+b+c;
System.out.println("keliling Segitiga : "+nilai);
}
public static void LuasSegitiga(double a, double b){
double nilai = a*b/2;
System.out.println("Luas Segitiga :"+nilai);
}
public static void KelilingSegiempat(double a, double b){
double nilai = 2*(a+b);
System.out.println("Keliling Segi Empat :"+nilai);
}
public static void LuasSegiEmpat(double a, double b){
double nilai = a*b;
System.out.println("Luas Segi Empat :"+nilai);
}
public static void KelilingLingkaran(double a){
double nilai = pi*(a*2);
System.out.println("Keliling Lingkaran :"+nilai);
}
public static void LuasLingkaran(double a){
double nilai = pi*a*a;
System.out.println("Luas Lingkaran :"+nilai);
}
}
