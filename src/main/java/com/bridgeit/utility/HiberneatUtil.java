package com.bridgeit.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HiberneatUtil {

	private static SessionFactory sessionFactory = null;

	@SuppressWarnings("deprecation")
	public static SessionFactory getSessionFactory()
	{
	
		if(sessionFactory==null)
		{
			Configuration configuration= new Configuration().configure("hibernate.cfg.xml");
			sessionFactory=configuration.buildSessionFactory();
			
		}
		return sessionFactory;
		
	}
	
}
