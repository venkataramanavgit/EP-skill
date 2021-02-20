

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditServlet2
 */
@WebServlet("/EditServlet2")
public class EditServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	          
	        String sid=request.getParameter("id");  
	        int id=Integer.parseInt(sid);  
	        String name=request.getParameter("name");  
	        String password=request.getParameter("password");  
	        String email=request.getParameter("email");  
	        String country=request.getParameter("country");  
	          
	        Emp e=new Emp();  
	        e.setId(id);  
	        e.setName(name);  
	        e.setPassword(password);  
	        e.setEmail(email);  
	        e.setCountry(country);  
	          
	        int status;
			try {
				status = EmpDao.update(e);
				if(status>0){  
		            response.sendRedirect("ViewServlet");  
		        }else{  
		            out.println("Sorry! unable to update record");  
		        }  
		          
		        out.close();  
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}  
	        
	    }  

}
