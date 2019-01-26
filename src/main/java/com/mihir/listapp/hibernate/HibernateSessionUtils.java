package com.mihir.listapp.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/***
 * This class has all the functionality related to hibernate
 */
public class HibernateSessionUtils
{

	/**
	 * Singleton instance to be followed
	 */
	private static SessionFactory sessionFactory = null;

	public Session getSession()
	{
		if (sessionFactory == null)
		{
			sessionFactory = new Configuration().configure().buildSessionFactory();
		}
		return sessionFactory.openSession();
	}

	public void closeSession(Session session)
	{
		if (session == null)
			return;

		session.close();
	}

	public void shutdown()
	{
		sessionFactory.close();
	}

}


