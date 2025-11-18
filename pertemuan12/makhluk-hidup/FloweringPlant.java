/**
 * Write a description of class FloweringPlant here.
 *
 * @author Ahmad Satrio Arrohman
 * @version 20251118 - 0.0.1
 */
public class FloweringPlant extends Plant
{
    public FloweringPlant(String name) {
        super(name);
    }
    
    @Override
    public void grow() {
        System.out.println(getName() + " is growing by producing flowers.");
    }
    
    @Override
    public void photosynthesize() {
        System.out.println(getName() + " is producing food through photosynthesis.");
    }
}