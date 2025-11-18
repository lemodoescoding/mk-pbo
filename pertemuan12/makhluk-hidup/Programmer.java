/**
 * Write a description of class Programmer here.
 *
 * @author Ahmad Satrio Arrohman
 * @version 20251118 - 0.0.1
 */
public class Programmer extends Human
{
    public Programmer(String name) {
        super(name);
    }
    
    @Override
    public void grow() {
        System.out.println(getName() + " is learning new programming languages to grow intellectually.");
    }
    
    @Override
    public void speak() {
        System.out.println(getName() + " is explaining coding concepts.");
    }
}