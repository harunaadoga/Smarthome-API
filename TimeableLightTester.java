
public class TimeableLightTester
{
    public static void main (String [] args) {
        
        Time currentTime = new Time(25,12,2014,5,35);
        
        
     TimeableLight bluelight = new TimeableLight ("timed", "EnergySaving", 44, 70, "toilet", currentTime, false);
        
        System.out.println (bluelight);

        Time start = new Time ( 25, 12, 2014, 5, 31);
        Time stop = new Time (25, 12, 2014, 5, 36);
        bluelight.setTimes(start, stop);
        
       //set current time to be equal to start time to on the timeable light
        currentTime.setMinute (31);
        
        bluelight.turnOn();
        
        
        System.out.println(bluelight);
        
        
    
    
    }

}


