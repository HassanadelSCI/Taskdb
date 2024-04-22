package com.sci.dao;


import java.util.Date;
import java.util.List;


import com.sci.models.JobHistory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class DBJobHistory {
    public List<JobHistory> get() {

        try (Session session = DBConfig.SESSION_FACTORY.openSession()) {

            return session.createQuery("FROM JobHistory").list();

        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }

        return null;
    }

    public JobHistory get(Integer employeeId, Date startDate) {
        try (Session session = DBConfig.SESSION_FACTORY.openSession()) {
            Query<JobHistory> query = session.createQuery(
                    "FROM JobHistory j WHERE j.employeeId = :employeeId AND j.startDate = :startDate",
                    JobHistory.class
            );
            query.setParameter("employeeId", employeeId);
            query.setParameter("startDate", startDate);

            return query.uniqueResult();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return null;
    }

    public void insert(JobHistory job) {

        Transaction transaction = null;

        try (Session session = DBConfig.SESSION_FACTORY.openSession()) {

            transaction = session.beginTransaction();

            session.save(job);

            transaction.commit();

        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            System.err.println(ex.getMessage());
        }
    }

    public void update(JobHistory job) {

        Transaction transaction = null;

        try (Session session = DBConfig.SESSION_FACTORY.openSession()) {

            transaction = session.beginTransaction();

            session.update(job);

            transaction.commit();

        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            System.err.println(ex.getMessage());
        }
    }

    public void delete(Integer employeeId, Date startDate) {

        Transaction transaction = null;

        try (Session session = DBConfig.SESSION_FACTORY.openSession()) {

            transaction = session.beginTransaction();

            JobHistory job = get(employeeId, startDate);

            session.delete(job);

            transaction.commit();

        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            System.err.println(ex.getMessage());
        }
    }


}
