
/**
 * Write a description of class QuoteController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QuoteController
{
    // instance variables - replace the example below with your own
    private Quote model;
    private QuoteView view;

    /**
     * Constructor for objects of class QuoteController
     */
    public QuoteController(Quote model,QuoteView view)
    {
        this.model = model;
        this.view = view;
    }

    
   public void set_scServiceCode( ServiceCode scServiceCode) { this.scServiceCode= scServiceCode; }

    public ServiceCode get_scServiceCode() { return scServiceCode; }

    public void set_sOrbit( String sOrbit) { this.sOrbit= sOrbit; }

    public String get_sOrbit() { return sOrbit; }

    public void set_iNum( int iNum) { this.iNum= iNum; }

    public int get_iNum() { return model.iNum; }

    public void set_dPayloadVal( double dPayloadVal) { this.dPayloadVal= dPayloadVal; }

    public double get_dPayloadVal() { return model.dPayloadVal; }

    public void set_bNitrogen( boolean bNitrogen) { this.bNitrogen= bNitrogen; }

    public boolean get_bNitrogen() { return model.bNitrogen; }

    public void set_bManned( boolean bManned) { this.bManned= bManned; }

    public boolean get_bManned() { return model.bManned; }

    public void set_dCost( double dCost) { this.dCost= dCost; }

    public double get_dCost() { return model.dCost; }

    public void set_dCostByNum( double dCostByNum) { this.dCostByNum= dCostByNum; }

    public double get_dCostByNum() { return model.dCostByNum; }

    public void set_sDescription( String sDescription) { this.sDescription= sDescription; }

    public String get_sDescription() { return model.sDescription; }

    public void set_dDiscount( double dDiscount) { this.dDiscount= dDiscount; }

    public double get_dDiscount() { return model.dDiscount; }

    public void set_dCostNitrogen( double dCostNitrogen) { this.dCostNitrogen= dCostNitrogen; }

    public double get_dCostNitrogen() { return model.dCostNitrogen; }

    public void set_dCostGross( double dCostGross) { this.dCostGross= dCostGross; }

    public double get_dCostGross() { return model.dCostGross; }

    public void set_dTax( double dTax) { this.dTax= dTax; }

    public double get_dTax() { return model.dTax; }

    public void set_iNearestMillion( int iNearestMillion) { this.iNearestMillion= iNearestMillion; }

    public int get_iNearestMillion() { return model.iNearestMillion; }

    public void set_dCostInsurance( double dCostInsurance) { this.dCostInsurance= dCostInsurance; }

    public double get_dCostInsurance() { return model.dCostInsurance; }

    public void set_dCostNesa( double dCostNesa) { this.dCostNesa= dCostNesa; }

    public double get_dCostNesa() { return model.dCostNesa; }

    public void set_dCostNett( double dCostNett) { this.dCostNett= dCostNett; }

    public double get_dCostNett() { return model.get_ model.dCostNett; }

    public void set_dCostInvoice( double dCostInvoice) { this.dCostInvoice= dCostInvoice; }

    public double get_dCostInvoice() { return model.get_ model.dCostInvoice; }
}
