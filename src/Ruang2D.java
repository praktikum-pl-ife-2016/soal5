
package ruang2d;

public class Ruang2D {


static final double phi = 3.14;
public static void LuasSegitiga (int alas, int tinggi, int sisimiring){
    int luasSegitiga = alas * tinggi /2;
    int kelilingSegitiga = alas + tinggi +sisimiring;
    
    System.out.println("luas Segitiga =" + luasSegitiga);
    System.out.println ("keliling segitiga "+ kelilingSegitiga);
}
public static void LuasSegiempat (int sisi) {
    int luasSegiempat = sisi * sisi;
    int kelilingSegiempat = 4 * sisi;
    
    System.out.println("Luas Segiempat = "+ luasSegiempat);
    System.out.println ("keliling segiempat "+ kelilingSegiempat);
    
}
public static void LuasLingkaran ( double r){
    double luasLingkaran = phi * r * r; 
    double kelilingLingkaran = phi * (2*r);
    
    
    System.out.println ("Luas Lingkaran =" + luasLingkaran);
    System.out.println ("keliling lingkaran "+ kelilingLingkaran);
    
}

   
        
}

