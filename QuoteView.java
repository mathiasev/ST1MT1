
/**
 * Write a description of class QuoteView here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QuoteView
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class QuoteView
     */
    public void printQuote(   String sOrbit,          // orbit (LEO, GTO)
    int    iNum,            // number of services eg 2=2 satelites
    double dPayloadVal,     // value of payload (for insurance purposes)
    boolean bNitrogen,      // true = nitrogen flush false = no nitrogen flush
    boolean bManned,        // true if its manned spaceflight
    double dCost,           // service base cost
    double dCostByNum,      // cost*num
    String sDescription,    // one line description of service
    double dDiscount,       // discount
    double dCostNitrogen,   // cost of nitrogen flush
    double dCostGross,      // gross cost intermediate value
    double dTax,            // 3% tax
    int    iNearestMillion, // nearest million value rounded up for insurance calculation
    double dCostInsurance,  // the cost of insurance
    double dCostNesa,       // Extra for GTO tracking
    double dCostNett,       // Nett invoice amount (total)
    double dCostInvoice,
    String sServiceCode,
    boolean bInsurance)    // Nett invoice amount (total)))
    {   
        System.out.println("\n\n\n\n-------------------------------------------------");
        System.out.println(        "            SpaceY Quotation System"); 
        System.out.println("-------------------------------------------------\n\n");

        System.out.println(String.format("Service Code:                   %18s", (sServiceCode)));
        System.out.println(String.format("Service Description:            %18s", (sDescription)));        
        System.out.println(String.format("Orbit Level:                    %18s", (sOrbit)));
        if(bNitrogen) System.out.println(String.format("Requires Nitrogen Flush:        %18s", Boolean.toString(bNitrogen)));
        if(bManned) System.out.println(String.format("Manned Spaceflight:             %18s", Boolean.toString(bManned)));
        if (bInsurance) System.out.println(String.format("Insurance:                      %18s", Boolean.toString(bInsurance)));
        System.out.println("\n\n");
        System.out.println(String.format("Number of Services:             %18s", Integer.toString(iNum)));
        System.out.println(String.format("Value of Payload:               %18.2f", (dPayloadVal)));
        System.out.println(String.format("Base Service Cost:              %18.2f",(dCost)));
        System.out.println(String.format("Base Cost of Services:          %18.2f", (dCostByNum)));
        if(dDiscount < 0) System.out.println(String.format("Discount Amount:                %18.2f", (dDiscount)));
        if (bNitrogen) System.out.println(String.format("Cost of Nitrogen Flush:         %18.2f", (dCostNitrogen)));
        System.out.println(String.format("Gross Cost:                     %18.2f", (dCostGross)));
        System.out.println(String.format("Tax Cost:                       %18.2f", (dTax)));
        System.out.println(String.format("Nearest Million for Insurance:  %18d", (iNearestMillion)));
        if (bInsurance) System.out.println(String.format("Cost of Insurance:              %18.2f", (dCostInsurance)));
        System.out.println(String.format("NESA GTO Tracking Cost :        %18.2f", (dCostNesa)));
        System.out.println(String.format("Net Cost:                       %18.2f", (dCostNett)));
        System.out.println(String.format("Invoice Total:                  %18.2f", (dCostInvoice)));
    }
}
