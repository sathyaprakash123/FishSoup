import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import org.hibernate.query.Query;

public class HiberDataClass {
	
	public static void main(String args[])
	{
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
	    
	/*	HiberTest record = new HiberTest();
		record.setName("Tommy");
		record.setAge(45);
		record.setGender("male");
		session.save(record);
		t.commit();
	*/
		HiberTest hh;
		String hql = "FROM HiberTest where age > :age";
		Query query = session.createQuery(hql);
		query.setParameter("age", 40);
		// List results = query.list();
		//System.out.println("Length of list : "+ results);
		List<HiberTest> hiberList = query.list();
		for(HiberTest hht : hiberList)
		{
			
			System.out.println(hht.getName() + "  "+ hht.getAge()+ "  "+ hht.getGender());
			
		}
		
		}
}