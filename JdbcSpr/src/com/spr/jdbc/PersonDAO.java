package com.spr.jdbc;

import javax.sql.DataSource;

public interface PersonDAO {
public void setDataSource(DataSource dataSource);
public void create(int Id, String name);
public Person getPerson(int id);
public java.util.List<Person> getPersons();
public void delete(int id);
public boolean savePersonByPrepStmt(final Person p);

}
