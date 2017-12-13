package abstraksi;

public class Segitiga extends Bentuk {
    
    public Segitiga(double alas, double tinggi) {
        super(alas, tinggi);
    }
    
    @Override
    public double getLuas() {        
        return ( getPanjang() * getLebar() ) / 2;
    }
    
    @Override
    public double getKeliling() {
        return getLebar() * 3;
    } 
}
