public class MainRuang2D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("keliling lingkaran  : "+Ruang2D.kelilingLingkaran(2));
        System.out.println("luas lingkaran      : "+Ruang2D.luasLingkaran(5));
        System.out.println("keliling segitiga   : "+Ruang2D.kelilingSegitiga(1,2,3));
        System.out.println("luas segitiga       : "+Ruang2D.luasSegitiga(2,4));
        System.out.println("keliling segiemapat : "+Ruang2D.kelilingSegi4(3,4));
        System.out.println("luas segieampat     : "+Ruang2D.luasSegi4(4,3));
        System.out.println("jumlah pemanggilan method : "+Ruang2D.count);
    }
    
}
