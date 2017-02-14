/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lkmproject.model;

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
@Table(name="petugas")        
public class Petugas extends Pengguna
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idPetugas;

    public Petugas(int idPetugas, String nama, String alamat, String jenisKelamin) {
        super(nama, alamat, jenisKelamin);
        this.idPetugas = idPetugas;
    }
    
    public String getNamaPenyakit()
    {
        return null;
    }
    public String getNamaObat()
    {
        return  null;
    }
    
}
