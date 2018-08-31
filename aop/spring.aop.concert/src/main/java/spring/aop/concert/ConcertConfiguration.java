package spring.aop.concert;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Primary;

import aop.concert.Audience;
import aop.concert.Performance;
import aop.concert.implementations.OperaConcert;
import aop.concert.implementations.RockConcert;

@Configuration
@EnableAspectJAutoProxy
public class ConcertConfiguration {

	@Bean
	@Primary
	public Performance operaConcert() {
		return new OperaConcert();
	}

	@Bean("iloverock")
	public Performance rockConcert() {
		return new RockConcert();
	}

	// loading Audience to apply aop
	@Bean
	public Audience audience() {
		return new Audience();
	}
}
