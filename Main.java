import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan alas : ");
        int nil1 = in.nextInt();
        Ruang2D.hitungKelilingSegitiga(nil1);
        System.out.print("Masukkan alas : ");
        nil1 = in.nextInt();
        System.out.print("Masukkan tinggi : ");
        int nil2 = in.nextInt();
        Ruang2D.hitungLuasSegitiga(nil1,nil2);
        System.out.print("Masukkan panjang : ");
        nil1 = in.nextInt();
        System.out.print("Masukkan lebar : ");
        nil2 = in.nextInt();
        Ruang2D.hitungKelilingSegiempat(nil1,nil2);
        System.out.print("Masukkan panjang : ");
        nil1 = in.nextInt();
        System.out.print("Masukkan lebar : ");
        nil2 = in.nextInt();
        Ruang2D.hitungLuasSegiempat(nil1,nil2);
        System.out.print("Masukkan r / jari -jari : ");
        nil1 = in.nextInt();
        Ruang2D.hitungKelilingLingkaran(nil1);
        System.out.print("Masukkan r / jari -jari : ");
        nil1 = in.nextInt();
        Ruang2D.hitungLuasLingkaran(nil1);
    }   
}
