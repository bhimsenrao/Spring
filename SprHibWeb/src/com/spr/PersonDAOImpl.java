package com.spr;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDAOImpl implements PersonDAO {
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	@Override
	public void addPerson(Person p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		//session.close();
	}

	@Override
	public void updatePerson(Person p) {
		// TODO Auto-generated method stub
		System.out.println(p);
		Session session = this.sessionFactory.getCurrentSession();
		//session.merge(p);
		System.out.println(p);
	  session.update(p);
	  //session.close();

	}

	@Override
	public List<Person> listPersons() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Person> personsList = session.createQuery("from Person").list();
		///session.close();
		return personsList;
	}

	@Override
	public Person getPersonById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		
		Person p = (Person) session.load(Person.class, new Integer(id));
		System.out.println(p);
		//session.close();
		return p;
	}

	@Override
	public void removePerson(int id) {
		Session session=this.sessionFactory.getCurrentSession();
		session.delete(getPersonById(id));
		// TODO Auto-generated method stub
       
	}

}
