import java.util.ArrayList;

public class MataKuliah
{
    // instance variables - replace the example below with your own
    private String kode;
    private String nama;
    private Dosen pengampu;
    private int kapasitas;
    private ArrayList<Mahasiswa> pesertaKelas;
    private int sks;

    public MataKuliah(String kode, String nama) {
        this(kode, nama, 3, 30); // default 3 sks dan 30 kapasitas
    }
    
    public MataKuliah(String kode, String nama, int sks, int kapasitas)
    {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.kapasitas = Math.max(1, kapasitas);
        this.pesertaKelas = new ArrayList<Mahasiswa>();
        this.pengampu = null;
    }
    
    public void setDosenPengampuMK(Dosen d){
        this.pengampu = d;
    }
    
    public String getKodeMK() { return kode; }
    public String getNamaMK() { return nama; }
    public Dosen getDosenMK() { return pengampu; }
    public int getKapasitasMK() { return kapasitas; }
    
    public boolean isFull() { return pesertaKelas.size() >= kapasitas; }
    
    public boolean addPeserta(Mahasiswa m){
        if(m == null || isFull() || pesertaKelas.contains(m)) return false;
        pesertaKelas.add(m);
        
        return true;
    }
    
    public boolean removePeserta(Mahasiswa m) {
        return pesertaKelas.remove(m);
    }
    
    public ArrayList<Mahasiswa> getAllPeserta() { return pesertaKelas; }
    
    @Override
    public String toString() {
        return "MataKuliah[" + nama + " - " + kode + " - " + sks + " sks - " + " (" + pesertaKelas.size() + "/" + kapasitas + " peserta)"
                    + " | Dosen: " + (pengampu != null ? pengampu.getNama() : "Belum ada") + " ]";
    }
}
