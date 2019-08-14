package com.spr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spr.Person;
import com.spr.PersonDAO;

@Service
	public class PersonServiceImpl implements PersonService {
		private PersonDAO personDAO;

		public PersonDAO getPersonDAO() {
			return personDAO;
		}

		public void setPersonDAO(PersonDAO personDAO) {
			this.personDAO = personDAO;
		}

		@Override
		@Transactional
		public void addPerson(Person p) {
			this.personDAO.addPerson(p);
		}

		@Override
		@Transactional
		public void updatePerson(Person p) {
			this.personDAO.updatePerson(p);
		}

		@Override
		@Transactional
		public java.util.List<Person> listPersons() {
			return this.personDAO.listPersons();
		}

		@Override
		@Transactional
		public Person getPersonById(int id) {
			return this.personDAO.getPersonById(id);
		}

		@Override
		@Transactional
		public void removePerson(int id) {
			this.personDAO.removePerson(id);
		}

	}

