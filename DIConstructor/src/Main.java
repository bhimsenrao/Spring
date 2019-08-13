import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Employee;


public class Main {
	public static void main(String[] args) {

		  ApplicationContext context= new ClassPathXmlApplicationContext("spconfig.xml");

		  Employee emp= (Employee)context.getBean(Employee.class);
		  emp.show();
		  
	}

}
