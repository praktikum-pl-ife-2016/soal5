package ruang2d;

public class MainRuang2D {

    public static void main(String[] args) {
        System.out.println("Luas Segitiga " + Ruang2D.hitungSegitigaLuas(2, 6));
        System.out.println("Keliling Segitiga " + Ruang2D.hitungSegitigaKel(2));
        System.out.println("Luas Segiempat " + Ruang2D.hitungSegiempatLuas(4, 3));
        System.out.println("Keliling Segiempat " + Ruang2D.hitungSegiempatKel(4, 3));
        System.out.println("Luas Lingkaran " + Ruang2D.hitungLingkaranLuas(4));
        System.out.println("Keliling Lingkaran " + Ruang2D.hitungLingkaranKel(4));
    }
}
