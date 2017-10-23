package com.mihir.listapp.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils
{

	private static final SessionFactory sessionFactory = buildSessionFactory();

	private HibernateUtils()
	{

	}

	private static SessionFactory buildSessionFactory()
	{
		return new Configuration().configure().buildSessionFactory();
	}

	public static Session getSession()
	{
		return sessionFactory.openSession();
	}

	public void closeSession(Session session)
	{
		if (session == null)
			return;

		session.close();
	}

	public static void shutdown()
	{
		sessionFactory.close();
	}

}

/*
 * public class HibernateUtil { private static final SessionFactory
 * sessionFactory = buildSessionFactory();
 * 
 * private static SessionFactory buildSessionFactory() { try { // Create the
 * SessionFactory from hibernate.cfg.xml return new
 * AnnotationConfiguration().configure(new
 * File("hibernate.cgf.xml")).buildSessionFactory(); } catch (Throwable ex) { //
 * Make sure you log the exception, as it might be swallowed
 * System.err.println("Initial SessionFactory creation failed." + ex); throw new
 * ExceptionInInitializerError(ex); } }
 * 
 * public static SessionFactory getSessionFactory() { return sessionFactory; }
 * 
 * public static void shutdown() { // Close caches and connection pools
 * getSessionFactory().close(); } }
 */