/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mm;

/**
 *
 * @author guest-ARLjF4
 */
public class Ruang2D {

   private static final double phi = 3.14;

    public static double LSegitiga(double a, double b) {
        return (a * b) / 2;
    }
    public static double LSegiEmpat(double p,double l){
        return p*l;
    }
    public static double KSegiEmpat(double p,double l){
        return 2*(p+l);
    }
    public static double KSegiTiga(double a,double b,double c){
        return a+b+c;
    }
    public static double LuasLing(double r){
        return phi*r*r;
    }
    public static double KeLing(double r){
        return 2*phi*r;
    
}

       
}
