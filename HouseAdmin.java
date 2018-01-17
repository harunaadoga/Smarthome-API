/**
 * Adoga Haruna. SRN: 13000236
 */
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class HouseAdmin extends JFrame
{
  private House villa;
  
  private JTextArea displaytext;
  private JButton setup;
  private JButton listall;
  private JButton turnonapp;
  private JButton switchon;
  private JPanel panel;

  
  /**
   * HouseAdmin Constructor
   *
   * @param title A parameter
   */
  public HouseAdmin (String title)
  
  {
      
      //JOptionPane for user input
      String userin = JOptionPane.showInputDialog(null, " Enter Appliance name to on ");
      JOptionPane.showMessageDialog(null, userin + "Turned on, click ok to quit");
      
      //buttons
      setup = new JButton ("set up house");
      listall = new JButton ("List all appliances in House");
      turnonapp = new JButton ("Turn on appliance");
      switchon = new JButton ("Switch on all lights");
      
      
      panel = new JPanel(); // new JPanel
     displaytext = new JTextArea(50,50);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setTitle("Smart House User Interface");
     setSize(400, 400);
      
     
     GridLayout  grid = new GridLayout(3,3, 20,20);
     setLayout(grid);
      panel.setLayout(grid);
     
      
      //add action listener to the buttons
      
      
      
     // add buttons to panel
      panel.add(setup);
      panel.add(listall);
      panel.add(displaytext);
      panel.add(switchon);
      panel.add(displaytext);
      panel.add(turnonapp);
      
      add(panel); //adds the panel to the JFrame
      
      setVisible(true);
    }
    
    //
    private void setupHouse()
    {
        //Time objects created to pass in the timeablelight constructor
        Time time1 = new Time (31,12,2014,5, 38);
        Time time2 = new Time (01, 01, 2014, 10, 25);
        Time time3 = new Time (02, 05, 2015, 11, 45);
        
           
        Light dinnerbulb = new Light ("DinnerBulb", "LED", 555, 50, "Dinner", false );
        Light bathbulb = new Light ("BathBulb", "LED", 666, 100, "Bathroom", false );
        Light roombulb = new Light ("Bulb3", "LED", 555, 50, "Bedroom", false );
        Light porchbulb = new Light ("porchBulb", "LED", 444, 40, "Porch", false );
        Light garagebulb = new Light ("GarageBulb", "LED", 666, 100, "Garage", false );
        Light gardenbulb = new Light ("GardenBulb", "LED", 999, 60, "Garden", false );
        Light toiletbulb = new Light ("ToiletBulb", "LED", 555, 50, "Toilet", false );
        TimeableLight halogen = new TimeableLight ("Timedhalogen", "Halogen", 222, 20, "Kitchen", time1, false);
        TimeableLight newlight = new TimeableLight("TimedLight", "EnergySaving", 999, 10, "Bathroom", time2, false);
        TimeableLight kitchenlight = new TimeableLight ("KitchenBulb", "Halogen", 33, 30, "Kitchen", time3, false);
   
    }
    
    
    
    public class Action implements ActionListener
    {
    
        public void actionPerformed (ActionEvent e)
        
        {
            
        
        }
        
    }
    
    public static void main (String [] args) 
    {
        
    HouseAdmin testhouse = new HouseAdmin("");
    
    }
 
    
    
}
