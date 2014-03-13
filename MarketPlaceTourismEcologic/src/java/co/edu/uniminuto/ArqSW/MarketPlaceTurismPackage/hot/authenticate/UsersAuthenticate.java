/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.uniminuto.ArqSW.MarketPlaceTurismPackage.hot.authenticate;

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

public class UsersAuthenticate 
{
    //-----------------------------------------------------------------------//
    //                              Class Constants                          //
    //-----------------------------------------------------------------------//
    
    /**
     * Usuario principal de la aplicaciOn  permite crear administradores
     */
    private static final String ADMINISTRATOR_USER = "admin";
    
    /**
     * clave Usuario Principal  permite crear administradores
     */
    private static final String ADMINISTRATOR_PASSWORD = "12345678";
    
    /**
     * Rol principal permite crear administradores
     */
    private static final String ADMINISTRATOR_ROLE = "superAdmin";
    
    //-----------------------------------------------------------------------//
    //                              Class Attributes                         //
    //-----------------------------------------------------------------------//  
    
    private String user;
    
    private String password;
    
    private String role;
    
    private HttpSession session;
    
    //-----------------------------------------------------------------------//
    //                              Class Attributes                         //
    //-----------------------------------------------------------------------//
    
    /**
     * Empty Constructor
     * @param session 
     */
    public UsersAuthenticate(HttpSession session)
    {
        this.user = null;
        this.password = null;
        this.role = null;
        this.session = session;
    }
    
    /**
     * Constructor Data
     * @param user
     * @param password
     * @param session 
     */
    public UsersAuthenticate(String user, String password, HttpSession session)
    {
        this.user = user;
        this.password = password;
        this.role = null;
        this.session = session;
    }
    
    //-----------------------------------------------------------------------//
    //                              Class Getters                            //
    //-----------------------------------------------------------------------//

    public String getUser() 
    {
        return user;
    }

    public String getPassword() 
    {
        return password;
    }

    public String getRole() 
    {
        return role;
    }

    public HttpSession getSession() 
    {
        return session;
    }
    
    //-----------------------------------------------------------------------//
    //                              Class Setters                            //
    //-----------------------------------------------------------------------//

    //-----------------------------------------------------------------------//
    //                              Business Methods                         //
    //-----------------------------------------------------------------------//
    public boolean authenticate(String user, String password)
    {
        //athenticate how to Super admin
        if(user == UsersAuthenticate.ADMINISTRATOR_USER && password == UsersAuthenticate.ADMINISTRATOR_PASSWORD)
        {
            session.setAttribute("user", user);
            session.setAttribute("role", role);
            return true;
        }
        else
        {
            return false;
        }
    }
    //-----------------------------------------------------------------------//
    //                              Private Methods                          //
    //-----------------------------------------------------------------------//

    

    
}
