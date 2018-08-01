package org.spring.profiler.profile_sample.business;

import org.spring.profiler.profile_sample.config.AppConfig;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	/**
	 * https://www.mkyong.com/spring/spring-profiles-example/
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// activating profile via the Spring context environment.
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		// Enable a "live" profile
		context.getEnvironment().setActiveProfiles("live");
		context.register(AppConfig.class);
		context.refresh();
		// or via properties
		// System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME,
		// "dev");
		// ApplicationContext context = new
		// AnnotationConfigApplicationContext(AppConfig.class);
		((ConfigurableApplicationContext) context).close();
	}

}
