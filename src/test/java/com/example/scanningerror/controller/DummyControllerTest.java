package com.example.scanningerror.controller;

import com.example.scanningerror.DummyTestConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(DummyController.class)
@Import(DummyTestConfig.class)
public class DummyControllerTest {
	@Autowired
	private MockMvc mvc;

	@Test
	public void helloTest() throws Exception {
		this.mvc.perform(get("/hello"))
				.andExpect(status().isOk());
	}
}
