import java.util.List;
/**
 * Write a description of class Rabbit here.
 *
 * @author Ahmad Satrio Arrohman
 * @version 20251118 - 0.0.1
 */
public class Rabbit extends Animal
{
    public Rabbit(Field field, Location location) {
        super(field, location);
    }
    
    @Override
    public void act(List<Animal> newAnimals) {
        if(isAlive()) {
            Location newLocation = getField().freeAdjacentLocation(getLocation());
            
            if(newLocation != null) {
                setLocation(newLocation);
            } else {
                setDead();
            }
        }
    }
}