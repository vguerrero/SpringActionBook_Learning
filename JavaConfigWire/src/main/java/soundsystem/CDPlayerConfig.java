package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//page 36
@Configuration
// implocit configuration
// @ComponentScan(basePackages = "soundsystem")
public class CDPlayerConfig {

	// explicit configuration
	@Bean
	public CompactDisc stgPeppers() {
		return new SgtPeppers();
	}

	@Bean
	public CDPlayer cdPlayer(CompactDisc cd) {
		return new CDPlayer(cd);
	}

	// @Bean
	// public CDPlayer cdPlayer() {
	// return new CDPlayer(stgPeppers());
	// }

	// @Bean
	// public CDPlayer anotherCDPlayer() {
	// return new CDPlayer(stgPeppers());
	// }
}
