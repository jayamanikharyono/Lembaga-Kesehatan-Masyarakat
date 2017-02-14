/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lkmproject.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lkmproject.controller.ObatController;

/**
 *
 * @author Jayuk
 */
@Entity
@Table(name = "penyakit")
public class Penyakit 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idPenyakit;
    @Column(name="namaPenyakit")
    String namaPenyakit;
    @Column(name="daftarObat")
    List daftarObat = new ArrayList<ObatController>();

    public Penyakit(int idPenyakit, String namaPenyakit) {
        this.idPenyakit = idPenyakit;
        this.namaPenyakit = namaPenyakit;
    }

    public int getIdPenyakit() {
        return idPenyakit;
    }

    public void setIdPenyakit(int idPenyakit) {
        this.idPenyakit = idPenyakit;
    }

    public String getNamaPenyakit() {
        return namaPenyakit;
    }

    public void setNamaPenyakit(String namaPenyakit) {
        this.namaPenyakit = namaPenyakit;
    }
    public void tambahObatPenyakit(ObatController obat)
    {
        daftarObat.add(obat);
    }
    
    
    
}
