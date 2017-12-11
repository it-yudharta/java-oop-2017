package dasar;

import pbo.PersegiPanjang;

public class Tutorial {
    static int jumlah = 4;
    
    public static void main(String[] args) {
        int nomer = 5;
        int nomer2;
        
        nomer2 = 7;
        
        int hasil = total(nomer, nomer2);
//        System.out.println(hasil);
        int nilai1 = 60, nilai2 = 70 , nilai3 = 80;

//      70  80  90        
        int[] nilai = {70, 80, 90};
        
        nilai[1] = 50;
        
//        System.out.println(nilai[2]);
        
//      1   2   3
//      4   5   6

        int[][] matrix = {{1,2,3},{4,5,6}};
        
        matrix[1][2] = 9;
        
//        System.out.println(matrix[1][1]);
        nomer += 2; // 7
//        System.out.println(nomer);
        
        nomer++; // 8
//        System.out.println(nomer);
        
        if (false) {
            System.out.println("kecil");
        }
        
        String hasil1;
        
//        if (4 < 5) {
//            hasil1 = "kurang";            
//        } else {
//            hasil1 = "lebih";
//        }
        hasil1 = (4 < 5) ? "kurang" : "lebih";
        
//        System.out.println(hasil1);
        
        String bulan = getBulan(11);
//        System.out.println(bulan);

        for (int i = 3; i <= 10; i++) {
//            System.out.println(i);
        }
        
        int cek = 0;
        while (cek > 0) {
//            System.out.println("while: " + cek);
            cek -= 7;
        }
        
        boolean valid = true;
        
        if (!valid) {
            return;
        }
        
        cek = 56;
        do {
            if (cek == 28) {
                break;
            }
            
            System.out.println(cek);
            cek -= 7;            
        } while (cek > 0);
    }
    
    public static int total(int nilai1, int nilai2) {
        return jumlah + nilai1 + nilai2;
    }

    private static String getBulan(int nomer) {
        String hasil;
        switch (nomer) {
            case 1: hasil = "januari"; break;
            case 2: hasil = "februari"; break;
            case 3: hasil = "maret"; break;
            case 4: hasil = "april"; break;
            case 5: hasil = "mei"; break;
            case 6: hasil = "juni"; break;
            case 7: hasil = "juli"; break;
            case 8: hasil = "agustus"; break;
            case 9: hasil = "september"; break;
            case 10: hasil = "oktober"; break;
            case 11: hasil = "november"; break; 
            case 12: hasil = "desember"; break;
            default : hasil = "salah";
        }
        
        return hasil;
    }
    
}
