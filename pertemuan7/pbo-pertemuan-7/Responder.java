import java.util.Random;
import java.util.Map;
import java.util.HashMap;

public class Responder {
    private Map<String, String> responses;  
    private Random random;  
    
    public Responder(){
        responses = new HashMap<>();  
        random = new Random();  
        // beberapa pasangan kata kunci → respons  
        responses.put("mengambil", "Apakah Anda mendapat error saat mencoba mengambil kelas? Coba refresh ulang web page nya");
        responses.put("help", "Apa yang bisa saya bantu?");  
        responses.put("drop", "Apakah ada masalah ketika ingin drop kelas? Coba jelaskan lebih lanjut");  
        responses.put("lambat", "Coba cek ketersediaan jaringan anda, mungkin terkendala sehingga menyebabkan server merespon dengan lambat");
        responses.put("error", "Apakah aplikasi memberikan anda pesan kesalahan?, coba untuk login ulang");
        responses.put("penyetujuan", "Apakah terjadi kendala saat mencoba untuk menyetujui FRS?");
        responses.put("login", "Apakah pesan kesalahan yang tampil di halaman aplikasi? beritahu kami lebih lanjut");
        responses.put("ambil", "Apa pesan kesalahan yang ada saat mencoba mengambil suatu MK? berithau kami lebih lanjut");
        responses.put("kuota", "Apakah terjadi galat saat mengambil suatu kelas? coba cek ketersediaan kuota di kelas tersebut");
        responses.put("habis", "Apakah kuota kelas yang tersedia sudah penuh? Coba beritahu pihak terkait untuk melakukan prosedur extend");
    }
    
    public String generateResponse(String userInput) {
        String[] words = userInput.toLowerCase().split("\\s+");
        
        for (String w : words) {
            if (responses.containsKey(w)) {
                return responses.get(w);
            }
        }  
        // kalau tidak ada kata kunci cocok, jawaban acak generik  
        String[] generic = {  
            "Coba jelaskan lebih rinci.",  
            "Saya belum mengerti, bisa ulangi?",  
            "Bisakah Anda memberi detail lebih lanjut?"
        };
        
        return generic[random.nextInt(generic.length)];
    }
}