import java.util.Scanner;

public class InputHandler
{
    private Scanner reader;
    
    public InputHandler()
    {
        reader = new Scanner(System.in);
    }
    
    public String readInput()
    {
        System.out.print("> ");
        String input = reader.nextLine();
        
        return input;
    }
}