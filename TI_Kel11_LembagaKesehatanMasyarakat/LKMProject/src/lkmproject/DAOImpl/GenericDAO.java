/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lkmproject.DAOImpl;

import java.util.List;
import lkmproject.model.Pasien;
import lkmproject.model.Pengguna;
import lkmproject.util.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Jayuk
 */
public class GenericDAO <T extends Pengguna>
{
    private Class<T> type;

    public GenericDAO(Class<T> type) 
    {
        this.type = type;
    }
    
    
    public void save(T t) 
    {
        Session session = HibernateUtil.getSession();
        session.getTransaction().begin();
        session.save(t);
        session.getTransaction().commit();
        HibernateUtil.closeSession();
    }

    public Boolean delete(T t) 
    {
        Session session = HibernateUtil.getSession();
        session.getTransaction().begin();
        session.delete(t);
        session.getTransaction().commit();
        HibernateUtil.closeSession();
        return true;
    }

    public Boolean edit(T t) 
    {
        Session session = HibernateUtil.getSession();
        session.getTransaction().begin();
        session.update(t);
        session.getTransaction().commit();
        HibernateUtil.closeSession();
        return true;
    }

    public List<T> getAllPasien() 
    {
        Session session = HibernateUtil.getSession();
        session.getTransaction().begin();
        List<T> listPasien = session.createCriteria(Pasien.class).list();
        session.getTransaction().commit();
        session.close();
        return listPasien;
    }
/*
    public T getDataPasien(int idPasien) 
    {
        Session session = HibernateUtil.getSession();
        session.getTransaction().begin();
        T t = (T) session.get(T.class, idPasien);
        session.getTransaction().commit();
        session.close();
        return t;
    }
*/
}
