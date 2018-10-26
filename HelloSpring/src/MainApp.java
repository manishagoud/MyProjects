import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
			      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
			      HelloWorld obj = (HelloWorld) context.getBean("HelloWorld1");
			      /*HelloWorld objA = (HelloWorld) context.getBean("helloWorld");*/
			      obj.getMessage();
			      obj.getMessage1();

			      Technology objB =(Technology) context.getBean("Technology");
			      objB.getMessage();
			      objB.getMessage1();
			      objB.getMessage2();
			      
			      
			      			   
			      /*HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

			      objA.setMessage("I'm object A");
			      objA.getMessage();

			      HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
			      objB.getMessage();*/
	
	
	}

	}

