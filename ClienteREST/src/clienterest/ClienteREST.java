/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienterest;

import java.util.Collection;
import javax.ws.rs.core.MediaType;
import org.json.JSONObject;

/**
 *
 * @author Juan Pablo
 */
public class ClienteREST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       ClienteUsuario cliente = new ClienteUsuario();
       JSONObject json = new JSONObject();
        System.out.println(cliente.login_JSON(MediaType.APPLICATION_JSON.getClass(),"Juan@hotmail.com","password"));
    }
    
}
