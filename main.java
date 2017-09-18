
/**
 * Main File, init MT1 Class.
 *
 * @author u3160264 (Mathias Everson)
 * @version 20170914
 */
public class main
{
    /**
     * Constructor for objects of class main
     */
    public static void main(String[] args)
    {         System.out.print("\u000c");
        try {
            MT1 mt1 = new MT1();            
        }
        catch (Exception e) {
            System.out.println("Error Loading MT1");
            e.printStackTrace();
        }
    }
}
