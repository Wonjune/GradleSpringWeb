package exam.test02;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("exam/test02/beans.xml");
		
		Score score = (Score) ctx.getBean("score");
		
		System.out.println("[컨테이너에 보관된 객체의 이름 출력]");
		for(String name : ctx.getBeanDefinitionNames()){
			System.out.println(name);
		}
		
		System.out.println("[score2의 별명 출력]");
		for(String alias : ctx.getAliases("score2")){
			System.out.println(alias);
		}
		
		Score score2 = (Score) ctx.getBean("score2");
		Score score3 = (Score) ctx.getBean("score3");
		Score score4 = (Score)ctx.getBean("score4");
		Score scoreOk = (Score)ctx.getBean("score-ok!");
		
		if(score == score2) System.out.println("score == score2");
		if(score2 == score3) System.out.println("score2 == score3");
		if(score3 == score4) System.out.println("score3 == score4");
		if(score4 == scoreOk) System.out.println("score4 == scoreOk");
	}
}
