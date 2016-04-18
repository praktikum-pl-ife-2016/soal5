public class Ruang2D {
    private static double keliling;
    private static double luas;
    private static final double PHI = 3.14;
    public static double KelilingSegitiga (int alas, int tinggi, int miring){
       keliling =  alas+tinggi+miring;
        System.out.println(keliling);
       return keliling;
    }
    public static double LuasSegitiga (int alas, int tinggi, int miring){
       luas =  alas*tinggi*0.5;
       System.out.println(luas);
       return luas;
    }
    public static double KelilingSegiEmpat (int lebar , int panjang){
       keliling =  2*(panjang+lebar) ;
       System.out.println(keliling);
       return keliling;
    }
    public static double LuasSegiEmpat (int lebar , int panjang){
       luas =  panjang*lebar ;
       System.out.println(luas);
       return luas;
    }
    public static double KelilingLingkaran (int jari){
       keliling =  2*PHI*jari ;
       System.out.println(keliling);
       return keliling;
    }
    public static double LuasLingkaran (int jari){
       luas = PHI * jari *jari;
       System.out.println(luas);
       return luas;
    }
}
