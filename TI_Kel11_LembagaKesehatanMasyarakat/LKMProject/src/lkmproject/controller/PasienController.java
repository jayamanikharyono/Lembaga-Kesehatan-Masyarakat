package lkmproject.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import lkmproject.model.Pasien;

/**
 *
 * @author Jayuk
 */
public class PasienController implements Initializable
{
    private Pasien model;

    public PasienController(Pasien model) {
        this.model = model;
    }
    public void setPasienId(int idPasien)
    {
        model.setIdPasien(idPasien);
    }
    public int getMasyarakatId()
    {
        return model.getIdPasien();
    }
    
    public void setMasyarakatName(String nama)
    {
        model.setNama(nama);
    }
    public String getMasyarakatNama()
    {
        return model.getNama();
    }
    public void setMasyarakatAlamat(String alamat)
    {
        model.setAlamat(alamat);
    }
    public String getMasyarakatAlamat()
    {
        return model.getAlamat();
    }
    public void setMasyarakatKeluhan(String keluhan)
    {
        model.setKeluhan(keluhan);
    }
    public String getMasyarakatKeluhan()
    {
        return model.getKeluhan();
    }
    public void addMasyarakatRiwayatPenyakit(String namaPenyakit)
    {
        model.addRiwayatPenyakit(namaPenyakit);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
