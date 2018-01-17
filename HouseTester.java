/**
Adoga Haruna. SRN: 13000236
 */

public class HouseTester
{
    public static void main (String [] args) 
    {
        House housetest = new House("No 9 Richards Street");
        //create a new Time object to use in the TimeableLight constructor
        Time current = new Time (31,12,2014,5, 38);
        
        // add appliances to the house using the add appliance method created earlier
        TimeableLight newlight = new TimeableLight("NewLight", "EnergySaving", 999, 10, "Bathroom", current, false);
        Light bulb = new Light ("Bulb", "LED", 555, 50, "Toilet", false );
        TimeableLight halogen = new TimeableLight ("Timedhalogen", "Halogen", 222, 20, "Kitchen", current, false);
        
        
        housetest.addAppliance(newlight);
        housetest.addAppliance(bulb);
        housetest.addAppliance (halogen);
        
       // System.out.println(housetest);
        
        //test find appliance method
        //System.out.println(housetest.findAppliance("Bulb"));
        
        //test the turn on all appliances method
       // housetest.turnOnAll();
        
        //test the turn off all method
        //housetest.turnOffAll();
        
        //test the turn on appliance method by passing in an appliance name.
        
        //housetest.turnOnApp("Timed");
        
        housetest.removeAppliance(halogen);
        
        System.out.println(housetest);
       
        //System.out.println(housetest);
        
        
        
        
        
        
        
        
    }
    
  
  
}
