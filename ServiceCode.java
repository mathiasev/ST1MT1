
/**
 * ServiceCode validator and Constructor for quotes.
 *
 * @author u3160264 (Mathias Everson)
 * @version 20170914
 */
public class ServiceCode
{
    // instance variables - replace the example below with your own
    private Boolean isValid = false;
    private String sServiceCode = "No Service Code Set";
    private String[] saServiceCodes = new String[] {"ORB1", "ORBH", "ISS5", "ILLOYDS", "DLAB", "LEOM7", "MOON2"};

    /**
     * Constructor for objects of class ServiceCode
     */
    public ServiceCode()
    {
    }

    /**
     * Method getServiceCode
     *
     * @return Service Code String
     */
    public String getServiceCode() {
        return sServiceCode;
    }

    /**
     * Sets Service Code
     */
    public void setCode(String sInputServiceCode) {
        sServiceCode = sInputServiceCode;
    }

    /**
     *  Validates Service code and will set isInvalid flag to reprompt user input
     */
    public Boolean isValid() {

        switch (sServiceCode){
            case "ORB1":
            case "ORBH":
            case "ISS5":
            case "ILLOYDS":
            case "DLAB":
            case "LEOM7":
            case "MOON2":
            isValid = true;
            break;
        }

        return isValid;
    }

    /**
     *  Getter for Menu Options
     */
    public String[] getMenuOptions() {
        return saServiceCodes;
    }

    public double getCost() throws CustomQuote {
        switch(sServiceCode) {
            case "ORB1":
            return 62000000.0;
            case "ORBH":
            return 90000000.0;
            case "ISS5":
            return 76400000.0;
            case "ILLOYDS":
            return 97100.0;
            case "DLAB":
            return 112000000.0;
            case "LEOM7":
            return 14000000.0;
            case "MOON2":
            throw new CustomQuote("Get a custom quote from the CEO");
        }   
        return 0.0;
    }

    public String getDescription() {
        switch(sServiceCode) {
            case "ORB1":
            return "One satellite to low earth orbit weighing less than 7 metric tonnes; or One satellite to GTO weighing less than 5.5 metric tonnes .";
            case "ORBH":
            return "One satellite to low earth orbit weighing less than 16 metric tonnes; or One satellite to GTO weighing less than 8 metric tonnes .";
            case "ISS5":
            return "Up to 5 tonnes of cargo delivered to the ISS with a Drako spacecraft (LEO) ";
            case "ILLOYDS":
            return "Insurance for payload/cargo to the value of 1 Million dollars (no tax due on insurance costs) ";
            case "DLAB":
            return "LAB with up to 3 scientists in earth orbit for 1 week, in a Drako orbital lab. Spacecraft be accompanied by 2 SpaceY astronauts ";
            case "LEOM7":
            return "Low earth orbit experience for 3 days for up to 5 people in a Drako Capsule, you will be accompanied by 2 SpaceY astronauts. ";
            case "MOON2":
            return "Two space tourists to fly around the moon accompanied by an experienced astronaut ";
        }
        return "";   
    }
    
    public String getName() {
     return sServiceCode;   
    }

    public boolean getManned() {
        switch(sServiceCode) {
            case "ORB1":
            case "ORBH":
            case "ISS5":
            case "ILLOYDS":
            return false;

            case "DLAB":
            case "LEOM7":
            case "MOON2":
            return true;
        }
        return false;   
    }

    public boolean needToSetOrbit() {
        switch(sServiceCode) {
            case "ORB1":
            case "ORBH":
            case "DLAB":
            return true;   

            case "MOON2":
            case "LEOM7":
            case "ISS5":
            case "ILLOYDS":
            return false;

        }
        return false;   
    }

    public boolean needToNitro() {
        switch(sServiceCode) {
            case "ORB1":
            case "ORBH":
            case "ISS5":
            case "ILLOYDS":
            return true;   

            case "DLAB":
            case "LEOM7":
            case "MOON2":
            return false;

        }
        return false;   
    }
}
