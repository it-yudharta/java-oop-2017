package abstraksi;

public abstract class Bentuk {
    public static int jumlahObjek;
    
    private double panjang;
    private double lebar;
    
    public Bentuk(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        jumlahObjek ++;
    }

    protected double getPanjang() {
        return panjang;
    }

    protected double getLebar() {
        return lebar;
    }
    
    public abstract double getLuas();
    
    public abstract double getKeliling();
}
