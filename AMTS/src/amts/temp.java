package amts;

import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

public class temp {
    
   public static void main( String args[] )
   {
      PassPDF p = new PassPDF("175002");
      p=new PassPDF("175002");
      
      PrinterJob pj = PrinterJob.getPrinterJob();
      
      if( pj.printDialog() )
      {
          try
          {
              pj.print();
          }
          catch(PrinterException ex)
          {
              
          }
      }
      
   }
}
