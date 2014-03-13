/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.uniminuto.ArqSW.MarketPlaceTurismPackage.servlets;

import co.edu.uniminuto.ArqSW.MarketPlaceTurismPackage.hot.authenticate.UsersAuthenticate;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Uniminuto 
 * Arquitectura de Software 
 * Docente: Yamid Ramirez       NRC: 3242
 * @author Cristian rodriguez   baruchneo@gmail.com         IdGenesis: 000034860
 * @author Cristian Vargas      cvarga35@uniminuto.edu.co   IdGenesis: 000034860
 * @author Yohan EspaNa         espanaqwe123@gmail.com      IdGenesis: 000034860
 * @author Wilson Lombana       sonwil1525@gmail.com        IdGenesis: 000065955
 * Marzo 2014
 */
@WebServlet(name = "AccesoUsuarios", urlPatterns = {"/AccesoUsuarios"})
public class AccesoUsuarios extends HttpServlet 
{

    //-----------------------------------------------------------------------//
    //                              Class Attributes                         //
    //-----------------------------------------------------------------------//  

    /**
     * Message HTML result
     */
    private String msg = "";

    //-----------------------------------------------------------------------//
    //                              Class Getters                            //
    //-----------------------------------------------------------------------//

    //-----------------------------------------------------------------------//
    //                              Class Setters                            //
    //-----------------------------------------------------------------------//

    //-----------------------------------------------------------------------//
    //                              Business Methods                         //
    //-----------------------------------------------------------------------//
    
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try 
        {
            /* TODO output your page here. You may use following sample code. */
            out.println("<html>");
            out.println("<head>");
            out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
            out.println("<link rel=\"stylesheet\" href=\"style/ClientStyle.css\">");
            out.println("<title>Marketplace Turismo Ecológico</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div id=\"fondo\">  <div>");
            out.println("<ol id=\"toc\">");
            out.println("<div  id=\"grid1\" >");
            out.println("<li><a href=\"hoteles.jsp\"><span></span></a></li>");
            out.println("</div> ");
            out.println("<div id=\"grid2\">");
            out.println("<li><a href=\"alimentacion.jsp\"><span></span></a></li>");
            out.println("</div> ");
            out.println("<div id=\"grid3\">");
            out.println("<li><a href=\"viajesEcologicos.jsp\"><span></span></a></li>");
            out.println("</div> ");
            out.println("<div id=\"grid4\">");
            out.println("<li class=\"current\"><a href=\"ofertas.jsp\"><span></span></a></li>");
            out.println("</div> ");
            out.println("<div id=\"grid5\">");
            out.println("<li><a href=\"comprar.jsp\"><span></span></a></li>");
            out.println("</div> ");
            out.println("<div id=\"grid6\">");
            out.println("<li><a href=\"preguntas.jsp\"><span></span></a></li>");
            out.println("</div> ");
            out.println("<div id=\"grid7\">");
            out.println("<li><a href=\"historial.jsp\"><span></span></a></li>");
            out.println("</div> ");
            out.println("<div id=\"grid8\">");
            out.println("<li><a href=\"buscar.jsp\"><span></span></a></li>");
            out.println("</div> ");
            out.println("<div id=\"grid9\">");
            out.println("<li><a href=\"ingresar.jsp\"><span></span></a></li>");
            out.println("</div>");
            out.println("</ol>");
            out.println("<div class=\"content\" id=\"grid\">");
            out.println("<h2>Ofertas</h2>");
            out.println("<p>"+ msg +"</p>");
            out.println("<form action=\"PersonaServlet\" method=\"post\">");
            out.println("<input type=\"submit\" name=\"consultar\" value=\"Consultar Personas\">");
            out.println("</form>");
            out.println("</div> ");
            out.println("</body>");
            out.println("</html>");
        }
        finally 
        { 
            out.close();
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="Expression servletEditorFold is undefined on line 127, column 54 in Templates/JSP_Servlet/ServletUniminuto.java.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {
        processRequest(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {
        HttpSession session = request.getSession();
        String user = request.getParameter("usuario");
        String password = request.getParameter("password");
        UsersAuthenticate userAuthenticate = new UsersAuthenticate(session);
        if(userAuthenticate.authenticate(user, password))
        {
            msg =  "<h1>USuario Autenticado como Super ADMIN</h1>";
            msg += "<h2>rol: " + request.getSession().getAttribute("role") + "</h2>"; 
        }
        else
        {
            msg = "<h1>USuario no se pudo authenticar</h1>";
        }
        
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() 
    {
        return "Short description";
    }// </editor-fold>


    //-----------------------------------------------------------------------//
    //                              Private Methods                          //
    //-----------------------------------------------------------------------//
}
