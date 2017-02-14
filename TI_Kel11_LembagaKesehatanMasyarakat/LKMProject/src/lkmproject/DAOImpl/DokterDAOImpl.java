/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lkmproject.DAOImpl;


import java.util.List;
import lkmproject.DAO.DokterDAOInterface;
import lkmproject.model.Dokter;



public class DokterDAOImpl implements DokterDAOInterface
{

    @Override
    public void save(Dokter dokter) 
    {
        
    }

    @Override
    public Boolean delete(int idDokter) 
    {
        new PasienDAOImpl().delete(idDokter);
        return true;
        /*
        Session session = HibernateUtil.getSession();
        session.getTransaction().begin();
        Pasien pasien = (Pasien) session.get(Pasien.class, idPasien);
        if(pasien == null)
            return false;
        session.delete(pasien);
        session.getTransaction().commit();
        HibernateUtil.closeSession();
        return true;
        */
    }

    @Override
    public Boolean edit(Dokter dokter) 
    {
        //new PasienDAOImpl().edit(dokter);
        /*
        Session session = HibernateUtil.getSession();
        session.getTransaction().begin();
        session.update(pasien);
        session.getTransaction().commit();
        HibernateUtil.closeSession();
        return true;
        */
        return true;
    }

    @Override
    public List<Dokter> getAllDokter() 
    {
        /*
        Session session = HibernateUtil.getSession();
        session.getTransaction().begin();
        List<Pasien> listPasien = session.createCriteria(Pasien.class).list();
        session.getTransaction().commit();
        session.close();
        */
        //return new PasienDAOImpl().getAllPasien();
    }

    @Override
    public Dokter getDataDokter(int idDokter) 
    {
        //return new PasienDAOImpl().getDataPasien(idPasien);
        /*
        Session session = HibernateUtil.getSession();
        session.getTransaction().begin();
        Pasien pasien = (Pasien) session.get(Pasien.class, idPasien);
        session.getTransaction().commit();
        session.close();
        return pasien;
*/
    }
    
}
