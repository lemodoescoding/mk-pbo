/**
 * Write a description of class Truk here.
 *
 * @author Ahmad Satrio Arrohman - 20251110
 * @version 0.0.1
 */
public class Truk extends Kendaraan
{
    private String tipeTruk;
    private int jumlahBan;

    public Truk(String merk, String model, String thnProduksi, int jumlahBan, String tipeTruk)
    {
        super(merk, model, thnProduksi);
        this.tipeTruk = tipeTruk;
        this.jumlahBan = jumlahBan;
    }
    
    @Override
    public void showDetail(){
        System.out.println("Truk ");
        super.showDetail();
        System.out.println("Jumlah Ban: " + jumlahBan + " , Tipe Truk: " + tipeTruk);
    }
}