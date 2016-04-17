package exam.test10;

import java.util.Map.Entry;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("exam/test10/beans.xml");
		
		Tire spareTire = (Tire)ctx.getBean("spareTire");
		for(Entry<Object, Object> entry : spareTire.getSpec().entrySet()){
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		Car car1 = (Car) ctx.getBean("car1");
		for(Entry<String, Object> entry : car1.getOptions().entrySet()){
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
	}
}
