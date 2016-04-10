package exam.test03;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("exam/test03/beans.xml");
		
		Score score = (Score) ctx.getBean("exam.test03.Score");
		Score score2 = (Score) ctx.getBean("exam.test03.Score#0");
		Score score3 = (Score) ctx.getBean("exam.test03.Score#1");
		
		// class 타입으로도 객체를 꺼낼 수 있으나 익명인 경우는 어떤 객체인지 알수 없으므로 오류 발생
		Score score4 = (Score) ctx.getBean(exam.test03.Score.class);
		
		// 익명 빈이 선언된 경우 "패키지명.클래스명#번호" 형태로 이름 부여됨 ("패키지명.클래스명" 은 "패키지명.클래스명#0"의 alias)
		if(score == score2) System.out.println("score == score2");
		if(score == score3) System.out.println("score == score3");
		
		
	}
}
