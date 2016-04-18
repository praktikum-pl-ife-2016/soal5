public class Ruang2D {
    static final double phi = 3.14;
    public static double luasTiga, kelTiga, luasEmpat, kelEmpat, luasAran, kelAran;
    
    
    public static double luasS(double alas, double tinggi){
        luasTiga = (alas *0.5) *  tinggi;
        return luasTiga;
    }
    
    public static double kelS(double alas, double tinggi, double sisi){
        kelTiga = alas + tinggi + sisi;
        return kelTiga;
    }
    
    public static double luasT(double panjang, double lebar){
        luasEmpat = panjang * lebar;
        return luasEmpat;
    }
    
    public static double kelT(double panjang, double lebar){
        kelEmpat = 2 * (panjang + lebar);
        return kelEmpat;
    }
    
    public static double luasL(double jari2){
        luasAran = phi * jari2 * jari2;
        return luasAran;
    }
    
    public static double kelL(double jari2){
        kelAran = 2 * (phi * jari2);
        return kelAran;
    }
}
