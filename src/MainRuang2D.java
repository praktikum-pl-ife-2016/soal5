package PRAKTIKUM5;

public class MainRuang2D {

    public static void main(String[] args) {
        System.out.println("LUAS & KELILING BANGUN 2 DIMENSI");
        System.out.println("");
        System.out.println("SEGITIGA");
        System.out.println("--------");
        System.out.println("Luas Segitiga      = " + Ruang2D.LuasSegitiga());
        System.out.println("Keliling Segitiga  = " + Ruang2D.KelilingSegitiga());
        System.out.println("================================");
        System.out.println("PERSEGI PANJANG");
        System.out.println("---------------");
        System.out.println("Luas Segi Empat     = " + Ruang2D.LuasSegiEmpat());
        System.out.println("Keliling Segi Empat = " + Ruang2D.KelilingSegiEmpat());
        System.out.println("================================");
        System.out.println("LINGKARAN");
        System.out.println("---------");
        System.out.println("Luas Lingkaran     = " + Ruang2D.LuasLingkaran());
        System.out.println("Keliling Lingkaran = " + Ruang2D.KelilingLingkaran());
        System.out.println("================================");
    }
}
