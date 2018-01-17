
/**
Adoga Haruna. SRN: 13000236
 */
public class TimeableLight extends Light implements Timeable
{
    private Time currentTime;
    private Time startTime;
    private Time stopTime;
    
    
    public TimeableLight(String name, String type, int macAddress, int rating, String location, Time currentTime, boolean status )
    {
    super(name, type, macAddress, rating, location, status);
    
    startTime = null;
    stopTime = null;
    this.currentTime = currentTime;
    
    }
    
    
    public void setCurrentTime (Time curr)
    {
    curr = currentTime;
    }
    
     public void setTimes(Time startTime, Time stopTime)
     {
        this.startTime = startTime;
        this.stopTime = stopTime;
        }
     
    /**
     * A method which allows the times to be unset (probably set to null)
     */
    
    public void unSetTimes()
    
    {
    startTime = null;
    stopTime = null;
    
    }
    /**
     * Get the start time of this object
     * @return the start time
     */
   
   public Time getStartTime()
   {
    return this.startTime;
    }
   /**
    *
    * @return the stop time
    */
   public Time getStopTime()
   
   {
    return this.stopTime;
    }
    
   public void turnOn()
    {
     if (startTime.equals(currentTime) && super.getStatus() == false)
     {
         super.setStatus(true);
        }
    }
        
   public void turnOff () 
       {
           if (stopTime.equals(currentTime) && super.getStatus() == true)
           {
               super.setStatus(false);     
            }
           
        }
        
         public String toString() 
    {
    return super.toString() + "the start time is : " + startTime + ", stop time is : " + stopTime +
    " current time is : " + currentTime;
    
    }
    
    
    }
    
    
    
    
    

