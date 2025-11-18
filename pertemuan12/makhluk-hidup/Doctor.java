/**
 * Write a description of class Doctor here.
 *
 * @author Ahmad Satrio Arrohman
 * @version 20251118 - 0.0.1
 */
public class Doctor extends Human
{
    public Doctor(String name) {
        super(name);
    }
    
    @Override
    public void grow() {
        System.out.println(getName() + " is gaining experience through practice.");
    }
    
    @Override
    public void speak() {
        System.out.println(getName() + " is consulting with patients.");
    }
}