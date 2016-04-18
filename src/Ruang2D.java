public class Ruang2D {
    private static final double PHI = 3.14;
    public static int count;
   //Menghitung Luas Segitiga
    public static double luasSegitiga(double alas,double tinggi){
        count++;
        return (alas*tinggi)/2;
    }
    //Menghitung Keliling Segitiga
    public static double kelilingSegitiga(double sisiA,double sisiB,double sisiC){
        count++;
        return sisiA+sisiB+sisiC;
    }
    //Menghitung Luas Segiempat
    public static double luasSegi4(double panjang,double lebar){
        count++;
        return panjang * lebar;
    }
    //Menghitung Keliling Segiempat
    public static double kelilingSegi4(double panjang, double lebar){
        count++;
        return 2*(panjang+lebar);
    }
    //Menghitung Luas Lingkaran
    public static double luasLingkaran(double jariJari){
        count++;
        return PHI*jariJari*jariJari;
    }
    //Menghitung Keliling Lingkaran
    public static double kelilingLingkaran(double jariJari){
        count++;
        return 2*PHI*jariJari;
    }
}
