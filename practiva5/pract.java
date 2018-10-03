import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class pract extends HttpServlet {

    @SuppressWarnings("empty-statement")
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String nombre = request.getParameter("nombre");
            String pApe = request.getParameter("pApe");
            String sApe = request.getParameter("sApe");
            String fn = request.getParameter("fn");
            String correo = request.getParameter("correo");
            String pswd = request.getParameter("pswd");;
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title> Practica 5 </title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Hola  " + nombre + pApe +  "</h1>");
            out.println(  sApe );
            out.println("<br>" + fn + "<body><br> " + correo  );
           // out.println(" tu contraseña es : </p> " + pswd )
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
