package com.example.scanningerror;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;

/**
 * used with @Import
 * this should disable src/test/java scanning for @Configuration(s)
 */
@Slf4j
@TestConfiguration
public class DummyTestConfig {
	@Bean
	public Map<String, String> dummyMap() {
		log.debug("[ok] dummyMap @Bean picked up");
		return new HashMap<>();
	}
}
