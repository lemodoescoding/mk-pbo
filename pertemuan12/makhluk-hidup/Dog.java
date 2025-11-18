/**
 * Write a description of class Dog here.
 *
 * @author Ahmad Satrio Arrohman
 * @version 20251118 - 0.0.1
 */
public class Dog extends Animal
{
    public Dog(String name) {
        super(name);
    }
    
    @Override
    public void grow() {
        System.out.println(getName() + " is growing by eating and exercising.");
    }
    
    @Override
    public void move() {
        System.out.println(getName() + " is running on four legs.");
    }
}