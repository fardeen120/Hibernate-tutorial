package com.tut;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
       
//        Creating student
        
        Student st= new Student();
        st.setId(101);
        st.setName("fardeen");
        st.setCity("kanpur");
        
//        creating object of address
        
        Address ad=new Address();
        ad.setStreet("chandni chowk");
        ad.setCity("Delhi");
        ad.setIsopen(true);
        ad.setAddedDate(new Date());
        ad.setX(1234.234);
        
//        Reading image
        
        FileInputStream fis=new FileInputStream("src/main/java/mypic.png");
        byte[] data = new byte[fis.available()];
        fis.read(data);
        ad.setImage(data);
        fis.close();
        
        System.out.println(st);
        
        Session session=factory.openSession();
        Transaction txn=session.beginTransaction();
        session.save(st);
        session.save(ad);
        
//        Student student=session.get(Student.class, 101);
//		System.out.println("get fetch is ");
//		System.out.println(student);
//		
//        Address address=session.load(Address.class, 1);
//        System.out.println("load");
//        System.out.println(address.getCity());
        txn.commit();
        session.close();
        System.out.println("done");
    }
}
