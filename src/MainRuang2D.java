package ruang2d;
import java.util.Scanner;
public class MainRuang2D {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        System.out.println("Luas dan Keliling Segitiga ");
        System.out.print("Masukkan nilai a :");
        int n = in.nextInt();
        System.out.print("Masukkan nilai b :");
        int m = in.nextInt();
        System.out.print("Masukkan nilai c :");
        int o = in.nextInt();
        Ruang2D.Luassegitiga(n, m);
        Ruang2D.kelilingsegitiga(m, n, o);
        System.out.println();
        
        System.out.println("Luas dan Keliling Segiempat");
        System.out.print("Masukkan nilai sisi :");
        int x = in.nextInt();
        Ruang2D.hitungLuas(x);
        Ruang2D.hitungKeliling(x);       
       
        System.out.println("Luas dan Keliling lingkaran");
        System.out.print("Masukkan nilai sisi :");
        int s = in.nextInt();
        Ruang2D.hitungLuas(s);
        Ruang2D.hitungKeliling(s);
     
        }
    }


