/**
 * Write a description of class Kendaraan here.
 *
 * @author Ahmad Satrio Arrohman - 20251110
 * @version 0.0.1
 */
public class Kendaraan
{
    private String merk;
    private String model;
    private String thnProduksi;

    public Kendaraan(String merk, String model, String thnProduksi)
    {
        this.merk = merk;
        this.model = model;
        this.thnProduksi = thnProduksi;
    }
    
    public void showDetail(){
        System.out.println("Merk: " + merk);
        System.out.println("Model: " + model);
        System.out.println("Tahun Prod.: " + thnProduksi);
    }
}