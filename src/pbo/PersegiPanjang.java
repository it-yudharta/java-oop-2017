package pbo;

public class PersegiPanjang {
    private int panjang; // Field
    private int lebar;

    public PersegiPanjang() {
        this.panjang = 10;
        this.lebar = 8;
    }
    
    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    private void setData(int panjang, int lbr) {
        this.panjang = panjang;
        lebar = lbr;
    }
    
    public int getLuas() {
        return this.panjang * this.lebar;
    }
    
    public int getLuas(int skala) {
        return this.panjang * this.lebar * skala;
    }

    public String getLuas(String label) {
//        return label + (this.panjang * this.lebar);
        return label + getLuas();
    }
}
