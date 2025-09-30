import java.util.ArrayList;
import java.util.Scanner;

public class MainSistem
{
    private ArrayList<MataKuliah> daftarMK = new ArrayList<MataKuliah>();
    private ArrayList<Dosen> daftarDosen = new ArrayList<Dosen>();
    private ArrayList<Mahasiswa> daftarMhs = new ArrayList<Mahasiswa>();
    private Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args){
        MainSistem app = new MainSistem();
        
        app.dummySeeder();   // isi data awal
        app.run();  
    }
    
    public void run() {
        int pilihan;
        do {
            System.out.println("\n=== SISTEM PENGAMBILAN MATA KULIAH ===");
            System.out.println("1. Daftar Mahasiswa");
            System.out.println("2. Daftar Mata Kuliah");
            System.out.println("3. Daftar Dosen");
            System.out.println("4. Mahasiswa ambil MK");
            System.out.println("5. Mahasiswa drop MK");
            System.out.println("6. Tampilkan KRS Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1 -> tampilkanMahasiswa();
                case 2 -> tampilkanMataKuliah();
                case 3 -> tampilkanDosen();
                case 4 -> ambilMKInteraktif();
                case 5 -> dropMKInteraktif();
                case 6 -> tampilkanKRSInteraktif();
                case 0 -> System.out.println("Keluar...");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }
    
    private void dummySeeder() {
        Dosen d1 = new Dosen("D001", "Dr. Budi, S.Kom., M.Sc.");
        Dosen d2 = new Dosen("D002", "Prof. Siti, S.T., M.T., Ph.D.");
        Dosen d3 = new Dosen("D003", "Fajar, S.Kom., M.Kom.");
        Dosen d4 = new Dosen("D004", "Sandhika, S.Kom., M.T.I.");
        Dosen d5 = new Dosen("D005", "Bagus, S.Kom., M.Si., Ph.D.");
        daftarDosen.add(d1);
        daftarDosen.add(d2);
        daftarDosen.add(d3);
        daftarDosen.add(d4);
        daftarDosen.add(d5);

        MataKuliah mk1 = new MataKuliah("EF234301", "Pemrograman Berbasis Objek", 3, 60);
        MataKuliah mk2 = new MataKuliah("EF234101", "Dasar Pemrograman", 4, 70);
        MataKuliah mk3 = new MataKuliah("EF234303", "Pemrograman Web", 3, 50);
        MataKuliah mk4 = new MataKuliah("EF234305", "Jaringan Komputer", 4, 80);
        MataKuliah mk5 = new MataKuliah("EF234202", "Sistem Operasi", 4, 75);
        MataKuliah mk6 = new MataKuliah("EF234204", "Komputasi Numerik", 3, 50);
        mk1.setDosenPengampuMK(d1);
        mk2.setDosenPengampuMK(d2);
        mk3.setDosenPengampuMK(d3);
        mk4.setDosenPengampuMK(d5);
        mk5.setDosenPengampuMK(d4);
        mk6.setDosenPengampuMK(d2);
        daftarMK.add(mk1);
        daftarMK.add(mk2);
        daftarMK.add(mk3);
        daftarMK.add(mk4);
        daftarMK.add(mk5);
        daftarMK.add(mk6);

        Mahasiswa m1 = new Mahasiswa("M001", "Andi");
        Mahasiswa m2 = new Mahasiswa("M002", "Budi");
        daftarMhs.add(m1);
        daftarMhs.add(m2);
    }
    
    private void tampilkanMahasiswa() {
        int i = 1;
        System.out.println("\nDaftar Mahasiswa:");
        for (Mahasiswa m : daftarMhs) {
            System.out.println(i++ + " - " + m.toString());
        }
    }
    
    private void tampilkanDosen() {
        int i = 1;
        System.out.println("\nDaftar Dosen:");
        for (Dosen d : daftarDosen) {
            System.out.println(i++ + " - " + d.toString());
        }
    }
    
    private void tampilkanMataKuliah() {
        int i = 1;
        System.out.println("\nDaftar Mata Kuliah:");
        for (MataKuliah mk : daftarMK) {
            System.out.println(i++ + " - " + mk.toString());
        }
    }

    private void ambilMKInteraktif() {
        tampilkanMahasiswa();
        System.out.print("Pilih Mahasiswa: ");
        int idxMhs = sc.nextInt() - 1;
        sc.nextLine();

        if (idxMhs < 0 || idxMhs >= daftarMhs.size()) {
            System.out.println("Mahasiswa tidak valid!");
            return;
        }

        tampilkanMataKuliah();
        System.out.print("Pilih Mata Kuliah: ");
        int idxMK = sc.nextInt() - 1;
        sc.nextLine();

        if (idxMK < 0 || idxMK >= daftarMK.size()) {
            System.out.println("Mata kuliah tidak valid!");
            return;
        }

        Mahasiswa m = daftarMhs.get(idxMhs);
        MataKuliah mk = daftarMK.get(idxMK);

        if (m.ambilMK(mk)) {
            System.out.println(m.getNama() + " berhasil ambil " + mk.getNamaMK());
        } else {
            System.out.println("Gagal ambil MK. Mungkin sudah penuh atau sudah diambil.");
        }
    }
    
    private void dropMKInteraktif() {
        tampilkanMahasiswa();
        System.out.print("Pilih Mahasiswa: ");
        int idxMhs = sc.nextInt() - 1;
        sc.nextLine();

        if (idxMhs < 0 || idxMhs >= daftarMhs.size()) {
            System.out.println("Mahasiswa tidak valid!");
            return;
        }

        Mahasiswa m = daftarMhs.get(idxMhs);
        ArrayList<MataKuliah> list = m.getAllMK();

        if (list.isEmpty()) {
            System.out.println("Mahasiswa ini belum ambil MK.");
            return;
        }

        System.out.println("MK yang diambil:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i).getNamaMK());
        }
        System.out.print("Pilih MK untuk drop: ");
        int idxDrop = sc.nextInt() - 1;
        sc.nextLine();

        if (idxDrop < 0 || idxDrop >= list.size()) {
            System.out.println("Pilihan tidak valid!");
            return;
        }

        MataKuliah mk = list.get(idxDrop);
        if (m.dropMK(mk)) {
            System.out.println(m.getNama() + " berhasil drop " + mk.getNamaMK());
        }
    }

    private void tampilkanKRSInteraktif() {
        tampilkanMahasiswa();
        System.out.print("Pilih Mahasiswa: ");
        int idxMhs = sc.nextInt() - 1;
        sc.nextLine();

        if (idxMhs < 0 || idxMhs >= daftarMhs.size()) {
            System.out.println("Mahasiswa tidak valid!");
            return;
        }

        Mahasiswa m = daftarMhs.get(idxMhs);
        System.out.println("KRS " + m.getNama() + ":");
        for (MataKuliah mk : m.getAllMK()) {
            System.out.println(" - " + mk.getKodeMK() + " " + mk.getNamaMK());
        }
    }
}
