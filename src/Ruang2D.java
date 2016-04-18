
public class Ruang2D {

  private final static double PHI = 3.14;
  
  //Ruang 2 dimensi segitiga
   public static double LuasSegitiga(){
        int tinggi = 10;
        int alas = 6;
        double luassegitiga = 0.5*(alas*tinggi);
        return luassegitiga;
    }
    public static double KelilingSegitiga(){
        int sisiA= 7;
        int sisiB= 8;
        int sisiC= 9;
        double kelilingsegitiga=sisiA+sisiB+sisiC;
        return kelilingsegitiga;
    }
  
  //Ruang 2 dimensi segiempat
    public static double LuasSegiempat(){
        int panjang = 12;
        int lebar = 6;
        double luassegiempat = panjang*lebar;
        return luassegiempat;
    }
    public static double KelilingSegiempat(){
        int panjang = 12 ;
        int lebar = 6;
        double kelilingsegiempat = 2*(panjang+lebar);
        return kelilingsegiempat;
    }
    
    //Ruang 2 dimensi ligkaran
    public static double LuasLingkaran(){
        int jarijari=5;
        double luaslingkaran=PHI*(jarijari*jarijari);
        return luaslingkaran;
    }
    public static double KelilingLingkaran(){
        int jarijari=6;
        double kelilinglingkaran=2*PHI*jarijari;
        return kelilinglingkaran;
    }
    
}
    
    

