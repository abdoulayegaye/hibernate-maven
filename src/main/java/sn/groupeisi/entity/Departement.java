package sn.groupeisi.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idD")
    private int idD;
    @Basic
    @Column(name = "nomD")
    private String nomD;

    public int getIdD() {
        return idD;
    }

    public void setIdD(int idD) {
        this.idD = idD;
    }

    public String getNomD() {
        return nomD;
    }

    public void setNomD(String nomD) {
        this.nomD = nomD;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departement that = (Departement) o;
        return idD == that.idD && Objects.equals(nomD, that.nomD);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idD, nomD);
    }
}
