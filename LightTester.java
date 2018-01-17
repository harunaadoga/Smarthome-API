
/**
Adoga Haruna. SRN: 13000236
 */
public class LightTester
{
    public static void main (String [] args) 
    {
        
        // create a new light to test if it works
        Light redlight = new Light ("MYlight", "LED", 33, 50, "bathroom", true);
        
        //turn off the light to test the functionality of setStatus method
        redlight.setStatus(false);
        
        System.out.println(redlight.getFailureStatus());
        
        //System.out.println(redlight);
        
        
    }

}
