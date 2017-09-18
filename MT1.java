import java.util.*;

/**
 * Marked Tutorial 1 Constructor to process Quotes for SpaceY.
 *
 * @author u3160264 (Mathias Everson)
 * @version 20170914
 */
public class MT1
{
    private ServiceCode scServiceCode1 = new ServiceCode();
    private Scanner in = new Scanner(System.in);
    /**
     * Constructor for objects of class MT1
     */
    public MT1()
    {
        // initialise instance variables
        System.out.println("Loaded MT1");

        boolean retry = true;
        while (retry) {
            try {
                QuoteModel model =  askQuestions();
                QuoteView view = new QuoteView();
                QuoteController controller = new QuoteController(model, view);
                controller.updateView();

            }
            catch (CustomQuote cq) {
                printCustomQuote();
            }

            retry = getCleanBoolean("\n\n\nWould you like another quote? (y/n)");
        }

        in.close();
    }

    private void printCustomQuote() {
        System.out.println("Please request a custom quote from the SpaceY CEO");
    }

    private QuoteModel askQuestions() throws CustomQuote {
        QuoteModel quote = new QuoteModel();
        getServiceCode();

        quote.set_scServiceCode(scServiceCode1);

        /**
         * Request Number of Launches
         */
        int iNumberOfLaunches = getCleanInt("Number of launches (up to 15): ", new int[] {0,15});
        quote.set_iNum(iNumberOfLaunches);

        /**
         *  Request Orbit Level if applicable
         */
        if (scServiceCode1.needToSetOrbit()) {
            String sOrbitLevel = getCleanString("Enter Orbit Level (LEO = Low Earth Orbit, GTO = Geosynchronous Transfer Orbit): ", new String[] {"LEO", "GTO"});
            quote.set_sOrbit(sOrbitLevel);
        }

        /**
         * Request Payload Value
         */
        double dPayloadValue = getCleanDouble("Payload Value: ");
        quote.set_dPayloadVal(dPayloadValue);

        /**
         * Set Nitro if applicable
         */
        if(scServiceCode1.needToNitro()) {
            Boolean bNeedToNitro = getCleanBoolean("Nitrogen Flush Needed (y/n): ");
            quote.set_bNitrogen(bNeedToNitro);
        }

        /**
         * Set Insurance if applicable
         */
        if(!scServiceCode1.getManned()) {
            Boolean bNeedInsurance = getCleanBoolean("Include Insurance (y/n): ");
            quote.set_bInsurance(bNeedInsurance);

        }

        quote.calculate();
        
        return quote;
    }

    public boolean getCleanBoolean(String sRequestMessage) {
        String sInput = "";
        Boolean retry = true;
        while (retry) {
            try {    
                System.out.print(sRequestMessage);
                sInput = (in.nextLine().trim());
                if (sInput.equalsIgnoreCase("y") ) {
                    retry = false;
                    return true;}
                else if (sInput.equalsIgnoreCase("n")) {
                    retry = false;
                    return false;}
                else {
                    retry = true;
                }
            }
            catch (Exception e) {
                System.out.println("Error reading input. Please try again.");
            }
        }
        return false;
    }

    /**
     * Method getCleanDouble
     *
     * @param sRequestMessage Message to prompt user
     * @return a sanitized and error checked double
     */
    public double getCleanDouble(String sRequestMessage) {
        double dInput = 0.0;
        Boolean retry = true;
        while(retry) {

            try {    
                System.out.print(sRequestMessage);
                dInput = 
                dInput = Double.parseDouble(in.nextLine().trim());
                retry = false;
            }
            catch (Exception e) {
                System.out.println("Error reading input. Please try again.");
            }
        }
        return dInput;
    }

    /**
     * Get Clean String
     *
     * @param  sRequestMessage  Message to prompt user for input
     * @return    returns a sanitized and error checked String
     */
    public String getCleanString(String sRequestMessage)
    {
        String sInput = "";
        Boolean retry = true;
        while(retry) {

            try {    
                System.out.print(sRequestMessage);
                sInput = (in.nextLine().trim());
                retry = false;
            }
            catch (Exception e) {
                System.out.println("Error reading input. Please try again.");
            }
        }
        return sInput;
    }

    public String getCleanString(String sRequestMessage, String[] params) {
        String sInput = "";
        Boolean retry = true;
        while (retry) {
            try {    
                System.out.print(sRequestMessage);
                sInput = (in.nextLine().trim());

                for (String s: params) {
                    if  (s.equals(sInput))  return sInput; else  retry = true;
                }
            }
            catch (Exception e) {
                System.out.println("Error reading input. Please try again.");
            }
        }
        return sInput;
    }

    /**
     * Get Clean Int
     * 
     * @param sRequestMessage Message to prompt user for input
     * @return    return a sanitized and error checked Integer
     */
    public int getCleanInt(String sRequestMessage)
    {
        int iInput = -1;
        Boolean retry = true;
        while(retry) {

            try {    
                System.out.print(sRequestMessage);
                iInput = Integer.parseInt(in.nextLine().trim());
                retry = false;
            }
            catch (Exception e) {
                System.out.println("Error reading input. Please try again.");
            }
        }
        return iInput;
    }
     public int getCleanInt(String sRequestMessage, int[] params)
    {
        int iInput = -1;
        Boolean retry = true;
        while(retry) {

            try {    
                System.out.print(sRequestMessage);
                iInput = Integer.parseInt(in.nextLine().trim());
                
                if (params[0] <= iInput && iInput <= params[1])
                
                retry = false;
            }
            catch (Exception e) {
                System.out.println("Error reading input. Please try again.");
            }
        }
        return iInput;
    }

    /**
     * Method getServiceCode
     * Asks user for service code and sets the value in Service Code class
     */
    private void getServiceCode() {

        for (String sMenuOption : scServiceCode1.getMenuOptions()) {
            System.out.println(sMenuOption);
        }

        Boolean retry = true;
        while(retry) {

            try {    
                System.out.print("Please enter a Service Code: ");
                String sInputServiceCode = in.nextLine().trim().toUpperCase();
                scServiceCode1.setCode(sInputServiceCode);

                retry = !scServiceCode1.isValid();
            }
            catch (Exception e) {
                System.out.println("Error in reading input");
            }
        }

    }
}
