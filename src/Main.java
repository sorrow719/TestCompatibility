import com.smartxls.WorkBook;


public class Main
{

    public static void main(String[] args)
    {
        WorkBook wb = new WorkBook();
        
        System.err.println("No bug in templateWithoutBug.xlsx");
        /*Without bug*/
        try
        {
            wb.readXLSX("templateWithoutBug.xlsx");
            wb.setSheet(0);
            int lastCol = wb.getLastCol();
            for (int i = 0; i < lastCol; i++)
            {
                wb.setColWidthAutoSize(i, true);
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        
        System.err.println("\nThis bug in templateBug.xlsx");
        try
        {
            wb.readXLSX("templateBug.xlsx");
            wb.setSheet(0);
            int lastCol = wb.getLastCol();
            for (int i = 0; i < lastCol; i++)
            {
                wb.setColWidthAutoSize(i, true);
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

}
