 /**
Adoga Haruna. SRN: 13000236
 */

/**
 * The interface Timeable specifies the minumum behaviour of a Timeable object.
 * @author Ian Bradford
 *
 */
public interface Timeable {

   /**
    * Sets the start and stop times.
    * @param startTime
    * @param stopTime
    */
    void setTimes(Time startTime, Time stopTime);
    /**
     * A method which allows the times to be unset (probably set to null)
     */
    void unSetTimes();
    /**
     * Get the start time of this object
     * @return the start time
     */
   
   Time getStartTime();
   /**
    *
    * @return the stop time
    */
   Time getStopTime();
 }
