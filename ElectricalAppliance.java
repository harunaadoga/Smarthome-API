
/**
Adoga Haruna. SRN: 13000236
 */

/** ElectricalAppliance abstract class */
public abstract class ElectricalAppliance
{
    /** data fields of the ElectricalAppliance class */
    final private int macAddress; //to make it immutable
    private String name;
    private int rating;
    private String location;
    private boolean onOrOff;

    /**
     * ElectricalAppliance Constructor
     *
     * @param name A parameter
     * @param macAddress A parameter
     * @param rating A parameter
     * @param location A parameter
     * @param status A parameter
     */
    public ElectricalAppliance(String name, int macAddress, int rating, String location, boolean status)
    {
        this.name = name;
        this.rating = rating;
        this.macAddress = macAddress;
        this.location= location;
        onOrOff = status;
       
    
    }
    
   
    /**
     * Method getMacAddress
     *
     * @return The return value
     */
    public int getMacAddress () 
    {
        return macAddress;
    }
    
    /**
     * Method setLocation
     *
     * @param l A parameter
     */
    public void setLocation (String l)
    {
    l = location;
    }
    
   
    /**
     * Method getLocation
     *
     * @return The return value
     */
    public String getLocation()
    {
    return location;
    }
    
    
    /**
     * Method getName
     *
     * @return The return value
     */
    public String getName() 
    {
        return name;
    }
    
    
    /**
     * Method setName
     *
     * @param name A parameter
     */
    public void setName (String name) 
    {
    this.name = name;
    }
    
   
    /**
     * Method setStatus
     *
     * @param status A parameter
     */
    public void setStatus (boolean status)
    
    {
        this.onOrOff = status;
    }
    
   
    
    /**
     * Method getStatus
     *
     * @return The return value
     */
    public boolean getStatus ()
    
    {
        return onOrOff;
    }
    
    
    

    /**
     * Method toString
     *
     * @return The return value
     */
    public String toString() 
    {
       String stat;
       
       if (onOrOff == true)
       {
        stat = "On";
        }
        else 
        {
        stat = "Off";
        }
        
    return "the name of the appliance is :" + name + ", the rating is: " + rating +
    ", Mac address: " + macAddress + " , the location is: " + location + ", the status is " + stat;
    }
}
