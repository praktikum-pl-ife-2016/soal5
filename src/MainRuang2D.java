
package ruang2d;

import java.util.Scanner;

public class MainRuang2D {
    public static void main (String[]args){

    Scanner input = new Scanner (System.in);
    
   System.out.print("masukkan alas : ");
   int alas = input.nextInt();

    System.out.print("masukkan tinggi : ");
    int tinggi = input.nextInt();
    System.out.print("masukkan sisi miring : ");
    int sisimiring = input.nextInt();

Ruang2D.LuasSegitiga(alas, tinggi, sisimiring);

System.out.print("masukkan panjang sisi : ");
   int sisi = input.nextInt();
   
   Ruang2D.LuasSegiempat(sisi);
   
   System.out.print("masukkan jarijari : ");
   double r = input.nextDouble();
        final double phi = 3.14;
   
   Ruang2D.LuasLingkaran(r);
   

   



    }
}