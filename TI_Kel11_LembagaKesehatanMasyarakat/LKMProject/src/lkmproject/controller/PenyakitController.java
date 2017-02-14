/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lkmproject.controller;

import lkmproject.model.Penyakit;

/**
 *
 * @author Jayuk
 */
public class PenyakitController 
{
    private Penyakit model;

    public PenyakitController(Penyakit model) 
    {
        this.model = model;
    }
    
    public void setNamaPenyakit(String namaPenyakit)
    {
        model.setNamaPenyakit(namaPenyakit);
    }
    public String getNamaPenyakit()
    {
        return model.getNamaPenyakit();
    }
    public void tambahObatPenyakit(ObatController obat)
    {
        model.tambahObatPenyakit(obat);
    }
    
}
