package pojos;
// Generated 04-jul-2017 14:07:34 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Tutor generated by hbm2java
 */
public class Tutor  implements java.io.Serializable {


     private int idUsuari;
     private Usuari usuari;
     private String tecnologia;
     private Set alumnes = new HashSet(0);

    public Tutor() {
    }

	
    public Tutor(Usuari usuari) {
        this.usuari = usuari;
    }
    public Tutor(Usuari usuari, String tecnologia, Set alumnes) {
       this.usuari = usuari;
       this.tecnologia = tecnologia;
       this.alumnes = alumnes;
    }
   
    public int getIdUsuari() {
        return this.idUsuari;
    }
    
    public void setIdUsuari(int idUsuari) {
        this.idUsuari = idUsuari;
    }
    public Usuari getUsuari() {
        return this.usuari;
    }
    
    public void setUsuari(Usuari usuari) {
        this.usuari = usuari;
    }
    public String getTecnologia() {
        return this.tecnologia;
    }
    
    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }
    public Set getAlumnes() {
        return this.alumnes;
    }
    
    public void setAlumnes(Set alumnes) {
        this.alumnes = alumnes;
    }




}


