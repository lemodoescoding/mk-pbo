import java.util.HashMap;

public class Transaction
{
    private HashMap<String, Integer> pilihanMenu = new HashMap<>();

    public Transaction()
    {
        pilihanMenu.put("Snack A", 7000);
        pilihanMenu.put("Snack B", 9000);
        pilihanMenu.put("Snack C", 11000);
        pilihanMenu.put("Drink A", 4000);
    }

    public int showFinalPrice(String pilihanMenuId){
        return pilihanMenu.get(pilihanMenuId);
    }

    public int processTransaction(String pilihanMenuId, int userPaymentTotal){
        if((userPaymentTotal - pilihanMenu.get(pilihanMenuId)) >= 0){
            System.out.println("Ambil Pesanan Anda dibawah");
            return 1;
        } else {
            System.out.println("Uang anda tidak cukup!");
            return 0;
        }
    }
}