/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P5;

/**
 *
 * @author guest-6EEkL1
 */
public class Ruang2D {
    final static double phi = 3.14;
    public static double luasSegitiga(int a, int b){
        return 0.5*a*b;
    }
    public static double kelilingSegitiga(int a, int c, int d){
        return a+c+d;
    }
    public static int luasSegiempat(int p, int l){
        return p*l;
    }
    public static int kelilingSegiempat(int p, int l){
        return (2*p)+(2*l);
    }
    public static double luasLingkaran(int r){
        return phi*r*r;
    }
    public static double kelilingLingkaran(int r){
        return phi*2*r;
    }
}
