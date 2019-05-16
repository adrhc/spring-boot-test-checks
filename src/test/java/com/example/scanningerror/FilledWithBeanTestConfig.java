package com.example.scanningerror;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Configuration
public class FilledWithBeanTestConfig {
	@Bean
	public Map<String, String> mapOfStrings() {
		log.debug("mapOfStrings @Bean picked up");
		return new HashMap<>();
	}
}
