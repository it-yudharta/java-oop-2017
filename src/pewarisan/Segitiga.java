package pewarisan;

public class Segitiga extends Bentuk {
    
    public Segitiga(double alas, double tinggi) {
        super(alas, tinggi);
    }
    
    public double getLuas() {
        return ( getPanjang() * getLebar() ) / 2;
    }
    
    public double getKeliling() {
        return getLebar() * 3;
    } 
}
