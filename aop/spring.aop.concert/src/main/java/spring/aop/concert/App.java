package spring.aop.concert;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import aop.concert.Performance;

/**
 * @author Victor Guerrero
 * @page 109
 */
public class App {
	public static void main(String[] args) {
		// load context from java config class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConcertConfiguration.class);
		Performance performance = context.getBean(Performance.class);
		// Performance performance = (RockConcert) context.getBean("iloverock");
		try {
			performance.perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		context.close();
	}
}
