package abstraksi;

public class PersegiPanjang extends Bentuk{

    public PersegiPanjang(double panjang, double lebar) {
        super(panjang, lebar);        
    }

    @Override
    public double getLuas() {
        return getPanjang() * getLebar();
    }

    @Override
    public double getKeliling() {
        return 2 * (getPanjang() + getLebar());
    }
    
}
