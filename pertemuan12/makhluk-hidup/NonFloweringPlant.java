/**
 * Write a description of class NonFloweringPlant here.
 *
 * @author Ahmad Satrio Arrohman
 * @version 20251118 - 0.0.1
 */
public class NonFloweringPlant extends Plant
{
    public NonFloweringPlant(String name) {
        super(name);
    }
    
    @Override
    public void grow() {
        System.out.println(getName() + " is growing without producing flowers.");
    }
    
    @Override
    public void photosynthesize() {
        System.out.println(getName() + " is photosynthesizing without flowers.");
    }
}