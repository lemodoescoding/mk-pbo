
/**
 * Write a description of class ClockDisplay here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    // instance variables - replace the example below with your own
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private NumberDisplay seconds;
    private String displayString;

    /**
     * Constructor for objects of class ClockDisplay
     */
    
    public ClockDisplay(){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        
        updateDisplay();
    }
    
    public ClockDisplay(int hour, int minute, int second){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        
        setTime(hour, minute, second);
    }
    
    public void timeTick(){
        seconds.increment();
        
        if(seconds.getValue() == 0){
            minutes.increment();
        }
        
        if(minutes.getValue() == 0){
            hours.increment();
        }
        
        updateDisplay();
    }
    
    public void setTime(int hour, int minute, int second){
        hours.setValue(hour);
        minutes.setValue(minute);
        seconds.setValue(second);
        updateDisplay();
    }
    
    public String getTime(){
        return displayString;
    }
    
    private void updateDisplay(){
        displayString = hours.getDisplayValue() + ":" 
        + minutes.getDisplayValue() + ":" +  seconds.getDisplayValue();
    }
}
