/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniminuto.ArqSW.MarketPlaceTurismPackage.DAO;

import co.edu.uniminuto.ArqSW.MarketPlaceTurismPackage.hibernate.HibernateUtil;
import co.edu.uniminuto.ArqSW.MarketPlaceTurismPackage.hibernate.Persona;
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

public class PersonaDAO {
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
    public PersonaDAO() {
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
    //                              Business Methods                         //
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
    // Business Methods
    //-----------------------------------------------------------------------//
    /**
     * Add new person
     *
     * @param persona
     */
    public boolean addPersona(Persona persona) {
        boolean flag = false;
        try {
            transaction = session.beginTransaction();
            session.save(persona);
            transaction.commit();
            flag = true;
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * Update new persona
     *
     * @param Persona
     */
    public boolean updatePersona(Persona persona) {
        boolean flag = false;
        try {
            transaction = session.beginTransaction();
            session.update(persona);
            transaction.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * delete especific person
     *
     * @param int identifier person
     */
    public boolean deletePersona(int idPersona) {
        boolean flag = false;
        try {
            transaction = session.beginTransaction();
            session.delete(idPersona);
            transaction.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * List of persons
     *
     * @return List <Persona>
     */
    public List<Persona> getPersonas() {
        List<Persona> misPersonas = new ArrayList<Persona>();
        try {
            transaction = session.beginTransaction();
            query = session.createQuery("from Persona");
            misPersonas = (List<Persona>) query.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return misPersonas;
    }
    //-----------------------------------------------------------------------//
    //                              Private Methods                          //
    //-----------------------------------------------------------------------// 
}
