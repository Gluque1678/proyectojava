

/**
 *
 * @author GERMAN
 */


    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    ArrayList<Cliente> lista=new ArrayList<>();
    Cliente c=new Cliente();
    c.setIdcliente();
    
    }

    
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
       
        //Creamos una array para almacenar los usuarios
        
        ArrayList<Cliente> lista = new ArrayList<Cliente>();
        
        //Creamos una nueva consulta
        
        Consultas con = new Consultas();
        
        con.mostrarClientes(lista);
        
        request.setAttribute("lista", lista);
        
        request.getRequestDispatcher("menu_adm.jsp").forward(request, response);
        
    }
    }

 

}
