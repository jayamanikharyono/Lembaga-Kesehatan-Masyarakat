/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lkmproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Jayuk
 */
@Entity
@Table(name= "Obat")
public class Obat 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idObat;
    @Column(name= "namaObat")
    private String namaObat;
    @Column(name="hargaObat")
    private double hargaObat;

    public Obat(int idObat, String namaObat, double hargaObat) {
        this.idObat = idObat;
        this.namaObat = namaObat;
        this.hargaObat = hargaObat;
    }

    public int getIdObat() {
        return idObat;
    }

    public void setIdObat(int idObat) {
        this.idObat = idObat;
    }

    public String getNamaObat() {
        return namaObat;
    }

    public void setNamaObat(String namaObat) {
        this.namaObat = namaObat;
    }

    public double getHargaObat() {
        return hargaObat;
    }

    public void setHargaObat(double harga) {
        this.hargaObat = harga;
    }
    
    
}
