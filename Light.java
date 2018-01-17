/**
Adoga Haruna. SRN: 13000236
 */
public class Light extends ElectricalAppliance 
{
   
    public static final String LED = "LED";
    public static final String Halogen = "Halogen";
    public static final String EnergySaving = "EnergySaving";
    private String type;
    private int lifeInHours;
    boolean failureStatus;
    
    public Light (String name ,String type, int macAddress, int rating, String location, boolean status)
    {
        super(name, macAddress, rating, location, status);
        failureStatus = false;
        this.type = type;
        
        
        
        if (type.equals(LED))
        {
        lifeInHours = 10;
        }
        else if (type.equals(Halogen))
        {
        lifeInHours = 5;
        }
        else if (type.equals(EnergySaving))
        {
        lifeInHours = 7;
        }
        
    
    }
    
    public void setFailureStatus(boolean status) 
    {
        this.failureStatus = status;
    }
    
    public boolean getFailureStatus ()
    
    {
    return failureStatus;
    }
    
    public String getType () 
    
   {
       return type;
    }
    
    public void setType(String type)
    
    {
    this.type = type;
    }
    
    public void setLifeInHours (int life)
    {
    lifeInHours = life;
    }
    
    public int getLifeInHours ()
    {
    return lifeInHours;
    }
    
    public void setStatus (boolean status)
    
    {
        if(status == true)
        {
            lifeInHours = lifeInHours - 1;
            if (lifeInHours == 0) {
                failureStatus = true;
            }
        }
        super.setStatus(status);
    }
   
    
    public String toString ()
    {
        String failureStat;
       if (failureStatus == false)
       {
        failureStat = "Working";
        }
        else 
        {
        failureStat = "Has failed";
        }
        
       return super.toString()+ ", the life is: " + lifeInHours+ ", the failure status is: " + failureStat;
       
    }
}
