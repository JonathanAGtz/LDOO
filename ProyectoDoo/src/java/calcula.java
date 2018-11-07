import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/calcula"})
public class calcula extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            int tonelada = 1000;
            String selecion = "" ;
            String direccion  = request.getParameter("direccion" );
            
           String[] titulos = request.getParameterValues("circulo");
                for (int i = 1; i <= 4; i++) {
                switch (selecion) {
                    case "platano":
                        String platano =  (":"+ (20*tonelada) );
                        System.out.println(platano);
                        break;
                    case "manzana":
                        System.out.println(";  " + ( 30*tonelada));
                        break;
                    case "naranja":
                        System.out.println(";  " + ( 15*tonelada));
                        break;
                    default:
                        break;
                }
                }
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head></br>");
            out.println("<title>calcula</title>" );
            out.println("<body background=\"imagen/fondo.jpg\"> <style type=\"text/css\"> body { color: white; background-color:white } </style></head>");
            out.println("<body><DIV ALIGN=\"center\">");
            out.println("<h1> Tu lista es : " + Arrays.toString(titulos)+ "</h1>");
            out.println("<h1> El monto es :  " + selecion + "</h1>");
            out.println("<h1> La Dirrecion es :  " + direccion + "</h1>");
            out.println("<h4> Gracias por su compra");
            out.println("</DIV></body>");
            out.println("<DIV ALIGN=\"center\"><a href=\" index.html \" style=\"color:white;\" > <h2> &chi; </a></h2> </html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
