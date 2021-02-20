import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDao {
	public static int save(Emp e){  
        int status=0;  
        try{  
            Connection con=DBUtil.DBConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "insert into user905 values (?,?,?,?,?)");  
            ps.setLong(1,e.getId());
            ps.setString(2,e.getName());  
            ps.setString(3,e.getPassword());  
            ps.setString(4,e.getEmail());  
            ps.setString(5,e.getCountry());  
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    public static int update(Emp e) throws ClassNotFoundException, SQLException{  
        int status=0;  
      
        	Connection con=DBUtil.DBConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "update user905 set name=?,password=?,email=?,country=? where id=?");  
            ps.setString(1,e.getName());  
            ps.setString(2,e.getPassword());  
            ps.setString(3,e.getEmail());  
            ps.setString(4,e.getCountry());  
            ps.setInt(5,e.getId());  
              
            status=ps.executeUpdate();  
              
            con.close();
			return status;
    }
       
    public static int delete(int id) throws ClassNotFoundException, SQLException{  
        int status=0;  
        
        	Connection con=DBUtil.DBConnection();  
            PreparedStatement ps=con.prepareStatement( "delete from user905 where id=?");  
            ps.setInt(1,id);  
            status=ps.executeUpdate();  
              
            con.close();  
         
        return status;  
    }  
    public static Emp getEmployeeById(int id) throws ClassNotFoundException, SQLException{  
        Emp e=new Emp();  
          
       
        	Connection con=DBUtil.DBConnection();  
            PreparedStatement ps=con.prepareStatement( "select * from user905 where id=?");  
            ps.setInt(1,id);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                e.setId(rs.getInt(1));  
                e.setName(rs.getString(2));  
                e.setPassword(rs.getString(3));  
                e.setEmail(rs.getString(4));  
                e.setCountry(rs.getString(5));  
            }
            con.close();  
        
          
        return e;  
    }  
    public static List<Emp> getAllEmployees() throws ClassNotFoundException, SQLException{  
        List<Emp> list=new ArrayList<Emp>();  
          
        
        	Connection con=DBUtil.DBConnection();  
            PreparedStatement ps=con.prepareStatement("select * from user905");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Emp e=new Emp();  
                e.setId(rs.getInt(1));  
                e.setName(rs.getString(2));  
                e.setPassword(rs.getString(3));  
                e.setEmail(rs.getString(4));  
                e.setCountry(rs.getString(5));  
                list.add(e);  
            }  
            con.close();  
       
          
        return list;  
    }  

}
