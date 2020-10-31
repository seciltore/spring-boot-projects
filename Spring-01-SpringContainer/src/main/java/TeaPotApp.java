import interfaces.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TeaPotApp {
    public static void main(String[] args) {

        //1st way:
      //  BeanFactory container = new ClassPathXmlApplicationContext("config.xml");

        //2nd way:
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Employee employee1 = container.getBean("fullTimeEmployee", Employee.class); //No need to cast

    //  Employee employee1 = (Employee) container.getBean("fullTimeEmployee");   //needs casting
        employee1.createAccount();

        Employee employee2 = (Employee) container.getBean("partTimeEmployee");
        employee2.createAccount();



    }
}
