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
@Table(name = "intervalosepa_tasas_ocup")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "IntervalosepaTasasOcup.findAll", query = "SELECT i FROM IntervalosepaTasasOcup i"),
    @NamedQuery(name = "IntervalosepaTasasOcup.findById", query = "SELECT i FROM IntervalosepaTasasOcup i WHERE i.id = :id"),
    @NamedQuery(name = "IntervalosepaTasasOcup.findByYear", query = "SELECT i FROM IntervalosepaTasasOcup i WHERE i.year = :year"),
    @NamedQuery(name = "IntervalosepaTasasOcup.findBySexo", query = "SELECT i FROM IntervalosepaTasasOcup i WHERE i.sexo = :sexo"),
    @NamedQuery(name = "IntervalosepaTasasOcup.findByEstudGr", query = "SELECT i FROM IntervalosepaTasasOcup i WHERE i.estudGr = :estudGr"),
    @NamedQuery(name = "IntervalosepaTasasOcup.findByEdadGr", query = "SELECT i FROM IntervalosepaTasasOcup i WHERE i.edadGr = :edadGr"),
    @NamedQuery(name = "IntervalosepaTasasOcup.findByMinT", query = "SELECT i FROM IntervalosepaTasasOcup i WHERE i.minT = :minT"),
    @NamedQuery(name = "IntervalosepaTasasOcup.findByP20T", query = "SELECT i FROM IntervalosepaTasasOcup i WHERE i.p20T = :p20T"),
    @NamedQuery(name = "IntervalosepaTasasOcup.findByP40T", query = "SELECT i FROM IntervalosepaTasasOcup i WHERE i.p40T = :p40T"),
    @NamedQuery(name = "IntervalosepaTasasOcup.findByP60T", query = "SELECT i FROM IntervalosepaTasasOcup i WHERE i.p60T = :p60T"),
    @NamedQuery(name = "IntervalosepaTasasOcup.findByP80T", query = "SELECT i FROM IntervalosepaTasasOcup i WHERE i.p80T = :p80T"),
    @NamedQuery(name = "IntervalosepaTasasOcup.findByMaxT", query = "SELECT i FROM IntervalosepaTasasOcup i WHERE i.maxT = :maxT")})
public class IntervalosepaTasasOcup implements Serializable {
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
    @Column(name = "min_t")
    private int minT;
    @Basic(optional = false)
    @NotNull
    @Column(name = "p20_t")
    private int p20T;
    @Basic(optional = false)
    @NotNull
    @Column(name = "p40_t")
    private int p40T;
    @Basic(optional = false)
    @NotNull
    @Column(name = "p60_t")
    private int p60T;
    @Basic(optional = false)
    @NotNull
    @Column(name = "p80_t")
    private int p80T;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_t")
    private int maxT;

    public IntervalosepaTasasOcup() {
    }

    public IntervalosepaTasasOcup(Integer id) {
        this.id = id;
    }

    public IntervalosepaTasasOcup(Integer id, int year, int sexo, int estudGr, int edadGr, int minT, int p20T, int p40T, int p60T, int p80T, int maxT) {
        this.id = id;
        this.year = year;
        this.sexo = sexo;
        this.estudGr = estudGr;
        this.edadGr = edadGr;
        this.minT = minT;
        this.p20T = p20T;
        this.p40T = p40T;
        this.p60T = p60T;
        this.p80T = p80T;
        this.maxT = maxT;
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

    public int getMinT() {
        return minT;
    }

    public void setMinT(int minT) {
        this.minT = minT;
    }

    public int getP20T() {
        return p20T;
    }

    public void setP20T(int p20T) {
        this.p20T = p20T;
    }

    public int getP40T() {
        return p40T;
    }

    public void setP40T(int p40T) {
        this.p40T = p40T;
    }

    public int getP60T() {
        return p60T;
    }

    public void setP60T(int p60T) {
        this.p60T = p60T;
    }

    public int getP80T() {
        return p80T;
    }

    public void setP80T(int p80T) {
        this.p80T = p80T;
    }

    public int getMaxT() {
        return maxT;
    }

    public void setMaxT(int maxT) {
        this.maxT = maxT;
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
        if (!(object instanceof IntervalosepaTasasOcup)) {
            return false;
        }
        IntervalosepaTasasOcup other = (IntervalosepaTasasOcup) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DataLayer.Entities.IntervalosepaTasasOcup[ id=" + id + " ]";
    }
    
}
