package abstraksi;

public class Kotak extends Bentuk {
    
    public Kotak(double sisi) {
        super(sisi, sisi);
    }

    @Override
    public double getLuas() {
        return getLebar() * getLebar();
    }

    @Override
    public double getKeliling() {
        return 4 * getPanjang();
    }

}
