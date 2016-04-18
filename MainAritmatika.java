


import java.util.Scanner;
public class MainAritmatika {
    
public static void main(String[] args) {
Scanner in = new Scanner(System.in);

//memanggil method static luas segitiga
System.out.print("masukkan alas : ");
double nil1 = in.nextDouble();

System.out.print("masukkan tinggi : ");
double nil2 = in.nextDouble();


Aritmatika.hitungLuasSegitiga(nil1, nil2);

//memanggil method static keliling segitiga
System.out.print("masukkan sisi : ");
nil1 = in.nextDouble();


Aritmatika.hitungKelilingSegitiga(nil1);

//memanggil method static luas segiempat
System.out.print("masukkan sisi : ");
double value1 = in.nextDouble();



Aritmatika.hitungLuasSegiempat(nil1);

//memanggil method static keliling segiempat
System.out.print("masukkan sisi : ");
nil1 = in.nextDouble();


Aritmatika.hitungKelilingSegiempat(nil1);


//memanggil method static luas lingkaran
System.out.print("masukkan jari-jari : ");
value1 = in.nextDouble();



Aritmatika.hitungLuasLingkaran(nil1);

//memanggil method static keliling lingkaran
System.out.print("masukkan jari-jari : ");
nil1 = in.nextDouble();


Aritmatika.hitungKelilingLingkaran(nil1);



}
}





