/**
 * Adoga Haruna.
 */

import java.util.ArrayList;  // to enable us use the array list in our program
public class House
{
    private String address;
    private String otherAddress;
    ArrayList <ElectricalAppliance > appliance = new ArrayList <ElectricalAppliance> ();
    /**
     * House class constructor
     */
   
    public House (String address){
    this.address = address;
    }
    /**
     * Method that adds appliance to the house
     */
    public void addAppliance (ElectricalAppliance app) 
    {
        app.setLocation(address);
        appliance.add(app);
    }
    
    /**
     * method to find appliance
     */
    public ElectricalAppliance findAppliance(String elect)
    {
    for (ElectricalAppliance e : appliance) {
    
        if (e.getName().contains(elect)) {

            return e;
    }
}
      return null;
        
    }
     /**
      * Method that removes an electrical appliance
      */
     public void removeAppliance(ElectricalAppliance app)
    {
        appliance.remove(app);
    
    }
    
    /**
     * Method that turns off all electrical appliance
     */
    public void turnOffAll () {
        for (ElectricalAppliance e : appliance ) 
        {
            e.setStatus(false);
        
        }}
        /**
         * A method that turns on all Lights in the house
         */
        
        public void turnOnAll () {
            for (ElectricalAppliance e : appliance)
            {
                e.setStatus(true);
            
            }}
        /**
         * Method turnOnApp
         *
         * @param app A parameter
         */
        public void turnOnApp (String app) {
            ElectricalAppliance electapp = findAppliance(app);
            electapp.setStatus(true);
        }
        /**
         * Method setTimeableLights
         *
         * @param currentTime A parameter
         * @param startTime A parameter
         * @param stopTime A parameter
         */
        public void setTimeableLights (Time currentTime, Time startTime, Time stopTime) 
        {
        for (int i = 0 ; i <appliance.size(); i ++)
        {
            if (appliance.get(i) instanceof TimeableLight)
            {
            TimeableLight timelight =(TimeableLight) appliance.get(i);
            timelight.setTimes(startTime, stopTime);
            timelight.setCurrentTime(currentTime);
            appliance.set(i, timelight);
            }   
        }
        }
        /**
         * A toString method to display the house address and the details of the electrical appliance
         */
        
        public String toString () 
        {
            String showappliance = "";
            for (int i = 0; i < appliance.size() ; i ++)
            {
            showappliance = showappliance + appliance.get(i).toString();
            }
        return "the address of the house is : " + address + " the appliances in the house are : " + showappliance;
        }
    }
    
    
    
    
    
    
