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

        getServiceCode();

        try {
            QuoteModel model = askQuestions();
            QuoteView view = new QuoteView();
            QuoteController controller = new QuoteController(model, view);
            controller.updateView();

        }
        catch (CustomQuote cq) {
            printCustomQuote();
        }

        in.close();
    }

    private void printCustomQuote() {
        System.out.println("Please request a custom quote from the SpaceY CEO");
    }

    private QuoteModel askQuestions() throws CustomQuote {
        QuoteModel quote = new QuoteModel();
        quote.set_scServiceCode(scServiceCode1);

        /**
         * Request Number of Launches
         */
        int iNumberOfLaunches = getCleanInt("Number of launches: ");
        quote.set_iNum(iNumberOfLaunches);

        /**
         *  Request Orbit Level
         */
        if (scServiceCode1.needToSetOrbit()) {
            String sOrbitLevel = getCleanString("-- Orbit Level -- \nLEO = Low Earth Orbit\nGTO = Geosynchronous Transfer Orbit \nEnter Orbit Level: ");
            quote.set_sOrbit(sOrbitLevel);
        }

        return quote;

    }
    
    
    /**
     * Get Clean String
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return y;
    }


    /**
     * Get Clean Int
     * 
     * 
     * @return    return a sanitized and error checked Integer
     */
    public int getCleanInt(String sRequestMessage)
    {
        int iInput = -1;
        Boolean retry = true;
        while(retry) {

            try {    
                System.out.println(sRequestMessage);
                iInput = Integer.parseInt(in.nextLine().trim());
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
                System.out.println("Please enter a Service Code");
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
