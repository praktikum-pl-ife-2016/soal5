
public class Ruang2D {

    final static double pi = 3.14;
    static double luas;
    static int kel;

    public static int SegitigaKel(int a, int b, int c) {
        kel = a + b + c;
        return kel;
    }

    public static double SegitigaLuas(int a, int t) {
        luas = a * t / 2;
        return luas;
    }
    
    public static int SegiempatKel(int s) {
        kel = 4 * s;
        return kel;
    }

    public static double SegiempatLuas(int s) {
        luas = s * s;
        return luas;
    }
    
    public static int LingkaranKel(int r) {
        kel = (int) (2 * pi * r);
        return kel;
    }

    public static double LingkaranLuas(int r) {
        luas = pi * r * r;
        return luas;
    }
}
