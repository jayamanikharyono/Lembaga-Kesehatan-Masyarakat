/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lkmproject.controller;

import lkmproject.model.Obat;

/**
 *
 * @author Jayuk
 */
public class ObatController 
{
    private Obat model;

    public ObatController(Obat model) {
        this.model = model;
    }
    
    public double getHargaObat()
    {
        return model.getHargaObat();
    }
    public void setHargaObat(double hargaObat)
    {
        model.setHargaObat(hargaObat);
    }
    
}
