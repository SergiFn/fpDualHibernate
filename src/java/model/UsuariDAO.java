/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controlador.*;
import java.sql.ResultSet;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import pojos.Usuari;

/**
 *
 * @author sfernandeze
 */
public class UsuariDAO {
    GestorDB gestor;
    int i=0;
    public UsuariDAO(){
        gestor=new GestorDB(Constants.SERVER, Constants.PORT, Constants.BD);
    }
    public void afegirUsuari(Usuari u){
        SessionFactory sf=null;
        Session sesion=null;
        Transaction tx=null;
        try{
            sf=HibernateUtil.getSessionFactory();
            sesion=sf.openSession();
            tx=sesion.beginTransaction();
            sesion.save(u);
            tx.commit();
            sesion.close();
        }catch(Exception e){
            tx.rollback();
            throw new RuntimeException("Error usuari");
        }
    }
}
