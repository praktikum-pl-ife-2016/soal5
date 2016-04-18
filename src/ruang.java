public class ruang {

    static double tinggi,alas,panjang,lebar,jari;
    static final double phi = 3.14;
    
    public static double kelilingsegitiga(double alas,double tinggi){
      double sisi = Math.sqrt(Math.pow(alas, 2)+Math.pow(tinggi,2));
      double kel = tinggi + alas + sisi;
      return kel;
    }
    public static double luassegitiga(double alas,double tinggi){
        double luas = (tinggi*alas)/2;
        return luas;
    }
    public static double kelilingsegiempat(double panjang,double lebar){
        double kel = 2*(panjang+lebar);
        return kel;
    }
    public static double luassegiempat(double panjang,double lebar){
        double luas = panjang*lebar;
        return luas;
    }
    public static double kelilinglingkaran(double jari){
        double kel = 2 * phi * jari;
        return kel;
    }
    public static double luaslingkaran(double jari){
        double luas = phi*Math.pow(jari, 2);
        return luas ;
    }
}
