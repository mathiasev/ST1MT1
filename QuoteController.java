
/**
 * Write a description of class QuoteController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QuoteController
{
    // instance variables - replace the example below with your own
    private QuoteModel model;
    private QuoteView view;

    /**
     * Constructor for objects of class QuoteController
     */
    public QuoteController(QuoteModel model,QuoteView view)
    {
        this.model = model;
        this.view = view;
    }

    public void updateView(){
        view.printQuote(
            model.get_sOrbit(),
            model.get_iNum(),
            model.get_dPayloadVal(),
            model.get_bNitrogen(),
            model.get_bManned(),
            model.get_dCost(),
            model.get_dCostByNum(),
            model.get_sDescription(),
            model.get_dDiscount(),
            model.get_dCostNitrogen(),
            model.get_dCostGross(),
            model.get_dTax(),
            model.get_iNearestMillion(),
            model.get_dCostInsurance(),
            model.get_dCostNesa(),
            model.get_dCostNett(),
            model.get_dCostInvoice(),
            model.get_sServiceName(),
            model.get_bInsurance()
        );
    }
    
    public void set_bInsurance(boolean bInsurance) {model.set_bInsurance(bInsurance);}
    
    public boolean get_bInsurance() { return model.get_bInsurance();}

    public void set_scServiceCode( ServiceCode scServiceCode) throws CustomQuote { model.set_scServiceCode(scServiceCode); }

    public ServiceCode get_scServiceCode(){ return model.get_scServiceCode(); }

    public void set_sOrbit( String sOrbit) { model.set_sOrbit(sOrbit); }

    public String get_sOrbit(){ return model.get_sOrbit(); }

    public void set_iNum( int iNum) { model.set_iNum(iNum); }

    public int get_iNum(){ return model.get_iNum(); }

    public void set_dPayloadVal( double dPayloadVal) { model.set_dPayloadVal(dPayloadVal); }

    public double get_dPayloadVal(){ return model.get_dPayloadVal(); }

    public void set_bNitrogen( boolean bNitrogen) { model.set_bNitrogen(bNitrogen); }

    public boolean get_bNitrogen(){ return model.get_bNitrogen(); }

    public boolean get_bManned(){ return model.get_bManned(); }

    public double get_dCost(){ return model.get_dCost(); }

    public double get_dCostByNum(){ return model.get_dCostByNum(); }

    public String get_sDescription(){ return model.get_sDescription(); }

    public double get_dDiscount(){ return model.get_dDiscount(); }

    public double get_dCostNitrogen(){ return model.get_dCostNitrogen(); }

    public void set_dCostGross( double dCostGross) { model.set_dCostGross(dCostGross); }

    public double get_dCostGross(){ return model.get_dCostGross(); }

    public double get_dTax(){ return model.get_dTax(); }

    public int get_iNearestMillion(){ return model.get_iNearestMillion(); }

    public void set_dCostInsurance( double dCostInsurance) { model.set_dCostInsurance(dCostInsurance); }

    public double get_dCostInsurance(){ return model.get_dCostInsurance(); }

    public void set_dCostNesa( double dCostNesa) { model.set_dCostNesa(dCostNesa); }

    public double get_dCostNesa(){ return model.get_dCostNesa(); }

    public void set_dCostNett( double dCostNett) { model.set_dCostNett(dCostNett); }

    public double get_dCostNett(){ return model.get_dCostNett(); }

    public void set_dCostInvoice( double dCostInvoice) { model.set_dCostInvoice(dCostInvoice); }

    public double get_dCostInvoice(){ return model.get_dCostInvoice(); }
    
    public String get_sServiceName() { return model.get_sServiceName();}
}
