package sn.groupeisi.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Employe {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idE")
    private int idE;
    @Basic
    @Column(name = "nomE")
    private String nomE;
    @Basic
    @Column(name = "prenomE")
    private String prenomE;
    @Basic
    @Column(name = "salaireE")
    private int salaireE;
    @Basic
    @Column(name = "idDepartement")

    private int idDepartement;

    public int getIdE() {
        return idE;
    }

    public void setIdE(int idE) {
        this.idE = idE;
    }

    public String getNomE() {
        return nomE;
    }

    public void setNomE(String nomE) {
        this.nomE = nomE;
    }

    public String getPrenomE() {
        return prenomE;
    }

    public void setPrenomE(String prenomE) {
        this.prenomE = prenomE;
    }

    public int getSalaireE() {
        return salaireE;
    }

    public void setSalaireE(int salaireE) {
        this.salaireE = salaireE;
    }

    public int getIdDepartement() {
        return idDepartement;
    }

    public void setIdDepartement(int idDepartement) {
        this.idDepartement = idDepartement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return idE == employe.idE && salaireE == employe.salaireE && idDepartement == employe.idDepartement && Objects.equals(nomE, employe.nomE) && Objects.equals(prenomE, employe.prenomE);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idE, nomE, prenomE, salaireE, idDepartement);
    }
}
