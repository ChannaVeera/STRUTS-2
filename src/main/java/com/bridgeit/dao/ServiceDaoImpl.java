package com.bridgeit.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bridgeit.pojo.User;
import com.bridgeit.utility.HiberneatUtil;
import com.bridgeit.utility.MailSender;

public class ServiceDaoImpl implements IServiceDao {
	private static ServiceDaoImpl serviceDaoImpl;
	private MailSender mailSender = new MailSender();
	private ServiceDaoImpl() {

	}

	public static synchronized ServiceDaoImpl getinstance() {
		if (serviceDaoImpl == null) {
			serviceDaoImpl = new ServiceDaoImpl();
			return serviceDaoImpl;
		}
		return serviceDaoImpl;
	}

	public String userReg(User user) {
		if (isUserExists(user)) {
			return null;
		}
		Session session = HiberneatUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		return user.getName();

	}

	public Boolean loginUser(String email, String password) {
		System.out.println("servicee class");
		Session session = HiberneatUtil.getSessionFactory().openSession();
		session.beginTransaction();
		String sql = " from User u where u.email=:email and u.password=:password";
		Query query = session.createQuery(sql);
		query.setParameter("email", email);
		query.setParameter("password", password);
		@SuppressWarnings("unchecked")
		List<User> list = query.list();
		if (list.size() > 0) {
			session.close();
			return true;
		}
		session.close();
		return false;
	}

	private boolean isUserExists(User user) {
		Session session = HiberneatUtil.getSessionFactory().openSession();
		boolean result = false;
		Transaction tx = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			Query query = session.createQuery("from User where email='" + user.getEmail() + "'");
			User u = (User) query.uniqueResult();
			tx.commit();
			if (u != null)
				result = true;
		} catch (Exception ex) {
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			session.close();
		}
		return result;
	}

	public Boolean forgotUser(String email) {
		Session session = HiberneatUtil.getSessionFactory().openSession();
		session.beginTransaction();
		String sql = " from User u where u.email=:email";
		Query query = session.createQuery(sql);
		query.setParameter("email", email);

		User user = (User) query.uniqueResult();
		if (user != null) {
			mailSender.sendMail(email, user.getUserId()+"enter the code to change the passcode",   "http://localhost:8080/STRUTS/setPassword.jsp");
			session.close();
			return true;
		}
		session.close();
		return false;
	}

	public Boolean setPassword(long userId, String password) {
		 Session  session=HiberneatUtil.getSessionFactory().openSession();
			User user = (User) session.get(User.class, userId);
			user.setPassword(password);
			Transaction transaction = session.beginTransaction();
			String username = (String) session.save(user);
			System.out.println("output : "+username);
			transaction.commit();
			session.close();
		return null;
	}

}
