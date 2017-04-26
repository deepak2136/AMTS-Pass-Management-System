package amts;

import com.cete.dynamicpdf.Document;
import com.cete.dynamicpdf.Font;
import com.cete.dynamicpdf.Page;
import com.cete.dynamicpdf.RgbColor;
import com.cete.dynamicpdf.pageelements.Image;
import com.cete.dynamicpdf.pageelements.Label;
import java.io.File;
import java.util.Scanner;

public class PassPDF {
    
    private Database1 db1;
    private final RgbColor c1 = new RgbColor(0,102,153);
    private final RgbColor c2 = new RgbColor(0,0,0);
     private final RgbColor c3 = new RgbColor(204,0,102);
    private Label passType;
    private Label StartDate;
    private Label EndDate;
    private Label passNo;
    private Label name;
    private Label adress;
    private Label dob;
    private Label price;
    private Label gender;
    private Scanner scr;
    private String path;
    
    public PassPDF(String s)
    {
        db1 = new Database1();
        
        try
        {
            Document doc = new Document();
            doc.setCreator("AMTS corporation");
            doc.setAuthor("Deepak Prajapati");
            doc.setTitle("s[0]");
            Page page1 = new Page(434,320);
            
            //File fd = new File(getClass().getResource("/amts/SETTING.txt").getPath().replaceAll("%20", " "));
            File fd = new File("D:\\SETTING.txt");
            scr = new Scanner(fd );
            while( scr.hasNext() )
            {
                String tmp = scr.next();
                System.out.println(tmp);
                if( tmp.equalsIgnoreCase("PDF_PATH"))
                    path = scr.next();
            }
            
            String cols[] = { "pass_no","fullName","dob","pic","adress","pincode","pass_id","proof_id","start_date","end_date","price","id_no"};
            String[][] data = db1.getData(cols, "pass", "pass_no", s);
            
            page1.getElements().add( new Label("  Ahmedabad Muncipal Transport Service " ,60,1,225,16,Font.getTimesBold(),12,c3 ) );
            page1.getElements().add( new Label(" Pass No : " ,7,73,115,16,Font.getTimesBold(),12,c1 ) );
            
            page1.getElements().add( new Label(" Name : " ,7,103,114,16,Font.getTimesBold(),12,c1 ) );
            page1.getElements().add( new Label(" Adress : " ,7,138,117,16,Font.getTimesBold(),12,c1 ) );
            page1.getElements().add( new Label(" Pass fee : " ,7,181,117,16,Font.getTimesBold(),12,c1 ) );
            page1.getElements().add( new Label(" Gender : " ,7,213,116,16,Font.getTimesBold(),12,c1 ) );
            page1.getElements().add( new Label(" Last Date : " ,290,60,200,12,Font.getTimesBold(),6,c1 ) );
            page1.getElements().add( new Label(" Signature : " ,280,220,50,1,Font.getTimesBold(),7,c1 ) );
            page1.getElements().add( new Label(" R.s.patel " ,285,230,50,1,Font.getTimesBold(),5,c2 ) );
            
            String s1 = null;
            String s2 = null;
            File fin;
            fin = new File(getClass().getResource("/amts/images/home/logo.jpg").getPath().replaceAll("%20", " "));
            s1 = fin.getAbsolutePath();
            fin = new File(getClass().getResource(data[0][3]).getPath().replaceAll("%20", " "));
            s2 = fin.getAbsolutePath();
            System.out.println(s1);
            
            try
            {
                Image pic = new Image(s1,15,5 );
                pic.setHeight(45);
                pic.setWidth(45);
                page1.getElements().add(pic);
                
                Image pic1 = new Image(s2,290,5);
                pic1.setHeight(55);
                pic1.setWidth(55);
                page1.getElements().add(pic1);
            }
            catch( NullPointerException e )
            {
                System.out.println(e + "\n" + e.getMessage());
            }

            String gn  = null;
            String passType1 = db1.getValue("type", "pass_mast", "pass_id", data[0][6]);
            
            try
            {
                if( data[0][7].equalsIgnoreCase("1001") )
                    gn = db1.getValue("gen", "adhar_card", "adhar_id", data[0][11] );
                if( data[0][7].equalsIgnoreCase("1002") )
                    gn = db1.getValue("gen", "voter_card", "voter_id", data[0][11] );
                if( data[0][7].equalsIgnoreCase("1008") )
                    gn = db1.getValue("gen", "student", "GRNO", data[0][11] );  
            }
            catch(NullPointerException e)
            {
                System.out.println(e);
            }
            
            System.out.println("dddd    "+ data[0][11]);
            
            StartDate= new Label(data[0][8],145,40,200,12,Font.getCourier(),9,c2);
            EndDate= new Label(data[0][9],290,68,200,12,Font.getCourier(),6,c2);
            passNo = new Label(data[0][0],80,71,157,16,Font.getCourier(),12,c2);
            name = new Label(data[0][1],80,103,237,17,Font.getCourier(),12,c2);
            adress = new Label(data[0][4],80,138,237,29,Font.getCourier(),12,c2);
            price = new Label(data[0][10],80,183,110,16,Font.getCourier(),12,c2);
            gender = new Label(gn,80,215,80,16,Font.getCourier(),12,c2);         
            passType = new Label(passType1,130,20,187,12,Font.getCourier(),12,c2);
            
            System.out.println(data[0][0]+data[0][5]);
            page1.getElements().add(name);
            page1.getElements().add(passNo);
            page1.getElements().add(adress);
            page1.getElements().add(gender);
            page1.getElements().add(price);
            page1.getElements().add(passType);
            page1.getElements().add(StartDate);
            page1.getElements().add(EndDate);
           
            System.out.printf(path + "\\" + s + ".pdf");
            doc.getPages().add(page1);
            doc.draw( path + "\\" + s + ".pdf");
        }//try
        catch(NullPointerException e2)
        {   
            System.out.println( e2);
            System.out.println(e2.getMessage());
        }
        catch( Exception e )
        {
            System.out.println( e );
        }//catch
    }//constructor    
    
    
}//class
