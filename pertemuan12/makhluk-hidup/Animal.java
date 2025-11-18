/**
 * Write a description of class Animal here.
 *
 * @author Ahmad Satrio Arrohman
 * @version 20251118 - 0.0.1
 */
public abstract class Animal extends LivingBeing
{
    public Animal(String name) {
        super(name);
    }
    
    public abstract void move();
}
