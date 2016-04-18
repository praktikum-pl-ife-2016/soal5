/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Ruang2D {
static final double phi = 3.14;
    
    public static double luasSegitiga(double x, double y) {
        double nilai;
        return nilai = x * y /2;
    }
    
    public static double luasSegiempat(double x, double y) {
        double nilai;
        return nilai = x * y;
    }
    
    public static double luasLingkaran(double x) {
        double nilai;
        return nilai = (phi * x * x);
    }
    
    public static double kelilingSegitiga(double x, double y, double z) {
        double nilai;
        return nilai = x + y + z;
    }
    
    public static double kelilingSegiempat(double x , double y) {
        double nilai;
        return nilai = 2*(x+y);
    }

    public static double kelilingLingkaran(double a) {
        double nilai;
        return nilai = 2 * phi * a;
    }
    
}
