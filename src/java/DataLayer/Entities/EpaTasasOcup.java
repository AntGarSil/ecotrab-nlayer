/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer.Entities;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "epa_tasas_ocup")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EpaTasasOcup.findAll", query = "SELECT e FROM EpaTasasOcup e"),
    @NamedQuery(name = "EpaTasasOcup.findById", query = "SELECT e FROM EpaTasasOcup e WHERE e.id = :id"),
    @NamedQuery(name = "EpaTasasOcup.findByYear", query = "SELECT e FROM EpaTasasOcup e WHERE e.year = :year"),
    @NamedQuery(name = "EpaTasasOcup.findByProvResid", query = "SELECT e FROM EpaTasasOcup e WHERE e.provResid = :provResid"),
    @NamedQuery(name = "EpaTasasOcup.findBySexo", query = "SELECT e FROM EpaTasasOcup e WHERE e.sexo = :sexo"),
    @NamedQuery(name = "EpaTasasOcup.findByEstudGr", query = "SELECT e FROM EpaTasasOcup e WHERE e.estudGr = :estudGr"),
    @NamedQuery(name = "EpaTasasOcup.findByEdadGr", query = "SELECT e FROM EpaTasasOcup e WHERE e.edadGr = :edadGr"),
    @NamedQuery(name = "EpaTasasOcup.findByTocup", query = "SELECT e FROM EpaTasasOcup e WHERE e.tocup = :tocup")})
public class EpaTasasOcup implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "year")
    private int year;
    @Basic(optional = false)
    @NotNull
    @Column(name = "prov_resid")
    private int provResid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sexo")
    private int sexo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estud_gr")
    private int estudGr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "edad_gr")
    private int edadGr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tocup")
    private double tocup;

    public EpaTasasOcup() {
    }

    public EpaTasasOcup(Integer id) {
        this.id = id;
    }

    public EpaTasasOcup(Integer id, int year, int provResid, int sexo, int estudGr, int edadGr, double tocup) {
        this.id = id;
        this.year = year;
        this.provResid = provResid;
        this.sexo = sexo;
        this.estudGr = estudGr;
        this.edadGr = edadGr;
        this.tocup = tocup;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getProvResid() {
        return provResid;
    }

    public void setProvResid(int provResid) {
        this.provResid = provResid;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public int getEstudGr() {
        return estudGr;
    }

    public void setEstudGr(int estudGr) {
        this.estudGr = estudGr;
    }

    public int getEdadGr() {
        return edadGr;
    }

    public void setEdadGr(int edadGr) {
        this.edadGr = edadGr;
    }

    public double getTocup() {
        return tocup;
    }

    public void setTocup(double tocup) {
        this.tocup = tocup;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EpaTasasOcup)) {
            return false;
        }
        EpaTasasOcup other = (EpaTasasOcup) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DataLayer.Entities.EpaTasasOcup[ id=" + id + " ]";
    }
    
}
