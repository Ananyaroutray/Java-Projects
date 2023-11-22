package com.java.jsf;

import java.text.Annotation;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class SessionHelper {
	
	static SessionFactory sessionFactory;
	public static SessionFactory getIntance() {
		if (sessionFactory==null) {
			sessionFactory= new AnnotationConfiguration().configure().buildSessionFactory();
		}
		return sessionFactory;
	}
//	public static SessionFactory getConnection() {
//		return new AnnotationConfiguration().configure().buildSessionFactory();
//	}

}
