import java.util.ArrayList;
import java.util.HashMap;

/**
 * Write a description of class Main here.
 *
 * @author Ahmad Satrio Arrohman - 20251110
 * @version 0.0.1
 */
public class Main
{
    private ArrayList<Kendaraan> listKendaraan = new ArrayList<>();
    private HashMap<Kendaraan, String> penyewa = new HashMap<>();
    private InputHandler inputhandl = new InputHandler();
    
    public Main()
    {
        
    }
    
    public static void main(String args[]) {
        Main app = new Main();
        
        app.dummySeeder();
        app.run();
    }
    
    public void run() {
        
        while(true) {
            showGreeting();
            
            int input = Integer.parseInt(inputhandl.readInput());
            
            if(input == 1){
                showKendaraan();
            } else if(input == 2) {
                showPenyewa();
            } else if(input == 3) {
                penyewaanWrapper();
            } else {
                return;
            }
        }
    }
    
    public void dummySeeder() {
        addMobil("Honda", "Civic Type-R", "2020", 4);
        addTruk("Isuzu", "Dump Truck", "2017", 6, "Biasa");
        addSepedaMotor("Yamaha", "Vixion", "2013", 2, "Pertamax");
        addMobil("Hyundai", "Palisade" , "2021", 4);
    }
    
    public void addMobil(String merk, String model, String thnProduksi, int jumlahPintu) {
        Mobil mobil = new Mobil(merk, model, thnProduksi, jumlahPintu);
        listKendaraan.add(mobil);
    }
    
    public void addTruk(String merk, String model, String thnProduksi, int jumlahBan, String tipeTruk) {
        Truk truk = new Truk(merk, model, thnProduksi, jumlahBan, tipeTruk);
        listKendaraan.add(truk);
    }
    
    public void addSepedaMotor(String merk, String model, String thnProduksi, int jumlahBan, String jenisBensin) {
        SepedaMotor spdmotor = new SepedaMotor(merk, model, thnProduksi, jumlahBan, jenisBensin);
        listKendaraan.add(spdmotor);
    }
    
    public void addPenyewa(int indexKendaraan, String namaPenyewa) {
        if(indexKendaraan >= 0 && indexKendaraan < listKendaraan.size()) {
            Kendaraan k = listKendaraan.get(indexKendaraan);
            
            if(!penyewa.containsKey(k)){
                penyewa.put(k, namaPenyewa);
                System.out.println("Kendaraan berhasil disewa!");
            } else {
                System.out.println("GALAT: Kendaraan sudah disewa!");
            }
        } else {
            System.out.println("GALAT: index kendaraan tidak valid!");
        }
    }
    
    public void showPenyewa() {
        System.out.println("==== Kendaraan yang disewa =====");
        for(Kendaraan k : penyewa.keySet()) {
            k.showDetail();
            
            System.out.println("Disewa oleh: " + penyewa.get(k));
            System.out.println(" ------- ");
        }
    }
    
    public void showKendaraan() {
        int i = 1;
        System.out.println("==== Kendaraan yang ada =====");
        for(Kendaraan k : listKendaraan) {
            if(!penyewa.containsKey(k)){
                System.out.println("No. " + i);
                k.showDetail();
                System.out.println(" ------- ");
                
                
            }
            i += 1;
        }
    }
    
    public void showGreeting() {
        System.out.println("Selamat datang di aplikasi penyewaan kendaraan!");
        System.out.println("Pilih salah satu: ");
        System.out.println("1. Tampilkan kendaraan yang ada");
        System.out.println("2. Tampilkan seluruh penyewa");
        System.out.println("3. Sewa Kendaraan");
        System.out.println("4. Keluar");
    }
    
    public void penyewaanWrapper() {
        System.out.println("Masukkan Nama Anda");
        String nama = inputhandl.readInput();
        
        showKendaraan();
        
        System.out.println("\nMasukkan index (nomor) kendaraan yang ingin anda sewa: ");
        int indexKendaraan = Integer.parseInt(inputhandl.readInput());
        
        addPenyewa(indexKendaraan - 1, nama);
    }
}