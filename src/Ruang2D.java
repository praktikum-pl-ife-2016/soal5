package ruang2d;

public class Ruang2D {
    final static double phi = 3.14;
        public static void Luassegitiga(int a, int b) {
        int nilai = a * b/2;
        System.out.println("Luas segitiga adalah : " + nilai);
    }
  public static void kelilingsegitiga(int a, int b, int c) {
      int kel = a+b+c;
        System.out.println("keliling segitiga adalah : " + kel);
}
    
    public static void hitungLuas(int s,int s2 ) {
     int luas = s * s2 ;
        System.out.println("luas persegi adalah : " + luas);
}

           public void hitungkeliling (int s) {
       int kel = 4*s ;
        System.out.println("keliling Segiempat adalah  : " + kel); 
}
            public static void hitungLuas(double r) {
       
        double luas = phi * r *r ;
        System.out.println("luas lingkaran adalah : " + luas);
    }
  public static void hitungKeliling(double r) {
       final double   phi = 3.14;
        double kel = phi * (2*r) ;
        System.out.println("keliling lingkaran adalah : " + kel);
}
}
