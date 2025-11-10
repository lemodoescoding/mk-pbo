/**
 * Write a description of class SepedaMotor here.
 *
 * @author Ahmad Satrio Arrohman - 20251110
 * @version 0.0.1
 */
public class SepedaMotor extends Kendaraan
{
    private int jmlBan;
    private String jenisBensin;
    
    public SepedaMotor(String merk, String model, String thnProduksi, int jmlBan, String jenisBensin)
    {
        super(merk, model, thnProduksi);
        this.jmlBan = jmlBan;
        this.jenisBensin = jenisBensin;
    }
    
    @Override
    public void showDetail(){
        System.out.println("Sepeda Motor ");
        super.showDetail();
        System.out.println("Jumlah Ban: " + jmlBan + ", Jenis Bensin: " + jenisBensin);
    }
}