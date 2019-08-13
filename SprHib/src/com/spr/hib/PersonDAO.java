package com.spr.hib;
import org.springframework.orm.hibernate4.HibernateTemplate;
public class PersonDAO {
	HibernateTemplate template;  
	public void setTemplate(HibernateTemplate template) {  
	    this.template = template;  
	}  
	public void addPerson(Person p) {
		//template.getSessionFactory().getCurrentSession().getTransaction().begin();
		template.save(p);
		template.flush();
	//;
	}
	public void updatePerson(Person p) {
	template.update(p);
	}
	public Person getPersonById(int id) {
	   Person person= (Person)template.get(Person.class, id);
		return person;
	}
	public void deletePerson(Person p) {
		template.delete(p);
	}
    public java.util.List<Person> getAll(){
	return template.loadAll(Person.class);
    }
}