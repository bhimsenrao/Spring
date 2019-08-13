package com.spr.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;

public class PersonDAOImpl implements PersonDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource=dataSource;
        this.jdbcTemplateObject=new JdbcTemplate(dataSource);
	}
	@Override
	public void create(int Id, String name) {
		String SQL = "insert into Person (id,pname) values ("+Id+", '"+name+"')";
		System.out.println(SQL);
	      jdbcTemplateObject.execute(SQL);
	      System.out.println("Created Record Name = " + name + " ID = " + Id);
	}
	@Override
	public Person getPerson(int id) {
		 String SQL = "select * from Person where id = ?";
	      Person person = (Person) jdbcTemplateObject.queryForObject(SQL, new Object[]{id},
//	    		   new RowMapper<Person>() {
//
//					@Override
//					public Person mapRow(ResultSet result, int rows) throws SQLException {
//						
//						return new Person(result.getInt(1),result.getString(2));						
//					} }
	    		    new PersonMapper()
	    		  
	    		  );	      
		return person;
	}
	@Override
	public List<Person> getPersons() {
		 String SQL = "select * from Person";
	      List <Person> persons = jdbcTemplateObject.query(SQL, new PersonMapper());
		return persons;
	}
	@Override
	public void delete(int id) {
		 String SQL = "delete from Person where id = ?";
	      jdbcTemplateObject.update(SQL, id);
	      System.out.println("Deleted Record with ID = " + id );
	}
	@Override
	public boolean savePersonByPrepStmt(Person p) {
	String stmt="Insert into person values(?,?)";
		
		return jdbcTemplateObject.execute(stmt,
				new PreparedStatementCallback<Boolean>() {
			@Override
			public Boolean doInPreparedStatement(PreparedStatement pst) 
					throws SQLException, DataAccessException {
				pst.setInt(1, p.getId());
				pst.setString(2,p.getPname());
				return pst.execute();
			}
		});
	}
}