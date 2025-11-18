/**
 * Write a description of class Plant here.
 *
 * @author Ahmad Satrio Arrohman
 * @version 20251118 - 0.0.1
 */
public abstract class Plant extends LivingBeing
{
    public Plant(String name) {
        super(name);
    }
    
    public abstract void photosynthesize();
}
