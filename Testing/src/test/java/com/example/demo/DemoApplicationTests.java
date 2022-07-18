package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Calendar;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class DemoApplicationTests {
	Calculator underTest = new Calculator();
	@Test
	void isShouldAddNumbers() {
		int firstNumber=20;
		int secoundNumber=10;
		int result = underTest.add(firstNumber,secoundNumber);

		int expected = 30;
		assertThat(result).isEqualTo(expected);
	}

	class Calculator{
		int add(int a, int b){
			return a+b;
		}
	}

}
