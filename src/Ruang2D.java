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
    final static double phi = 3.14;
    
    public static void segitiga(double a, double t, double c){
        double l = a*t/2;
        System.out.println("Luas Segitiga : "+l);
        double k = a+t+c;
        System.out.println("Keliling Segitiga : "+k);
    }
    
    public static void lingkaran(double r){
        double l = phi * r * r;
        System.out.println("Luas Lingkaran : "+l);
        double k = phi * (r*2);
        System.out.println("Keliling Lingkaran : "+k);
    }
    
    public static void segiempat(double p, double l){
        double k = (p+l)*2;
        System.out.println("Keliling Segiempat : "+k);
        double lu = p*l;
        System.out.println("Luas Segiempat : "+l);
    }
}
