import java.util.ArrayList;

public class Logger
{
    private ArrayList<String> log;
    public Logger()
    {
        log = new ArrayList<String>();
    }

    public void addLog(String namaPilihan, int harga){
        log.add(namaPilihan + " - " + harga);
    }

    public void printAllLog(){
        int i = 0;
        for(i = 0; i < log.size(); i++){
            System.out.println(log.get(i).toString());
        }
    }
}