package org.spring.profiler.profile_sample.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/***
 * https://www.mkyong.com/spring/spring-profiles-example/
 * 
 * @author victor
 *
 */
@Configuration
@EnableCaching
@ComponentScan({ "org.spring.profiler.*" })
public class AppConfig {

}
