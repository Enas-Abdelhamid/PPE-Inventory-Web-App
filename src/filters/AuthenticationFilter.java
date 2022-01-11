package filters;

import java.io.IOException;  
import javax.servlet.Filter;  
import javax.servlet.FilterChain;  
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;  
import javax.servlet.ServletException;  
import javax.servlet.ServletRequest;  
import javax.servlet.ServletResponse;  
import javax.servlet.annotation.WebFilter;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.http.HttpSession;


  
/** 
 * Servlet Filter implementation class AuthenticationFilter 
 */  
@WebFilter("/AuthenticationFilter")  
public class AuthenticationFilter implements Filter {  
  
    private ServletContext context;  
      
    public void init(FilterConfig fConfig) throws ServletException {  
        this.context = fConfig.getServletContext();  
        this.context.log("AuthenticationFilter initialized");  
    }  
       
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {  
   
        HttpServletRequest req = (HttpServletRequest) request;  
        HttpServletResponse res = (HttpServletResponse) response;  
        //String defineRole = "tammy";
        String roleToFilter = (String) request.getAttribute("defineRole");
        System.out.print(roleToFilter);
        String uri = req.getRequestURI();  
        this.context.log("Requested Resource::"+uri);  
           
        HttpSession session = req.getSession(false);  
           
        // if(session == null && !(uri.endsWith("html") || uri.endsWith("LoginServlet"))){  
        //    this.context.log("Unauthorized access request");  
        //    res.sendRedirect("userORadmin.jsp");  
       // }
        
         if(uri.endsWith("AuthenticationFilter")){ 
        	 String getRole = request.getParameter("role");
            // pass the request along the filter chain 
        	 if(getRole.equals("HSE Officer")) {
        	 RequestDispatcher dispatcher = request.getRequestDispatcher("HSE-crud.jsp");
             dispatcher.forward(request, response);  
         }
        	 else if(getRole.equals("Procurement Officer")) {
            	 RequestDispatcher dispatcher = request.getRequestDispatcher("Procurement-crud.jsp");
                 dispatcher.forward(request, response);  
             }
        	 
        	 else if(getRole.equals("Warehouse Manager")) {
             RequestDispatcher dispatcher = request.getRequestDispatcher("crud-options-authorized.jsp");
             dispatcher.forward(request, response);  
             }
        	 else {
                 RequestDispatcher dispatcher = request.getRequestDispatcher("null-authorized.jsp");
                 dispatcher.forward(request, response);  
                 }
        }  
         
    else{  
    	
        // pass the request along the filter chain  
        chain.doFilter(request, response);  
    }  
    }  
    public void destroy() {  
        //close any resources here  
    }  
    
}//End of the AuthenticationFilter class  