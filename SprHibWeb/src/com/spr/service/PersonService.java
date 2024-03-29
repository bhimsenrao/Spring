package com.spr.service;

import java.util.List;

import com.spr.Person;

public interface PersonService {

	void addPerson(Person p);

	void updatePerson(Person p);

	List<Person> listPersons();

	Person getPersonById(int id);

	void removePerson(int id);

}
