public class Ruang2D {

    private final static double PHI = 3.14;
    
    public static double LuasLingkaran(){
        int jarijari=10;
        double luas=PHI*(jarijari*jarijari);
        return luas;
    }
    public static double KelilingLingkaran(){
        int jarijari=8;
        double keliling=2*PHI*jarijari;
        return keliling;
    }
    public static double LuasSegitiga(){
        int alas = 4;
        int tinggi = 8;
        double luas = 0.5*(alas*tinggi);
        return luas;
    }
    public static double KelilingSegitiga(){
        int sisi= 4;
        double keliling=sisi+sisi+sisi;
        return keliling;
    }
    public static double LuasSegiempat(){
        int panjang = 10;
        int lebar = 5;
        double luas = panjang*lebar;
        return luas;
    }
    public static double KelilingSegiempat(){
        int panjang = 10;
        int lebar = 5;
        double keliling = 2*(panjang+lebar);
        return keliling;
    }
    
}
