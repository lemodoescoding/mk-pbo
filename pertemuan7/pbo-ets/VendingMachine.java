public class VendingMachine
{
    private MenuDisplay diplayMenu;
    private InputHandler input;
    private Transaction transac;
    private StockHandler stackhandl;
    private Logger logger;

    public static void main(String[] args){
        VendingMachine vM = new VendingMachine();
        vM.run();
    }

    public VendingMachine()
    {
        diplayMenu = new MenuDisplay();
        input = new InputHandler();
        transac = new Transaction();
        stackhandl = new StockHandler();
        logger = new Logger();
    }

    public void run(){
        printWelcome();

        int userInput = 0;
        do {
            diplayMenu.displayAllMenu();
            userInput = Integer.parseInt(input.readInput());

            if(userInput > 4){
                return;
            }
        
            String menuChoice = diplayMenu.getMenuFromIndex(userInput);

            System.out.println(menuChoice);

            int checkStock = stackhandl.isStockEmpty(menuChoice);

            if(checkStock == 1){
                System.out.println("Mohon maaf menu ini sedang kosong");
                continue;
            }

            printTotalPayment(menuChoice);
        } while(true);
    }
    
    private void printWelcome(){
        System.out.println("Selamat Datang di Coffe Vending Machine!");
        System.out.println();
        System.out.println("Silahkan pilih jenis kopi dan ukuran yang anda inginkan");
    }

    private void printTotalPayment(String pilihanMenu){
        int price = transac.showFinalPrice(pilihanMenu);

        System.out.println("Harga total adalah: " + price);
        System.out.println("Silahkan membayar dengan uang anda");

        int userPayment = Integer.parseInt(input.readInput());

        int success = transac.processTransaction(pilihanMenu, userPayment);
        if(success == 1){
            logger.addLog(pilihanMenu, price);
        }
    }

    public void getAllLog(){
        logger.printAllLog();
    }
}