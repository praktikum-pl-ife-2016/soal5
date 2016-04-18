/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmatika1;

/**
 *
 * @author peitrae
 */
import java.util.Scanner;

public class MainAritmatika1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("masukkan nilai 1 : ");
        int nil1 = in.nextInt();
        System.out.print("masukkan nilai 2 : ");
        int nil2 = in.nextInt();
//memanggil method static
        Aritmatika1.hitungPengurangan(nil1, nil2);
        System.out.print("masukkan nilai 1 : ");
        nil1 = in.nextInt();
        System.out.print("masukkan nilai 2 : ");
        nil2 = in.nextInt();
//memanggil method static
        Aritmatika1.hitungPerkalian(nil1, nil2);
        System.out.print("masukkan nilai 1 : ");
        int value1 = in.nextInt();
        System.out.print("masukkan nilai 2 : ");
        int value2 = in.nextInt();
//memanggil method NONstatic harus melalui objek
        Aritmatika1 a = new Aritmatika1();
        a.hitungPenjumlahan(value1, value2);
    }
}
