/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllersPackage;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 *
 * @author pierr
 */
public class CountingUsers implements HttpSessionListener {
    private int numberOfUser = 0;
    
    public void sessionCreated(HttpSessionEvent se){
        // On incremente le nombre d'utilisateur
        numberOfUser++;
        // On stocke ce nombre dans le contexte de l'application
        se.getSession().getServletContext().setAttribute("numberConnected", numberOfUser);
    }
    
    public void sessionDestroyed(HttpSessionEvent se){
        numberOfUser--;
        se.getSession().getServletContext().setAttribute("numberConnected",numberOfUser);
    }
}
