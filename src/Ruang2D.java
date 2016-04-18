public class Ruang2D {
    private static final double phi = 3.14;
    public static double LuasSegitiga() {
        double alas=4;
        double tinggi=2;
        double luas = (alas*tinggi)/2;
        return luas;
    }
    public static double KelilingSegitiga(){
        double sisi1=2;
        double sisi2=3;
        double sisi3=4;
        double keliling = sisi1+sisi2+sisi3;
        return keliling;
    }
    public static double LuasSegiEmpat(){
        double s1=3;
        double s2=4;
        double luas = s1*s2;
        return luas;
    }
    public static double KelilingSegiempat(){
        double si1=5;
        double si2=7;
        double keliling = 2*(si1+si2);
        return keliling;
    }
    public static double LuasLingkaran(){
        double r = 7;
        double luas = phi*r*r;
        return luas;
    }  
    public static double KelilingLingkaran(){
        double r = 5;
        double keliling = phi*(2*r);
        return keliling;
    }
}