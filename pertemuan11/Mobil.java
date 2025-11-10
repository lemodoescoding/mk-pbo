/**
 * Write a description of class Mobil here.
 *
 * @author Ahmad Satrio Arrohman - 20251110
 * @version 0.0.1
 */
public class Mobil extends Kendaraan
{
    private int jumlahPintu;

    
    public Mobil(String merk, String model, String thnProduksi, int jumlahPintu)
    {
        super(merk, model, thnProduksi);
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void showDetail() {
        System.out.println("Mobil ");
        super.showDetail();
        System.out.println("Jumlah Pintu Mobil: " + jumlahPintu);
    }
}