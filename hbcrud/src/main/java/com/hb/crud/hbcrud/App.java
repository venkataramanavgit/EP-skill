package com.hb.crud.hbcrud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public  void insert(bean b )
    {
    	 configgen cn=new configgen();
    	 cn.session.save(b);
         cn.t.commit();
         cn.session.close();
         cn.factory.close();
    }
    public void update(bean b)
	  {
		 configgen cn=new configgen();

	
	
	cn.session.update(b);
	cn.t.commit();
	System.out.println("Object Updated");
	cn.session.close();
	cn.factory.close();
	  }
    public  void delete(bean b)
	  {
		 configgen cn=new configgen();
	

	
	cn.session.delete(b);
	cn.t.commit();
	System.out.println("Object Deleted");
	cn.session.close();
	cn.factory.close();
	  }
    public  void display(bean b) {
    	
		configgen cn=new configgen();
		

		
		System.out.println(b.getId()+","+b.getName()+","+b.getEmail()+","+b.getDob()+","+b.getCourse());
		cn.t.commit();
		
		cn.session.close();
		cn.factory.close();
	}
}
