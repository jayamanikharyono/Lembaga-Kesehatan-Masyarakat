/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lkmproject.Driver;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Jayuk
 */
public class DokterApp extends Application
{

    @Override
    public void start(Stage stage) throws Exception 
    {
        Parent parent = FXMLLoader.load(getClass().getResource("lkmproject.view.DokterView.fxml"));
        Scene scene = new Scene(parent,1366,768);
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.show();
    }
    
}
