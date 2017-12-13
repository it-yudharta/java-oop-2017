package abstraksi;

import java.util.Scanner;

public class Utama {
    public static void main(String[] args) {        
        Bentuk b;
        
        System.out.println("Masukkan jenis bentuk "
                + "[1] Persegi Panjang"
                + "[2] Segitiga"
                + "[3] Kotak, default[1]: ");        
        
        Scanner sc = new Scanner(System.in);
        int jenis = sc.nextInt();
        
        if (jenis == 2) {
            b = new Segitiga(9, 3);
        } else 
        if (jenis == 3) {
            b = new Kotak(6.56757);        
        } else {
            b = new PersegiPanjang(4, 6);
        }
        
        System.out.println("jumlah object: " + b.jumlahObjek);
        
        System.out.println("Luas: " + b.getLuas());
        System.out.println("Keliling: " + b.getKeliling());
        
        b = new Kotak(4.56);
        b = new Kotak(4.56);
        b = new Kotak(4.56);
        System.out.println("jumlah object: " + b.jumlahObjek);
    }    
}
