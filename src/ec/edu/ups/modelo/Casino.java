/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import com.sun.istack.internal.NotNull;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Andres
 */
@Entity
public class Casino implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
@Column
@NotNull
private int nApuestas;
@Column 
private double dinero;
@Column
private int victoriasM1;
@Column
private int derrotasM1;
@Column
private int victoriasM2;
@Column
private int derrotasM2;
@Column
private int victoriasM3;
@Column
private int derrotasM3;
@Column
private int vTotales;
@Column
private int dTotales;
@Column
private double dineroGanado;
@Column
private double dineroPerdido;

    public Casino() {
    }

    public Casino(Long id, int nApuestas, double dinero, int victoriasM1, int derrotasM1, int victoriasM2, int derrotasM2, int victoriasM3, int derrotasM3, int vTotales, int dTotales, double dineroGanado, double dineroPerdido) {
        this.id = id;
        this.nApuestas = nApuestas;
        this.dinero = dinero;
        this.victoriasM1 = victoriasM1;
        this.derrotasM1 = derrotasM1;
        this.victoriasM2 = victoriasM2;
        this.derrotasM2 = derrotasM2;
        this.victoriasM3 = victoriasM3;
        this.derrotasM3 = derrotasM3;
        this.vTotales = vTotales;
        this.dTotales = dTotales;
        this.dineroGanado = dineroGanado;
        this.dineroPerdido = dineroPerdido;
    }

    public int getnApuestas() {
        return nApuestas;
    }

    public void setnApuestas(int nApuestas) {
        this.nApuestas = nApuestas;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public int getVictoriasM1() {
        return victoriasM1;
    }

    public void setVictoriasM1(int victoriasM1) {
        this.victoriasM1 = victoriasM1;
    }

    public int getDerrotasM1() {
        return derrotasM1;
    }

    public void setDerrotasM1(int derrotasM1) {
        this.derrotasM1 = derrotasM1;
    }

    public int getVictoriasM2() {
        return victoriasM2;
    }

    public void setVictoriasM2(int victoriasM2) {
        this.victoriasM2 = victoriasM2;
    }

    public int getDerrotasM2() {
        return derrotasM2;
    }

    public void setDerrotasM2(int derrotasM2) {
        this.derrotasM2 = derrotasM2;
    }

    public int getVictoriasM3() {
        return victoriasM3;
    }

    public void setVictoriasM3(int victoriasM3) {
        this.victoriasM3 = victoriasM3;
    }

    public int getDerrotasM3() {
        return derrotasM3;
    }

    public void setDerrotasM3(int derrotasM3) {
        this.derrotasM3 = derrotasM3;
    }

    public int getvTotales() {
        return vTotales;
    }

    public void setvTotales(int vTotales) {
        this.vTotales = vTotales;
    }

    public int getdTotales() {
        return dTotales;
    }

    public void setdTotales(int dTotales) {
        this.dTotales = dTotales;
    }

    public double getDineroGanado() {
        return dineroGanado;
    }

    public void setDineroGanado(double dineroGanado) {
        this.dineroGanado = dineroGanado;
    }

    public double getDineroPerdido() {
        return dineroPerdido;
    }

    public void setDineroPerdido(double dineroPerdido) {
        this.dineroPerdido = dineroPerdido;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
        if (!(object instanceof Casino)) {
            return false;
        }
        Casino other = (Casino) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.modelo.Casino[ id=" + id + " ]";
    }
    
}
