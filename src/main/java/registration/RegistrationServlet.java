package registration;


import java.io.IOException;  
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.http.HttpSession;  



@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {  
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  
                    throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter(); 
        request.getRequestDispatcher("link.html").include(request, response);  
          
       
        
        
        String name =request.getParameter("namerej");  
        String password=request.getParameter("passwordrej");  
        String passwordrep=request.getParameter("passwordrepeat");  
        String email=request.getParameter("email");  
        
        
      
        
 
		if(name.isEmpty()||password.isEmpty()||passwordrep.isEmpty()||email.isEmpty())
		{
			RequestDispatcher rd = request.getRequestDispatcher("rejestracja.html");
			out.println("<font color=red>Uzpe³nij wszystkie pola</font>");
			rd.include(request, response);
		}
		
		else{
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			out.println("<font color=red>Rejestracja przebiegla pomyslnie</font>");
			rd.include(request, response);
		}
      
        
        out.close();  
    }  
 }  

