/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginServlets;

import Login.Consultas;
import clases.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author GERMAN
 */
public class RegistrarUsuarios extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /*TODO output your page here. You may use following sample code.*/
          out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegistrarUsuarios</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegistrarUsuarios at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
       }
    }

   

    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
   
        Consultas con = new Consultas ();
        Cliente Cli = new Cliente();
        Cli.setCli_nombre(request.getParameter("nombre"));
        Cli.setCli_apellidos(request.getParameter("apellidos"));
        Cli.setCli_dirección(request.getParameter("direccion"));
        Cli.setCli_localidad(request.getParameter("localidad"));
        Cli.setCli_provincia(request.getParameter("provincia"));
        Cli.setCli_telefono(request.getParameter("telefono"));
        Cli.setCliUsuario(request.getParameter("Usuario"));
        Cli.setRol_id(Integer.parseInt(request.getParameter("rol_id")));
        Cli.setCliPassword(request.getParameter("Password"));
        Cli.setCli_dni(request.getParameter("dni"));
        Cli.setCli_sexo(request.getParameter("sexo"));
        Cli.setCli_comentario(request.getParameter("comentario"));
        
        
        if (con.registrarCliente(Cli)) {
            
            response.sendRedirect("registrarusuario.jsp");
        } else {
            
            response.sendRedirect("index.jsp");
        }
        
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
