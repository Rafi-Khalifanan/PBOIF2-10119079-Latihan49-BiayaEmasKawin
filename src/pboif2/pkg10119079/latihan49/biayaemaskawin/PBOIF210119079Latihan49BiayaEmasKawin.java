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
public class PBOIF210119079Latihan49BiayaEmasKawin {
    public static void main(String[] args) {
        Emas emas = new Emas();
        
        emas.setBeratEmas(15.7);
        System.out.println("====Mahar====");
        System.out.println("Berat Emas: " + emas.getBeratEmas()+ " gram");
        System.out.println("Harga per gram: Rp. 570.000 ");
        System.out.println("Total Harga :" +emas.hargaEmas(emas.getBeratEmas()));
    }
    
}
