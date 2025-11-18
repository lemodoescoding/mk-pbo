/**
 * Write a description of class Bird here.
 *
 * @author Ahmad Satrio Arrohman
 * @version 20251118 - 0.0.1
 */
public class Bird extends Animal
{
    public Bird(String name) {
        super(name);
    }
    
    @Override
    public void grow() {
        System.out.println(getName() + " is growing by eating seeds.");
    }
    
    @Override
    public void move() {
        System.out.println(getName() + " is flying in the sky.");
    }
}