/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lkmproject.controller;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import lkmproject.DAOImpl.DokterDAOImpl;
import lkmproject.model.Pasien;

/**
 * FXML Controller class
 *
 * @author Jayuk
 */
public class DokterController implements Initializable 
{
    
    private DokterDAOImpl dokterDao;
    @FXML
    private TableView<Pasien> listPasien;
    @FXML
    private Button selectButton;
    @FXML
    private TableColumn<Pasien,Integer> idPasien;
    @FXML
    private TableColumn<Pasien,String> nama;
    @FXML
    private TableColumn<Pasien,String> riwayatPenyakit;
    ObservableList<Pasien> data;
    
    public DokterController()
    {
        dokterDao = new DokterDAOImpl();
        listPasien = new TableView<>();
        listPasien.getSelectionModel().setCellSelectionEnabled(true);
    }
    
    public void loadData()
    {
        List<Pasien> listPasienTemp = dokterDao.getAllPasien();
        for(Pasien pasien : listPasienTemp)
        {
            System.out.println("nama :"+pasien.getNama());
        }
        data = FXCollections.observableArrayList(listPasienTemp);
        idPasien.setCellValueFactory(new PropertyValueFactory<Pasien, Integer>("idPasien"));
        nama.setCellValueFactory(new PropertyValueFactory<Pasien, String>("nama"));
        riwayatPenyakit.setCellValueFactory(new PropertyValueFactory<Pasien, String>("riwayatPenyakit"));
        listPasien.setItems(data);
        data=null;
        
    }
    
    @FXML
    public void selectButton(ActionEvent event)
    {
        ObservableList selectedCells = listPasien.getSelectionModel().getSelectedCells();
        selectedCells.addListener(new ListChangeListener() 
        {
            @Override
            public void onChanged(Change c) 
            {
                TablePosition tablePosition = (TablePosition) selectedCells.get(0);
                Pasien pasien = (Pasien) tablePosition.getTableColumn().getCellData(tablePosition.getRow());
                int temp = pasien.getIdPasien();
                dokterDao.delete(temp);
                inisialisasiAwalInputan();
                loadData();
            }
        });
    }
    private void inisialisasiAwalInputan()
    {
        idPasien.setText("");
        nama.setText("");
        riwayatPenyakit.setText("");
    }
    
    
    public void initialize(URL url, ResourceBundle rb) 
    {
        loadData();
    }    
    
}
