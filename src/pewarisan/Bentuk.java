package pewarisan;

public class Bentuk {
    private double panjang;
    private double lebar;
    
    public Bentuk(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    protected double getPanjang() {
        return panjang;
    }

    protected double getLebar() {
        return lebar;
    }
    
    public double getLuas() {
        return this.panjang * this.lebar;
    }
    
    public double getKeliling() {
        return (this.panjang + this.lebar) * 2;
    }
}
