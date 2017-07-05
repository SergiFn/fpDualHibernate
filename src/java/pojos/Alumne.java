package pojos;
// Generated 04-jul-2017 14:07:34 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Alumne generated by hbm2java
 */
public class Alumne  implements java.io.Serializable {


     private int idUsuari;
     private Centre centre;
     private Tutor tutor;
     private Usuari usuari;
     private Date dataInici;
     private Date dataFi;
     private Set registres = new HashSet(0);

    public Alumne() {
    }

	
    public Alumne(Usuari usuari) {
        this.usuari = usuari;
    }
    public Alumne(Centre centre, Tutor tutor, Usuari usuari, Date dataInici, Date dataFi, Set registres) {
       this.centre = centre;
       this.tutor = tutor;
       this.usuari = usuari;
       this.dataInici = dataInici;
       this.dataFi = dataFi;
       this.registres = registres;
    }
   
    public int getIdUsuari() {
        return this.idUsuari;
    }
    
    public void setIdUsuari(int idUsuari) {
        this.idUsuari = idUsuari;
    }
    public Centre getCentre() {
        return this.centre;
    }
    
    public void setCentre(Centre centre) {
        this.centre = centre;
    }
    public Tutor getTutor() {
        return this.tutor;
    }
    
    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }
    public Usuari getUsuari() {
        return this.usuari;
    }
    
    public void setUsuari(Usuari usuari) {
        this.usuari = usuari;
    }
    public Date getDataInici() {
        return this.dataInici;
    }
    
    public void setDataInici(Date dataInici) {
        this.dataInici = dataInici;
    }
    public Date getDataFi() {
        return this.dataFi;
    }
    
    public void setDataFi(Date dataFi) {
        this.dataFi = dataFi;
    }
    public Set getRegistres() {
        return this.registres;
    }
    
    public void setRegistres(Set registres) {
        this.registres = registres;
    }




}

