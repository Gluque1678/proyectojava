
package LoginServlets;

import clases.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author GERMAN
 */
public class RegistroUsuarios extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
       String nombre = request.getParameter("txtNombre");
       String edad = request.getParameter("txtEdad");
       
       if (nombre.equals("") || edad.equals("")){
           
           String error = "Campos vacios...";
           request.getSession().setAttribute("error",error);
           request.getRequestDispatcher("errorvista.jsp").forward(request, response);
       }
       else{
           int e=0;
           try{
           int e = Integer.parseInt(edad);
           }
           Persona p1 = new Persona(nombre,e);
           
           
       }
       }
    
    
    
    
    
    
    
    
    
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ArrayList<Cliente> lista=new ArrayList<>();
        //Consultas
        Cliente c=new Cliente();
        c.setCli_nombre("java");
        c.setCli_dni("44194765N");
        lista.add(c);
        Cliente c1=new Cliente();
        c1.setCli_id(2);
        c1.setCli_nombre("php");
        c1.setCli_dirección("America");
        lista.add(c1);
        request.setAttribute("milista",lista);
        request.getRequestDispatcher("mostrar.jsp").forward(request, response);
        //response.sendRedirect("mostrar.jsp");
            
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
