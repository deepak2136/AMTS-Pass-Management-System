package amts;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class DataBase_Login {
    private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://localhost/amts";
    private final String USER = "root"; 
    private final String PASS = "";
    
    //private String DB_URL;
    //private String USER;
    //private String PASS = "";
    private Scanner scr;
    
    private Connection con = null;
    private ResultSet rs = null;
    private Statement st = null;
    private Date date = null;
    private DateFormat dateformat = null;
     
    private String id = "" , pw = "";
	private String sql ="";
	
	DataBase_Login()
	{
		try
		{
                    //File fd = new File(getClass().getResource("/amts/SETTING.txt").getPath().replaceAll("%20", " "));
                    //scr = new Scanner( fd );
                    //String url = null;
                    //while( scr.hasNext() )
                    //{
                        //String tmp = scr.next();
                        //if( tmp.equalsIgnoreCase("USER"))
                            //USER = scr.next();
                        //if( tmp.equalsIgnoreCase("CONNECTION"))
                          // url = scr.next();
                        //if( tmp.equalsIgnoreCase("PASSWORD"))
                            //PASS = scr.next();
                        
                        //DB_URL = "jdbc:mysql://" + url;
                    //}
                    
			Class.forName(JDBC_DRIVER);
			con = DriverManager.getConnection(DB_URL,USER,PASS);
		}
		catch( ClassNotFoundException | SQLException e )
		{
			System.out.println( e.getMessage() );
		}
                
	}
	
	String get_password( String s )
	{
		sql = "select password from login where login_id='" + s + "'";
		try
		{
			st = con.createStatement();
			rs = st.executeQuery(sql);
		
			rs.next();
			pw = rs.getString("password");

			rs.close();
			st.close();
		}
		catch( Exception e )
		{
			System.out.println( e.getMessage() );
			return "Not Found ID";
		}
		
		return pw;
	}
        
        boolean isLoginActive(String s)
        {
            sql = "select count(login_id) from login where login_id='" + s + "'";
            boolean b = false;
		try
		{
			st = con.createStatement();
			rs = st.executeQuery(sql);
		
			rs.next();
			int cnt = rs.getInt("count(login_id)");

                        if( cnt > 0 )
                            b = true;
                        System.out.println(cnt);
                        
			rs.close();
			st.close();
		}
		catch( Exception e )
		{
			System.out.println( e.getMessage() );
			return false;
		}
		
		return b;
        }
        
        
        boolean isAdmin(String s)
        {
            sql = "select type from login where login_id='" + s + "'";
            boolean b = false;
		try
		{
			st = con.createStatement();
			rs = st.executeQuery(sql);
		
			rs.next();
			pw = rs.getString("type");

			rs.close();
			st.close();
		}
		catch( Exception e )
		{
			System.out.println( e.getMessage() );
			return false;
		}
		
		if( pw.equalsIgnoreCase("admin") )
                    return true;
                else
                    return false;
        }
        
        String get_designaion(String s)
        {
            sql = "select designation from login where login_id='" + s + "'";
            String type = null;
		try
		{
			st = con.createStatement();
			rs = st.executeQuery(sql);
		
			rs.next();
			type = rs.getString("designation");

			rs.close();
			st.close();
		}
		catch( Exception e )
		{
			System.out.println( e.getMessage() );
			return "Not Found ID";
		}
		
                System.out.println(type);
		return type;
        }
	
	
	void close_connection()
	{
		try
		{
			con.close();
		}
		catch( Exception e )
		{
			System.out.println( e.getMessage() );
		}
	}
        
        String get_image_login(String log){
            
            sql = "select proof_id, id_no from login where login_id='" + log + "'";
            long n2;
            int n1;
            String s = "";
            String img = "";
            
		try
		{
			st = con.createStatement();
			rs = st.executeQuery(sql);
		
			rs.next();
                        n1 = rs.getInt("proof_id");
                        n2 = rs.getLong("id_no");
                                                
                        if( n1 == 10001 )
                        {
                            sql = "select pic from adhar_card where adhar_id=" + n2 ;             
                            rs = st.executeQuery(sql);
                            rs.next();
                            img = rs.getString("pic");
                        }
                        else if( n1 == 10002 )
                        {
                            sql = "select pic from voter_card where voter_id=" + n2 ;             
                            rs = st.executeQuery(sql);
                            rs.next();
                            img = rs.getString("pic");
                        }
                        else if( n1 == 10003 )
                        {
                            sql = "select pic from adhar_card where adhar_id=" + n2 ;             
                            rs = st.executeQuery(sql);
                            rs.next();
                            img = rs.getString("pic");
                        }
                        else if( n1 == 10008 )
                        {
                            sql = "select pic from student where adhar_id=" + n2 ;             
                            rs = st.executeQuery(sql);
                            rs.next();
                            img = rs.getString("pic");
                        }
                        else
                            img = "invalid";
                        
			rs.close();
			st.close();
                        
		}
		catch( Exception e )
		{
			System.out.println( e.getMessage() );
			return "Not Found ID";
		}		
		return img;            
        }        
        
        String get_proper_name_login( String s )
        {
            sql = "select proof_id, id_no from login where login_id='" + s + "'";
            long n2;
            int n1;
            String fname ="", mname = "" , lname= "";
            
		try
		{
			st = con.createStatement();
			rs = st.executeQuery(sql);
		
			rs.next();
                        n1 = rs.getInt("proof_id");
                        n2 = rs.getLong("id_no");
                                                
                        if( n1 == 10001 )
                        {
                            sql = "select f_name,m_name,l_name from adhar_card where adhar_id=" + n2 ;             
                            rs = st.executeQuery(sql);
                            rs.next();
                            fname = rs.getString("f_name");
                            mname = rs.getString("m_name");
                            lname = rs.getString("l_name");
                        }
                        else if( n1 == 10002 )
                        {
                            sql = "select f_name,m_name,l_name from voter_card where voter_id=" + n2 ;             
                            rs = st.executeQuery(sql);
                            rs.next();
                            fname = rs.getString("f_name");
                            mname = rs.getString("m_name");
                            lname = rs.getString("l_name");
                        }
                        else if( n1 == 10003 )
                        {
                            sql = "select f_name,m_name,l_name  from adhar_card where adhar_id=" + n2 ;             
                            rs = st.executeQuery(sql);
                            rs.next();
                             fname = rs.getString("f_name");
                            mname = rs.getString("m_name");
                            lname = rs.getString("l_name");
                        }
                        else if( n1 == 10008 )
                        {
                            sql = "select f_name,m_name,l_name  from student where adhar_id=" + n2 ;             
                            rs = st.executeQuery(sql);
                            rs.next();
                             fname = rs.getString("f_name");
                            mname = rs.getString("m_name");
                            lname = rs.getString("l_name");
                        }
                        else
                            fname = "invalid";
                        
			rs.close();
			st.close();
                        
		}
		catch( Exception e )
		{
			System.out.println( e.getMessage() );
			return "Not Found ID";
		}		
		return mname + " " + lname.charAt(0) + ". " + fname;
            
        }
        
        int get_max_pass_no()
        {
            sql = " select max(pass_no) from pass ";
            int n1 = 0;
            
            try
            {
                st = con.createStatement();
		rs = st.executeQuery(sql);
		
		rs.next();
                n1 = rs.getInt("proof_id");
                
                 rs.close();
                 st.close();
            }
            catch(Exception e)
            {
                n1 = 0;
            }  
            
            return n1;
        }
        
        boolean do_complain(String name,String complain,String email,String contact)
        {
            boolean b = false;
            int cno = 0;
            
            sql = "select max(complain_no) from complain";
            try
            {
                st = con.createStatement();
		rs = st.executeQuery(sql);
		
		rs.next();
                cno = rs.getInt("max(complain_no)");
                
                cno ++;
                System.out.println(cno);
                
                dateformat = new SimpleDateFormat("yyyy-MM-dd hh:mm:yy");
                date = new Date();
                
                sql = " insert into complain values( " + cno + ",'" + name + "','" + dateformat.format(date) + "','" + complain + "',' ','" + contact + "','" + email + "')";  
                int n = st.executeUpdate(sql);
                
                if( n != 0 )
                    b = true;
                else
                    b = false;
                
                 rs.close();
                 st.close();
            }
            catch(Exception e)
            {
                System.out.println( e.getMessage() );
                return false;
            }  
            
            return b;
        }
        
        boolean updateLogin(String logid, String cont,String mail )
        {
            boolean b = false;
            
            sql = "update login set contact_no='" + cont +"', email='" + mail +"' where login_id='" + logid + "'";
            
            try
            {
                st = con.createStatement();
                if( st.executeUpdate(sql) > 0 )
                    b = true;
		               
                 rs.close();
                 st.close();
            }
            catch(Exception e)
            {
               b = false;
               System.out.println(e.getMessage());
            }  
            
            return b;
        }
        
        boolean updatePassword(String logid, String pw1 )
        {
            boolean b = false;
            
            sql = "update login set password='" + pw1 +"' where login_id='" + logid + "'";
            
            try
            {
                st = con.createStatement();
                if( st.executeUpdate(sql) > 0 )
                    b = true;
		               
                 rs.close();
                 st.close();
            }
            catch(Exception e)
            {
               b = false;
               System.out.println(e.getMessage());
            }  
            
            return b;
        }
        
        
        Date get_dob( String logid )
        {
            sql = "select proof_id, id_no from login where login_id='" + logid + "'";
            long n2;
            int n1;
            Date dob = null;
            
		try
		{
			st = con.createStatement();
			rs = st.executeQuery(sql);
		
			rs.next();
                        n1 = rs.getInt("proof_id");
                        n2 = rs.getLong("id_no");
                                                
                        if( n1 == 10001 )
                        {
                            sql = "select dob from adhar_card where adhar_id=" + n2 ;             
                            rs = st.executeQuery(sql);
                            rs.next();                           
                        }
                        else if( n1 == 10002 )
                        {
                            sql = "select dob voter_card where voter_id=" + n2 ;             
                            rs = st.executeQuery(sql);
                            rs.next();             
                        }
                        else if( n1 == 10003 )
                        {
                            sql = "select dob from adhar_card where adhar_id=" + n2 ;             
                            rs = st.executeQuery(sql);
                            rs.next();
                        }
                        else if( n1 == 10008 )
                        {
                            sql = "select dob  from student where adhar_id=" + n2 ;             
                            rs = st.executeQuery(sql);
                            rs.next();                  
                        }
                        else
                        {
                            
                        }                   
                        
                       dob = rs.getDate("dob");
                        
			rs.close();
			st.close();
                        
		}
		catch( Exception e )
		{
			System.out.println( e.getMessage() );
			return null;
		}		
		return dob;
        }
        
        String getContact( String logid )
        {
            sql = "select contact_no from login where login_id='" + logid + "'";
            String cont = null;
            
            try
            {
                st = con.createStatement();
                rs = st.executeQuery(sql);
                
                rs.next();
                cont = rs.getString("contact_no");            
		               
                rs.close();
                st.close();
            }
            catch(Exception e)
            {
                  System.out.println(e.getMessage());
            }  
            
            return cont;
        }
        
        String getSecurityQuestion1( String logid )
        {
            sql = "select security_q1 from login where login_id='" + logid + "'";
            String cont = null;
            
            try
            {
                st = con.createStatement();
                rs = st.executeQuery(sql);
                
                rs.next();
                cont = rs.getString("security_q1");            
		               
                rs.close();
                st.close();
            }
            catch(Exception e)
            {
                  System.out.println(e.getMessage());
                  System.out.println("Method getSecurityQuestion1 in database_login");
            }  
            
            return cont;
        }
        
        String getSecurityQuestion2( String logid )
        {
            sql = "select security_q2 from login where login_id='" + logid + "'";
            String cont = null;
            
            try
            {
                st = con.createStatement();
                rs = st.executeQuery(sql);
                
                rs.next();
                cont = rs.getString("security_q2");            
		               
                rs.close();
                st.close();
            }
            catch(Exception e)
            {
                  System.out.println(e.getMessage());
                  System.out.println("Method getSecurityQuestion2 in database_login");
            }  
            
            return cont;
        }
        
        String getSecurityAnswers1( String logid )
        {
            sql = "select ans_1 from login where login_id='" + logid + "'";
            String cont = null;
            
            try
            {
                st = con.createStatement();
                rs = st.executeQuery(sql);
                
                rs.next();
                cont = rs.getString("ans_1");            
		               
                rs.close();
                st.close();
            }
            catch(Exception e)
            {
                  System.out.println(e.getMessage());
            }  
            
            return cont;
        }
        
        boolean isLoginID( String logid )
        {
            boolean b = false;
            
            sql = "select ans_1 from login where login_id='" + logid + "'";
            String cont = null;
            
            try
            {
                st = con.createStatement();
                
		               
                 rs.close();
                 st.close();
            }
            catch(Exception e)
            {
                  System.out.println(e.getMessage());
                  b = false;
            }  
            
            return b;
        }
        
        String getSecurityAnswers2( String logid )
        {
            sql = "select ans_2 from login where login_id='" + logid + "'";
            String cont = null;
            
            try
            {
                st = con.createStatement();
                rs = st.executeQuery(sql);
                
                rs.next();
                cont = rs.getString("ans_2");            
		               
                 rs.close();
                 st.close();
            }
            catch(Exception e)
            {
                  System.out.println(e.getMessage());
            }  
            
            return cont;
        }
        
        String getDesignation( String logid )
        {
            sql = "select designation from login where login_id='" + logid + "'";
            String cont = null;
            
            try
            {
                st = con.createStatement();
                rs = st.executeQuery(sql);
                
                rs.next();
                cont = rs.getString("designation");            
		               
                 rs.close();
                 st.close();
            }
            catch(Exception e)
            {
                  System.out.println(e.getMessage());
            }  
            
            return cont;
        }
        
        
        Date getJoiningDate( String logid )
        {
            sql = "select join_date from login where login_id='" + logid + "'";
            Date date = null;
            
            try
            {
                st = con.createStatement();
                rs = st.executeQuery(sql);
                
                rs.next();
                date = rs.getDate("join_date");            
		               
                 rs.close();
                 st.close();
            }
            catch(Exception e)
            {
                  System.out.println(e.getMessage());
            }  
            
            return date;
        }
        
        String getEmail( String logid )
        {
            sql = "select proof_id, id_no from login where login_id='" + logid + "'";
            long n2;
            int n1;
            String s =null;
            
		try
		{
			st = con.createStatement();
			rs = st.executeQuery(sql);
		
			rs.next();
                        n1 = rs.getInt("proof_id");
                        n2 = rs.getLong("id_no");
                                                
                        if( n1 == 10001 )
                        {
                            sql = "select mail_id from adhar_card where adhar_id=" + n2 ;             
                            rs = st.executeQuery(sql);
                            rs.next();                           
                        }
                        else if( n1 == 10002 )
                        {
                            sql = "select mail_id from voter_card where voter_id=" + n2 ;             
                            rs = st.executeQuery(sql);
                            rs.next();             
                        }
                        else if( n1 == 10003 )
                        {
                            sql = "select mail_id from adhar_card where adhar_id=" + n2 ;             
                            rs = st.executeQuery(sql);
                            rs.next();
                        }
                        else if( n1 == 10008 )
                        {
                            sql = "select mail_id from student where adhar_id=" + n2 ;             
                            rs = st.executeQuery(sql);
                            rs.next();                  
                        }
                        else
                        {
                            
                        }                   
                        
                       s = rs.getString("mail_id");
                        
			rs.close();
			st.close();
                        
		}
		catch( Exception e )
		{
			System.out.println( e );
			return null;
		}		
		return s;
        }
        
        String get_proof_table( String logid )
        {
            sql = "select proof_id from login where login_id='" + logid + "'";
            int n1 = 0;
           
		try
		{
			st = con.createStatement();
			rs = st.executeQuery(sql);
		
			rs.next();
                        n1 = rs.getInt("proof_id");                       
                                                
                        if( n1 == 10001 )
                        {
                               return "adhar_card";                  
                        }
                        else if( n1 == 10002 )
                        {
                            return "voter_card";
                        }
                        else if( n1 == 10003 )
                        {
                            return "pan_card";
                        }
                        else if( n1 == 10008 )
                        {
                            return "student";
                        }
                        else
                            sql = null;
                        
			rs.close();
			st.close();
                        
		}
		catch( Exception e )
		{
			System.out.println( e.getMessage() );
			return null;
		}		
            
            return null;
        }     
}
