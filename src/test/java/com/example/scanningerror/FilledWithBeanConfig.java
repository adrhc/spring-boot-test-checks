package com.example.scanningerror;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * never used by @Import, relying only on auto detection
 */
@Slf4j
@Configuration
public class FilledWithBeanConfig {
	@Bean
	public Map<String, String> mapOfStrings() {
		log.debug("[not ok] mapOfStrings @Bean picked up");
		return new HashMap<>();
	}
}
