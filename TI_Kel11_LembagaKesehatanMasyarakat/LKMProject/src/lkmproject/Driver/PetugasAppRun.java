/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lkmproject.Driver;

import static javafx.application.Application.launch;

/**
 *
 * @author Jayuk
 */
public class PetugasAppRun implements Runnable
{
    String[] args;

    public PetugasAppRun(String[] args) {
        this.args = args;
    }
    
    
    @Override
    public void run() 
    {
        launch(PetugasApp.class,args);
    }
}
