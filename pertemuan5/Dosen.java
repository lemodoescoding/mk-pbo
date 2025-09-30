import java.util.ArrayList;

public class Dosen
{
    private String nip;
    private String nama;
    private ArrayList<MataKuliah> mengajar;

    public Dosen(String nip, String nama)
    {
        this.nip = nip;
        this.nama = nama;
        this.mengajar = new ArrayList<MataKuliah>();
    }

    public String getNIP(){
        return this.nip;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public void assignMK(MataKuliah mk){
        if(!mengajar.contains(mk)){
            mengajar.add(mk);
        }
    }
    
    public ArrayList<MataKuliah> getAllAjar(){
        return mengajar;
    }
}
