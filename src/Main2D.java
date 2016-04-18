import java.util.Scanner;
public class Main2D {

    public static void main(String[] args) {
        int pilih;
        Scanner in = new Scanner(System.in);
        System.out.println("== Menghitung Luas dan Keliling Bangun Datar ==");
        System.out.println("1. Keliling Segitiga\n2. Luas Segitiga");
        System.out.println("3. Keliling Segiempat\n4. Luas Segiempat");
        System.out.println("5. Keliling Lingkarang\n6. Luas Lingkaran");
        System.out.print("Masukan pilihan : ");
        pilih = in.nextInt();
        switch (pilih) {
            case 1:
                System.out.println("Keliling Segitiga : "+Ruang2D.SegitigaKel(3,4,5));
                break;
            case 2:
                System.out.println("Luas Segitga : "+Ruang2D.SegitigaLuas(5, 6));
                break;
            case 3:
                System.out.println("Keliling Segiempat : "+Ruang2D.SegiempatKel(5));
                break;
            case 4:
                System.out.println("Luas Segiempat : "+Ruang2D.SegiempatLuas(10));
                break;
            case 5:
                System.out.println("Keliling Lingkaran : "+Ruang2D.LingkaranKel(7));
                break;
            case 6:
                System.out.println("Luas Lingkaran : "+Ruang2D.LingkaranLuas(7));
                break;
        }
    }
}
