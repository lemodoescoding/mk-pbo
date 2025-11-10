import java.util.Scanner;

/**
 * Write a description of class InputHandler here.
 *
 * @author Ahmad Satrio Arrohman - 20251110
 * @version 0.0.1
 */
public class InputHandler
{
    private Scanner scanner;

    public InputHandler()
    {
        scanner = new Scanner(System.in);
    }
    
    public String readInput() {
        System.out.print("> ");
        return scanner.nextLine();
    }
}