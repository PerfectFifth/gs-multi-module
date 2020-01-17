package com.example.appstart;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.multimodule.service.Jack;

@SpringBootTest
public class DemoApplicationTest {

	@Autowired
	private Jack myService;

	@Test
	public void contextLoads() {
		assertThat(myService.message()).isNotNull();
	}
	
	@Test
	public void returnsCorrectValue() {
		
		
		String value = myService.value();
	
		
		
		assertEquals("Tesp", value);
	}

}
