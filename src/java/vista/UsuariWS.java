/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.Date;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.UsuariDAO;
import pojos.Usuari;

/**
 *
 * @author sfernandeze
 */
@WebService(serviceName = "UsuariWS")
public class UsuariWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "afegirUsuari")
    public String afegirUsuari(@WebParam(name = "NIF") String NIF, @WebParam(name = "password") String password, @WebParam(name = "nom") String nom, @WebParam(name = "primerCognom") String primerCognom, @WebParam(name = "segonCognom") String segonCognom, @WebParam(name = "dataAlta") Date dataAlta, @WebParam(name = "mail") String mail, @WebParam(name = "permisos") int permisos) {
        UsuariDAO uDAO = new UsuariDAO();
        Usuari u=new Usuari(NIF, password, nom, primerCognom, segonCognom, dataAlta, mail, permisos);
        uDAO.afegirUsuari(u);
        return "Alta Realitzada";
    }

}
