/**
 * Write a description of class Human here.
 *
 * @author Ahmad Satrio Arrohman
 * @version 20251118 - 0.0.1
 */
public abstract class Human extends LivingBeing
{
    public Human(String name) {
        super(name);
    }
    
    public abstract void speak();
}
