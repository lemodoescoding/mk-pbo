/**
 * Write a description of class Main here.
 *
 * @author Ahmad Satrio Arrohman
 * @version 20251118 - 0.0.1
 */
public class Main
{
    public static void main(String[] args) {
        Human programmer = new Programmer("Alice");
        Human doctor = new Doctor("Bob");
        
        programmer.breathe();
        programmer.grow();
        programmer.speak();
        
        doctor.breathe();
        doctor.grow();
        doctor.speak();
        
        Animal dog = new Dog("Buddy");
        Animal bird = new Bird("Tweety");
        
        dog.breathe();
        dog.grow();
        dog.move();
        
        bird.breathe();
        bird.grow();
        bird.move();
        
        Plant rose = new FloweringPlant("Rose");
        Plant fern = new NonFloweringPlant("Fern");
        
        rose.breathe();
        rose.grow();
        rose.photosynthesize();
        
        fern.breathe();
        fern.grow();
        fern.photosynthesize();
    }
}