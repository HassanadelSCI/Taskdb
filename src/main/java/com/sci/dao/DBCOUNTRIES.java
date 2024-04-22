package com.sci.dao;

import com.sci.models.COUNTRIES;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class DBCOUNTRIES {
    public List<COUNTRIES> get() {
        try (Session session = DBConfig.SESSION_FACTORY.openSession()) {
            return session.createQuery("FROM COUNTRIES ").list();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return null;
    }


    public COUNTRIES get(String country_id) {

        try (Session session = DBConfig.SESSION_FACTORY.openSession()) {

            return session.get(COUNTRIES.class, country_id);

        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }

        return null;
    }

    public String insert(COUNTRIES country) {

        Transaction transaction = null;
        String CountryId = null;

        try (Session session = DBConfig.SESSION_FACTORY.openSession()) {

            transaction = session.beginTransaction();

            CountryId = (String) session.save(country);

            transaction.commit();

        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            System.err.println(ex.getMessage());
        }

        return CountryId;
    }

    public void update(COUNTRIES country) {

        Transaction transaction = null;

        try (Session session = DBConfig.SESSION_FACTORY.openSession()) {

            transaction = session.beginTransaction();

            session.update(country);

            transaction.commit();

        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            System.err.println(ex.getMessage());
        }
    }

    public void delete(String CountryId) {

        Transaction transaction = null;

        try (Session session = DBConfig.SESSION_FACTORY.openSession()) {

            transaction = session.beginTransaction();

            COUNTRIES del_country = get(CountryId);

            session.delete(del_country);

            transaction.commit();

        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            System.err.println(ex.getMessage());
        }
    }
}
