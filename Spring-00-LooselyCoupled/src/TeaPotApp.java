import implementation.Employee;
import service.EmployeeAccount;
import service.FullTimeEmployee;
import service.PartTimeEmployee;

public class TeaPotApp {
    public static void main(String[] args) {

        FullTimeEmployee fullTime = new FullTimeEmployee();
     //   PartTimeEmployee partTime = new PartTimeEmployee();
        //new is not preferable, new always create new dependency.
        // Sprint fm has advantage of it. inversionOfControl IoC, create beans for next step

        EmployeeAccount employee = new EmployeeAccount(fullTime);
        employee.manageAccount();
        }

    /*
     There are 2 types of IoC Containers:
     1. Spring BeanFactory Container
     2. Spring ApplicationContext Container

     Spring BeanFactory Container:
      it is an interface, coming from springframework
      It provides basic functionality
      implementation classes: XmlBeanFactory, DefaultListableBeanFactory, SimpleJndiBeanFactory

     Spring ApplicationContext Container:
      It is interface
      Includes all the functionalities of BeanFactory
      Implementation classes: FileSystemXmlApplicationContext, ClassPathXmlApplicationContext, WebXmlApplicationContext

                                           BeanFactory Interface
                                                    ^
                                                    |     (extends)
                                      ApplicationContext Interface
                                  ^                 ^                    ^
                                 /                  |                     \    (implements)
   ClassPathXmlApplicationContext      FileSystemXmlApplicationContext    AnnotationConfigApplicationContext
              class                          Class                                Class


      Note:
          Bean is simply a Java object
          Bean is an object that is created and managed by Spring Container
          Beans are created from normal Java classes





     */
    }

     */

}