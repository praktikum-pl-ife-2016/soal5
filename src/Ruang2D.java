public class Ruang2D {
    static final double phi=3.14;
    //method keliling segitiga
    public static double kelilingSegitiga(double alas,double tinggi){
        double miring = Math.sqrt(Math.pow(alas, 2)+Math.pow(tinggi,2));
        return miring+alas+tinggi;
    }
    //method luas segitiga
    public static double luasSegitiga(double alas, double tinggi){
        return (alas*tinggi)/2;
    }
    //method keliling segi empat
    public static double kelilingSegiEmpat(double panjang, double lebar){
        return 2*(panjang+lebar);
    }
    //method luas segi empat
    public static double luasSegiEmpat(double panjang, double lebar){
        return panjang*lebar;
    }
    //method keliling lingkaran
    public static double kelilingLingkaran(double jari){
        return 2*phi*jari;
    }
    //method luas lingkaran
    public static double luasLingkaran(double jari){
        return phi*jari*jari;
    }
}
