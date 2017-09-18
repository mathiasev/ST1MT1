
/**
 * Write a description of class QuoteModel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QuoteModel
{
    // instance variables - replace the example below with your own
    private ServiceCode scServiceCode;
    private String sOrbit = "LEO"; // orbit (LEO, GTO)
    private int    iNum; // number of services eg 2=2 satelites
    private double dPayloadVal; // value of payload (for insurance purposes)
    private boolean bNitrogen; // true = nitrogen flush false = no nitrogen flush
    private boolean bManned; // true if its manned spaceflight
    private String[] saRequiredFields = new String[5];

    private double dCost; // service base cost
    private double dCostByNum; // cost*num
    private String sDescription; // one line description of service
    private double dDiscount; // discount
    private double dCostNitrogen; // cost of nitrogen flush
    private double dCostGross; // gross cost intermediate value
    private double dTax; // 3% tax
    private int    iNearestMillion; // nearest million value rounded up for insurance calculation
    private boolean bInsurance;
    private double dCostInsurance; // the cost of insurance
    private double dCostNesa; // Extra for GTO tracking
    private double dCostNett; // Nett invoice amount (total)
    private double dCostInvoice; // Nett invoice amount (total)

    /**
     * Constructor for objects of class QuoteModel
     */
    public QuoteModel()
    {
        // initialise instance variables
    }

    public void calculate() {
this.dCostGross = this.
        this.nesa
        this.tax
        this.
    }

    public void set_scServiceCode( ServiceCode scServiceCode) throws CustomQuote { 
        this.scServiceCode= scServiceCode;
        this.dCost = scServiceCode.getCost();
        this.sDescription = scServiceCode.getDescription();
        this.bManned = scServiceCode.getManned();

        if(bManned) dTax = 3.0;
    }

    public ServiceCode get_scServiceCode() { return scServiceCode; }

    public String get_sServiceName() {  return scServiceCode.getName();}

    public void set_sOrbit( String sOrbit) { this.sOrbit= sOrbit; }

    public String get_sOrbit() { return sOrbit; }

    public void set_iNum( int iNum) {
        this.iNum= iNum; 
        this.dCostByNum = this.iNum * this.dCost;

        this.dDiscount = (this.iNum > 4) ? 0.03: 0;
    }

    public int get_iNum() { return iNum; }

    public void set_bInsurance(boolean bInsurance) {
        this.bInsurance = bInsurance;
    }

    public boolean get_bInsurance() {
        return this.bInsurance;
    }

    public void set_dPayloadVal( double dPayloadVal) { 
        this.dPayloadVal= dPayloadVal;

        this.iNearestMillion = (int)(dPayloadVal/1000000);

    }

    public double get_dPayloadVal() { return dPayloadVal; }

    public void set_bNitrogen( boolean bNitrogen) { this.bNitrogen= bNitrogen;
        this.dCostNitrogen = 180000.0;}

    public boolean get_bNitrogen() { return bNitrogen; }

    public boolean get_bManned() { return bManned; }

    public double get_dCost() { return dCost; }

    public double get_dCostByNum() { return dCostByNum; }

    public String get_sDescription() { return sDescription; }

    public double get_dDiscount() { return dDiscount; }

    public double get_dCostNitrogen() { return dCostNitrogen; }



    public double get_dCostGross() { return dCostGross; }

    public double get_dTax() { return dTax; }

    public int get_iNearestMillion() { return iNearestMillion; }

    public void set_dCostInsurance( double dCostInsurance) { this.dCostInsurance= dCostInsurance; }

    public double get_dCostInsurance() { return dCostInsurance; }

    public void set_dCostNesa( double dCostNesa) { this.dCostNesa= dCostNesa; }

    public double get_dCostNesa() { 
        if(this.scServiceCode.getName().equals("GTO")) {
            return dCostNesa * this.dCostGross;
        }
        return 0;
    }

    public void set_dCostNett( double dCostNett) { this.dCostNett= dCostNett; }

    public double get_dCostNett() { return dCostNett; }

    public void set_dCostInvoice( double dCostInvoice) { this.dCostInvoice= dCostInvoice; }

    public double get_dCostInvoice() { return dCostInvoice; }

}
