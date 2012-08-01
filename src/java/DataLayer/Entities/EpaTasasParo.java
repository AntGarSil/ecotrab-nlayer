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
@Table(name = "epa_tasas_paro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EpaTasasParo.findAll", query = "SELECT e FROM EpaTasasParo e"),
    @NamedQuery(name = "EpaTasasParo.findByYear", query = "SELECT e FROM EpaTasasParo e WHERE e.year = :year"),
    @NamedQuery(name = "EpaTasasParo.findByProvResid", query = "SELECT e FROM EpaTasasParo e WHERE e.provResid = :provResid"),
    @NamedQuery(name = "EpaTasasParo.findBySexo", query = "SELECT e FROM EpaTasasParo e WHERE e.sexo = :sexo"),
    @NamedQuery(name = "EpaTasasParo.findByEstudGr", query = "SELECT e FROM EpaTasasParo e WHERE e.estudGr = :estudGr"),
    @NamedQuery(name = "EpaTasasParo.findByEdadGr", query = "SELECT e FROM EpaTasasParo e WHERE e.edadGr = :edadGr"),
    @NamedQuery(name = "EpaTasasParo.findByTparo", query = "SELECT e FROM EpaTasasParo e WHERE e.tparo = :tparo"),
    @NamedQuery(name = "EpaTasasParo.findById", query = "SELECT e FROM EpaTasasParo e WHERE e.id = :id")})
public class EpaTasasParo implements Serializable {
    private static final long serialVersionUID = 1L;
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
    @Column(name = "tparo")
    private double tparo;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;

    public EpaTasasParo() {
    }

    public EpaTasasParo(Integer id) {
        this.id = id;
    }

    public EpaTasasParo(Integer id, int year, int provResid, int sexo, int estudGr, int edadGr, double tparo) {
        this.id = id;
        this.year = year;
        this.provResid = provResid;
        this.sexo = sexo;
        this.estudGr = estudGr;
        this.edadGr = edadGr;
        this.tparo = tparo;
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

    public double getTparo() {
        return tparo;
    }

    public void setTparo(double tparo) {
        this.tparo = tparo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        if (!(object instanceof EpaTasasParo)) {
            return false;
        }
        EpaTasasParo other = (EpaTasasParo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DataLayer.Entities.EpaTasasParo[ id=" + id + " ]";
    }
    
}
