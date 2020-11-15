package pboif2.pkg10119079.latihan49.biayaemaskawin;

/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan A
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI:
 *
 */
public class Emas {
    private double beratTotal;
    private final double hargaPerGram = 570000;
    
    public double getBeratEmas(){
        return beratTotal;
    }
    
    public void setBeratEmas(double beratTotal){
        this.beratTotal=beratTotal;
    }
    
    public double hargaEmas(double beratTotal){
        double hargaEmas;
        
        hargaEmas = beratTotal * hargaPerGram;
        return hargaEmas;
    }
    
}
