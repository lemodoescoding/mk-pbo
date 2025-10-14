public class StockHandler
{
    private int snackA;
    private int snackB;
    private int snackC;
    private int drinkA;

    public StockHandler()
    {
        snackA = 10;
        snackB = 11;
        snackC = 5;
        drinkA = 1;
    }

    public int getStock(String menu){
        switch (menu) {
            case "Snack A":
                return snackA;
            case "Snack B":
                return snackB;
            case "Snack C":
                return snackC;
            case "Drink A":
                return drinkA;
            default:
                return -1;
        }
    }

    public void decreaseStock(String menu){
        switch (menu) {
            case "Snack A":
                snackA -= 1;
                break;
            case "Snack B":
                snackB -= 1;
                break;
            case "Snack C":
                snackC -= 1;
            case "Drink A":
                drinkA -= 1;
                break;
        }
    }

    public int isStockEmpty(String menu){
        switch (menu) {
            case "Snack A":
                return snackA <= 0 ? 1 : 0;
            case "Snack B":
                return snackB <= 0 ? 1 : 0;
            case "Snack C":
                return snackC <= 0 ? 1 : 0;
            case "Drink A":
                return drinkA <= 0 ? 1 : 0;
            default:
                return 1;
        }
    }

    public void notifyStockEmpty(){
        if(snackA == 0){
            System.out.println(" --- Snack A is out of stock --- ");
        }

        if(snackB == 0){
            System.out.println(" --- Snack B is out of stock --- ");
        }

        if(snackC == 0){
            System.out.println(" --- Snack C is out of stock --- ");
        }

        if(drinkA == 0){
            System.out.println(" --- Drink A is out of stock --- ");
        }
    }
}