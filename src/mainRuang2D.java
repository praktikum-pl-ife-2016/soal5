
public class mainRuang2D {

    public static void main(String[] args) {

        System.out.println("Luas dan Keliling");

        Ruang2D main = new Ruang2D();
        System.out.println("Luas Segitiga\t\t:"+Ruang2D.LuasSegitiga());
        System.out.println("Keliling Segitiga\t:"+Ruang2D.KelilingSegitiga());
        System.out.println("Luas Segiempat\t\t:"+Ruang2D.LuasSegiEmpat());
        System.out.println("Keliling Segiempat\t:"+Ruang2D.KelilingSegiempat());
        System.out.println("Luas Lingkaran\t\t:"+Ruang2D.LuasLingkaran());
        System.out.println("Keliling Lingkaran\t:"+Ruang2D.KelilingLingkaran());

    }
}
