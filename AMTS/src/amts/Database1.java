package amts;

import diu.swe.habib.JavaToast.JToast;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Database1 {
    private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    //private final String DB_URL = "jdbc:mysql://localhost/amts";
    //private final String USER = "root"; 
    //private final String PASS = "";
    
    private String DB_URL;
    private String USER;
    private String PASS = "";
    private Scanner scr;
    
    private Connection con = null;
    private ResultSet rs = null;
    private Statement st = null;
    private PreparedStatement pst = null;
    private String sql = null;
	
	Database1()
	{
		try
		{
                    //File fd = new File(getClass().getResource("/amts/SETTING.txt").getPath().replaceAll("%20", " "));
                    File fd = new File("D:\\SETTING.txt");
                    scr = new Scanner(fd );
                    
                    while( scr.hasNext() )
                    {
                        String tmp = scr.next();

                        if( tmp.equalsIgnoreCase("USER"))
                            USER = scr.next();
                        if( tmp.equalsIgnoreCase("CONNECTION"))
                            DB_URL = scr.next();
                        try
                        {
                            if( tmp.equalsIgnoreCase("PASSWORD"))
                            PASS = scr.next();                            
                        }
                        catch( NoSuchElementException | NullPointerException e )
                        {
                            System.out.println(e);
                        }
                        catch( Exception e )
                        {
                            System.out.println(e);
                        }
                    }
                    
			Class.forName(JDBC_DRIVER);
			con = DriverManager.getConnection(DB_URL,USER,PASS);
		}
		catch( ClassNotFoundException | FileNotFoundException | SQLException e )
		{
			System.out.println( e.getMessage() );
                        new JToast().makeToast(null, "Enter Proper deatils In Files First \n User Id, Password and"
                                + " Connection URL", 2, JToast.type_of_notification);
                        System.exit(0);
		}
                
	}
	
	String[] getData( String col,String table,String whr,String comp)
	{		
		System.out.println(sql);
		String[] retval;
		int row = 0;
		try
		{
			if( whr.isEmpty() || comp.isEmpty() )
			{
				sql = "select count(" + col+ ") as abc from " + table;
				pst = con.prepareStatement(sql);
			}
			else
			{
				sql = "select count(" + col + ") as abc from " + table + " where " + whr + "= ? ";
				pst = con.prepareStatement(sql);
				pst.setString(1,comp);
			}			
			rs = pst.executeQuery();
			
			rs.next();
			row = rs.getInt("abc");
			retval = new String[row];	

			if( whr.isEmpty() || comp.isEmpty() )
			{
				sql = "select " + col + " from " + table ;
				pst = con.prepareStatement(sql);
			}
			else
			{
				sql = "select " + col + " from " + table + " where " + whr + "= ? ";
				pst = con.prepareStatement(sql);
				pst.setString(1,comp);
			}			
			
			rs = pst.executeQuery();			
			row = 0;
			
			while( rs.next() )
			{
				retval[row] = rs.getString(col);
				row++;
			}			

			rs.close();
			pst.close();
		}
		catch( Exception e )
		{
			System.out.println( e );
			return null;
		}
		return retval;
	}        
	
	String[][] getData( String cols[],String table,String whr,String comp)
	{
		String[][] data;
		String col = cols[0];
		for(int i=1;i<cols.length;i++)
			col += "," + cols[i];
		
		try
		{
			if( whr.isEmpty() || comp.isEmpty() )
			{
				sql = "select count(" + cols[0] + ") as abc from " + table;
				pst = con.prepareStatement(sql);
			}
			else
			{
				sql = "select count(" + cols[0] + ") as abc from " + table + " where " + whr + "= ? ";
				pst = con.prepareStatement(sql);
				pst.setString(1,comp);
			}			

			rs = pst.executeQuery();		
			rs.next();
			
			int row = rs.getInt("abc");			
			data = new String[row][cols.length];
			
			if( whr.isEmpty() || comp.isEmpty() )
			{
				sql = "select " + col + " from " + table ;
				pst = con.prepareStatement(sql);
			}
			else
			{
				sql = "select " + col + " from " + table + " where " + whr + "= ? ";
				pst = con.prepareStatement(sql);
				pst.setString(1,comp);
			}

			rs = pst.executeQuery();
			row = 0;
			System.out.println(sql);
                        
			while( rs.next() )
			{
				for(int i=0;i<cols.length;i++)
					data[row][i] = rs.getString((i+1));
			
				row++;
			}	

			rs.close();
			pst.close();
		}
		catch( Exception e )
		{
			System.out.println( e );
			return null;
		}
		return data;
	}     
        
        
    String[][] getData( String cols[],String table,String whr,String in[])
	{
        String[][] data;
        String col = cols[0];
        for(int i=1;i<cols.length;i++)
            
	col += "," + cols[i];
		
        if(in.length < 1)
            return null;
                
        try
        {
            sql = "select count(" + cols[0] + ") as abc from " + table + " where " + whr + " in ( ? ";
            for(int i=1;i<in.length;i++)
                sql += ", ?";
                sql += ")";
                System.out.println(sql);
                pst = con.prepareStatement(sql);
                
                for(int i=1;i<=in.length;i++)
                    
                    pst.setString(i, in[(i-1)]);						
		    rs = pst.executeQuery();		
		    rs.next();
			
		int row = rs.getInt("abc");	
                System.out.println(row);
		data = new String[row][cols.length];
                
                sql = "select " + col + " from " + table + " where " + whr + " in ( ? ";
                
                for(int i=1;i<in.length;i++)
                        sql += ", ?";
                        sql += ")";
                        pst = con.prepareStatement(sql);
                        
                for(int i=1;i<=in.length;i++)
                    pst.setString(i, in[i-1]);		
                    rs = pst.executeQuery();
                    row = 0;
			
		while( rs.next() )
		{
                    for(int i=0;i<cols.length;i++)
                        data[row][i] = rs.getString((i+1));
                        row++;
		}	
		rs.close();
                pst.close();
            }
            catch( SQLException e )
            {
		System.out.println( e );
                return null;
            }
            return data;
	}     
        
    String[][] getData( String cols[],String table,String whr,String comp,int start,int cnt)
	{
		String[][] data = new String[cnt][cols.length];
		String col = cols[0];
		for(int i=1;i<cols.length;i++)
			col += "," + cols[i];
		
		try
		{		
			if( whr.isEmpty() || comp.isEmpty() )
			{
				sql = "select " + col + " from " + table + " limit " + start + "," + cnt;
				pst = con.prepareStatement(sql);
			}
			else
			{
				sql = "select " + col + " from " + table + " where " + whr + "= ? " + " limit " + start + "," + cnt;
				pst = con.prepareStatement(sql);
				pst.setString(1,comp);
			}

			rs = pst.executeQuery();
			int row = 0;
			
			while( rs.next() )
			{
				for(int i=0;i<cols.length;i++)
					data[row][i] = rs.getString((i+1));
              				row++;
			}	

			rs.close();
			pst.close();
		}
		catch( Exception e )
		{
			System.out.println( e );
			return null;
		}
		return data;
	}
       
        boolean insertData( String table,String[] data )
        {
            boolean b = false;
            
            try
            {
                int n = data.length;
                if( n == 0 )
                    return false;
                
                sql = "insert into " + table + " values( ";
                for(int i=0; i<n; i++)
                {
                    if( i == n-1 )
                        sql += " ? )";
                    else
                        sql += " ?,";
                }     
                
                System.out.println( sql );
                pst = con.prepareStatement(sql);
                
                for( int i=0; i<n; i++)
                    pst.setString((i+1), data[i]);
                    int n1 = pst.executeUpdate();  
                    System.out.println(sql);
                
                if( n1 > 0)
                    b = true;
                
                    pst.close();     
                
            }//try
            catch( Exception e )
            {
                System.out.println( e );
                b = false;
            }//catch            
            
            return b;
        }
        
    String getValue( String col,String table,String whr,String comp)
	{		
            String retval = null;
		try
		{
                sql = "select " + col + " as abc from " + table + " where " + whr + " = ? ";
		pst = con.prepareStatement(sql);
                System.out.println(sql);
                pst.setString(1, comp);
				
                System.out.println(sql);
                
                rs = pst.executeQuery();
                rs.next();
                retval = rs.getString("abc");	
	
			rs.close();
                pst.close();
		}
		catch( Exception e )
		{
                    System.out.println( e );
                    System.out.println("get value");
                    return null;
		}
                System.out.println("database   " + retval);
		return retval;
	} 
        
        
        double getCal(String col,String table)
        {
            double ans = 0;
            
            try
            {
                sql = " select " + col + " from " + table;
                System.out.println(sql);
                
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();
                
                rs.next();
                ans = rs.getDouble(1);
                
                rs.close();
                pst.close();
            }
            catch( Exception e )
            {
                System.out.println( e );
                System.out.println( " In getCal method" );
                return 0.0;
            }
            
            return ans;
        }//method
        
        
        boolean deleteData( String table,String whr,String comp )
        {
            boolean success = false;
            
            try
            {
                sql = "delete from " + table + " where " + whr + " = ? ";
		pst = con.prepareStatement(sql);
                pst.setString(1, comp);
                    
                int n1 = pst.executeUpdate();
                  
                if( n1 > 0 )
                    success = true;
                    
                rs.close();
                pst.close();
            }
            catch( Exception e )
            {
		System.out.println( e );
		return false;
            }
            
            return success;
        }
        
        
        boolean deleteData( String table,String whr,String comp,String whr2,String comp2)
        {
            boolean success = false;
            
            try
            {
                sql = "delete from " + table + " where " + whr + " = ? " + " and " + whr2 + " = ? ";
		pst = con.prepareStatement(sql);
                                        
                pst.setString(1, comp);
                pst.setString(2, comp2);
                    
                System.out.println(sql + comp + comp2);
                    
                int n1 = pst.executeUpdate();
                  
                if( n1 > 0 )
                    success = true;
                    
                rs.close();
                pst.close();
            }//try
            catch( Exception e )
            {
		System.out.println( e );
		return false;
            }//catch
            
            return success;
        }//fun
		
		
	boolean updateData(String table,String col,String data,String whr,String comp)
	{
		boolean success = false;
		
		try
		{
            sql = "update " + table + " set " + col + " = ? "  + " where " + whr + " = ? ";
		    pst = con.prepareStatement(sql);
            pst.setString(1, data);
			pst.setString(2, comp);
				
            int n1 = pst.executeUpdate();
            
			if( n1 > 0 )
				success = true;
	
			rs.close();
                        pst.close();
		}
		catch( Exception e )
		{
			System.out.println( e );
			return false;
		}
		return success;
	}
        
        
        boolean insertPass(int passNo,String fullName,String dob,String pic,String adress,int pincode,String contactNo,
                            int pass_id,int proof_id,String id_no,String start_date,String end_date,float price,int renew_no  )
        {
            boolean b = false;
            
            try
            {
                sql = "insert into pass values( " + passNo + ",'" + fullName + "','" + dob + "','" + pic + "','" + adress +
                        "'," + pincode + ",'" + contactNo + "'," + pass_id + "," + proof_id + ",'" + id_no + "','" + start_date +
                        "','" + end_date + "'," + price + "," + renew_no + ")";
                
                st = con.createStatement();                
                int n1 = st.executeUpdate(sql);
                
                System.out.println(sql);
                
                if( n1 > 0)
                    b = true;
                
                pst.close();                
            }
            catch(Exception e)
            {
                System.out.println( e );
                b = false;
            }//catch
            
            return b;
        }
        
        boolean insertDeposit(int passNo,String loginID,float price,String dateTime,String paymentBy,String chaqueNo)
        {
            boolean b =false;
            
            try
            {
               sql = "insert into deposit values( " + passNo + ",'" + loginID + "'," + price + ",'" + dateTime + "','" + paymentBy +
                       "','" + chaqueNo +  "')";
                
                st = con.createStatement();                
                int n1 = st.executeUpdate(sql);
                
                System.out.println(sql);
                
                if( n1 > 0)
                    b = true;
                
                pst.close();                
            }
            catch(Exception e)
            {
                System.out.println( e );
                b = false;
            }//catch            
            
            return b;
        }//fun
        
        
        boolean insertLogin(String login_id,int proof_id,long id_no,String password,String type,String status,String join_date,
                String designation,String contact_no,String email,String security_q1,String security_q2,String ans1,String ans2)
        {
            boolean b = false;
            
            try
            {
               sql = "insert into login values( '" + login_id + "'," + proof_id  + "," + id_no + ",'" + password + "','" + type + "','" +
                        status + "','" + join_date + "','" + designation + "','" + contact_no + "','" + email + "','" + security_q1 +
                        "','" + security_q2 + "','" + ans1 + "','" + ans2 + "')";
                st = con.createStatement();                
                int n1 = st.executeUpdate(sql);
                
                System.out.println(sql);
                
                if( n1 > 0)
                    b = true;
                
                pst.close();                
            }
            catch(Exception e)
            {
                System.out.println( e );
                b = false;
            }//catch    
            
            return b;
        }//fun
        
        void setAutoComit(boolean b) throws SQLException
        {
            con.setAutoCommit(b);
        }
        
        
        void doComit() throws SQLException
        {
            con.commit();
        }
        
        void doRollback() throws SQLException
        {
            con.rollback();
        }
}//class
