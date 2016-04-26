/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guest-RVUsNg
 */
public class Ruang2D {
    final static double phi = 3.14;
    
    public static void LuasSegitiga(double a, double b){
    double luas = 0.5 * a*b;
        System.out.println("Luas Segitigas adalah "+luas);
    }
    
    public static void KelilingSegitiga(double a, double b){
    double keliling = Math.sqrt(Math.pow(a, 2)+Math.pow(b,2))+a+b;
        System.out.println("Keliling Segitiga adalah "+keliling);
    }
    
    public static void LuasLingkaran(double jari){
    double luas = phi* Math.pow(jari,2);
        System.out.println("luas Lingkaran adalah "+luas);
    }
    
    public static void KelilingLingkaran(double jari){
    double keliling = phi*2*jari;
        System.out.println("Keliling Lingkaran adalah "+ keliling);
    }
    
    public static void LuasSegiempat(double panjang, double lebar){
    double luas = panjang * lebar;
        System.out.println("luas Segiempat adalah "+luas);  
    }
    
    public static void KelilingSegitempat(double panjang, double lebar){
    double keliling = 2*(panjang+lebar);
        System.out.println("keliling Segiempat adalah "+keliling);
    }
}
