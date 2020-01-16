package tocba2020.definebusinessrule.define.persistence.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import tocba2020.definebusinessrule.define.domain.businessrules.BusinessRule;

public class HibernateDatabase {

	public void storeBusinessRule(BusinessRule businessRule) {		
		Configuration config = new Configuration();
		
		config.setProperty("hibernate.connection.driver_class", "oracle.jdbc.OracleDriver");
		config.setProperty("hibernate.connection.url", "jdbc:oracle:thin:@//ondora04.hu.nl:8521/EDUC21");
		config.setProperty("hibernate.connection.username", "TOSAD");
		config.setProperty("hibernate.connection.password", "tosadgroep6");
		config.setProperty("hibernate.dialect", "org.hibernate.dialect.Oracle8iDialect");
		
		config.addAnnotatedClass(BusinessRule.class);
		
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(businessRule);
		
		transaction.commit();
		session.close();
		sessionFactory.close();
	}
}
