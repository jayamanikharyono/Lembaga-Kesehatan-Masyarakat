/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lkmproject.model;

import java.util.ArrayList;
import java.util.List;
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
@Table(name="pasien")
public class Pasien extends Pengguna
{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private  int idPasien;
    private String keluhan;
    private List riwayatPenyakit =  new ArrayList<String>();
    int umur;

    public Pasien(int idPasien, String nama, String alamat,String jenisKelamin,int umur) {
        super(nama,alamat,jenisKelamin);
        this.idPasien = idPasien;
        this.umur=umur;
    }

    public int getIdPasien() {
        return idPasien;
    }

    public void setIdPasien(int idPasien) {
        this.idPasien = idPasien;
    }
    public void addRiwayatPenyakit(String namaPenyakit)
    {
        riwayatPenyakit.add(namaPenyakit);
    }

    public String getKeluhan() {
        return keluhan;
    }

    public void setKeluhan(String keluhan) {
        this.keluhan = keluhan;
    }
    public void setUmur(int umurMasyarakat)
    {
        if(umurMasyarakat > 0)
        {
            umur =  umurMasyarakat;
        }
        else
        {
            
        }
    }
    
}
