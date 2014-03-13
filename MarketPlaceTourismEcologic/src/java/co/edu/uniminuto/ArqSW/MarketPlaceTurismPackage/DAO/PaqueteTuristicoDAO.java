/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniminuto.ArqSW.MarketPlaceTurismPackage.DAO;

import co.edu.uniminuto.ArqSW.MarketPlaceTurismPackage.hibernate.HibernateUtil;
import co.edu.uniminuto.ArqSW.MarketPlaceTurismPackage.hibernate.PaqueteTuristico;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Uniminuto 
 * Arquitectura de Software 
 * Docente: Yamid Ramirez       NRC: 3242
 * @author Cristian rodriguez   baruchneo@gmail.com         IdGenesis: 000034860
 * @author Cristian Vargas      cvarga35@uniminuto.edu.co   IdGenesis: 000164598
 * @author Yohan EspaNa         espanaqwe123@gmail.com      IdGenesis: 000127710
 * @author Wilson Lombana       sonwil1525@gmail.com        IdGenesis: 000065955
 * Marzo 2014
 */

public class PaqueteTuristicoDAO {
    //-----------------------------------------------------------------------//
    //                              Class Attributes                         //
    //-----------------------------------------------------------------------//

    /**
     * Private Session statement
     */
    private Session session;
    /**
     * Transaction operations
     */
    private Transaction transaction;
    /**
     * Querys db
     */
    private Query query;

    /**
     * Empty constructor
     */
    public PaqueteTuristicoDAO() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }

    //-----------------------------------------------------------------------//
    //                              Class Getters                            //
    //-----------------------------------------------------------------------//
    public Session getSession() {
        return session;
    }

    public Query getQuery() {
        return query;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    //-----------------------------------------------------------------------//
    //                              Class Setters                            //
    //-----------------------------------------------------------------------//
    public void setSession(Session session) {
        this.session = session;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public void setQuery(Query query) {
        this.query = query;
    }

    //-----------------------------------------------------------------------//
    //                              Business Methods                         //
    //-----------------------------------------------------------------------//
    /**
     * Add new tourism package
     *
     * @param PaqueteTuristico
     */
    public boolean addPaqueteTuristico(PaqueteTuristico object) {
        boolean flag = false;
        try {
            transaction = session.beginTransaction();
            session.save(object);
            transaction.commit();
            flag = true;
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * Update new tourism package
     *
     * @param PaqueteTuristico
     */
    public boolean updatePaqueteTuristico(PaqueteTuristico object) {
        boolean flag = false;
        try {
            transaction = session.beginTransaction();
            session.update(object);
            transaction.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * delete especific tourism package
     *
     * @param int identifier PaqueteTuristico
     */
    public boolean deletePaqueteTuristico(int id) {
        boolean flag = false;
        try {
            transaction = session.beginTransaction();
            session.delete(id);
            transaction.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * List of tourism packages Generic
     *
     * @return List <object>
     */
    public List<PaqueteTuristico> getPaqueteTuristico() {
        List<PaqueteTuristico> objectsList = new ArrayList<PaqueteTuristico>();
        try {
            transaction = session.beginTransaction();
            query = session.createQuery("from PaqueteTuristico");
            objectsList = (List<PaqueteTuristico>) query.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return objectsList;
    }
    //-----------------------------------------------------------------------//
    //                              Private Methods                          //
    //-----------------------------------------------------------------------// 
}
