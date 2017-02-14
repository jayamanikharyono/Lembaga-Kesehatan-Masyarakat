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
@Table(name = "dokter")
public class Dokter extends Pengguna
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDokter;
    @Column(name="tarif")
    private double tarif;
    @Column(name="tugas")
    private String tugas;
    @Column(name="ruangKerja")
    private String ruangKerja;
    @Column(name="email")
    private String email;
    

    public Dokter(int id, String nama, double tarif, String jenisKelamin,String alamat,String email,String tugas,String ruangKerja) 
    {
        super(nama,alamat,jenisKelamin);
        this.idDokter = id;
        this.tarif = tarif;
        this.email = email;
        this.tugas = tugas;
        this.ruangKerja = ruangKerja;
    }

    public int getIdDokter() {
        return idDokter;
    }

    public void setIdDokter(int idDokter) {
        this.idDokter = idDokter;
    }

    public double getTarif() {
        return tarif;
    }

    public void setTarif(double tarif) 
    {
        this.tarif =  tarif;
    }
    public void setEmail(String email)
    {
        this.email =  email;
    }
    public String getEmail()
    {
        return email;
    }

    public String getTugas() {
        return tugas;
    }

    public void setTugas(String tugas) {
        this.tugas = tugas;
    }

    public String getRuangKerja() {
        return ruangKerja;
    }

    public void setRuangKerja(String ruangKerja) {
        this.ruangKerja = ruangKerja;
    }
    
    
    
        
    
}
