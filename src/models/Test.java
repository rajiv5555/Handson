/**
 * 
 */
package models;

import java.sql.SQLException;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author M1027962
 *
 */
public class Test {

	/**
	 * @param args
	 * @throws SystemException 
	 * @throws HeuristicRollbackException 
	 * @throws HeuristicMixedException 
	 * @throws RollbackException 
	 * @throws SecurityException 
	 * @throws SQLException 
	 * @throws HibernateException 
	 */
	public static void main(String[] args) throws SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException, HibernateException, SQLException {
		Category c=new Category();
		c.setId(1);
		c.setName("vamsi");
		SessionFactory s=new Configuration().configure().buildSessionFactory();
		Session ss=s.openSession();
	     ss.beginTransaction();
		ss.save(c);
		ss.getTransaction().commit();
		ss.close();
		

	}

}
