
public class Ruang2D {
    private final static double phi = 3.14;

//RUMUS UNTUK SEGITIGA
    public static double LuasSegitiga(){
        int alas = 15;
        int tinggi = 10;
        double hasil = (alas * tinggi) /2;
        return hasil;
    }
    public static double KelilingSegitiga(){
        int sisi = 8;
        double hasil = sisi+sisi+sisi;
        return hasil;
    }
//RUMUS UNTUK PERSEGIPANJANG
    public static double LuasPP(){
        double panjang = 15;
        double lebar = 20;
        double hasil = (panjang * lebar);
        return hasil;
    }
    
    public static double KelilingPP(){
        double panjang = 15;
        double lebar = 20;
        double hasil = (2*(panjang+lebar));
        return hasil;
    }
    
//RUMUS UNTUK LINGKARAN
    public static double LuasLing(){
        int jarijari = 15;
        double hasil = phi * (jarijari*jarijari);
        return hasil;
    }
    
    public static double KelilingLing(){
        int jarijari = 15;
        double hasil = 2*phi*jarijari;
        return hasil;
    }
}
