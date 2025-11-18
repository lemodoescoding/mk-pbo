
/**
 * Write a description of class LivingBeing here.
 *
 * @author Ahmad Satrio Arrohman
 * @version 20251118 - 0.0.1
 */
public abstract class LivingBeing
{
    private String name;
    
    public LivingBeing(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void breathe() {
        System.out.println(name + " is breathing.");
    }
    
    public abstract void grow();
}
