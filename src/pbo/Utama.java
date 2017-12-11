package pbo;

public class Utama {
    public static void main(String[] args) {
        // NamaClass namaVariabel = new NamaClass();
//        PersegiPanjang meja = new PersegiPanjang();
//        meja.panjang = 5;
//        meja.lebar = 3;
        
//        int luas = meja.panjang * meja.lebar;
        
//        System.out.println(luas);
//        meja.setData(5, 3);

        PersegiPanjang meja = new PersegiPanjang(6, 4);
//        meja.panjang = 6; // error karena hak akses private
//        meja.setData(5, 3);
        int luas = meja.getLuas();
        
        System.out.println(luas);
        
        PersegiPanjang karpet = new PersegiPanjang();
        System.out.println(karpet.getLuas());
        System.out.println(karpet.getLuas(5));
        
        String hasil = karpet.getLuas("Luas: ");
        System.out.println(hasil);
        
        final double PI = 3.14;
//        PI = 6;
    }
    
}
