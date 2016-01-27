package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;;

@SuppressWarnings("deprecation")
public class HibernateUtil {
	public static final SessionFactory sessionFactory;
	
	static{
		try {
			sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		} catch (Throwable e) {
			System.out.println("creation session factory echoue." + e.getMessage());
			throw new ExceptionInInitializerError(e);
		}
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	

}
