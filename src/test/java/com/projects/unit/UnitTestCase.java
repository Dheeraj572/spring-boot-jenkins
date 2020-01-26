package com.projects.unit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.projects.SpringBootJenkinsApplication;

public class UnitTestCase {

	 public SpringBootJenkinsApplication fB;

	    @BeforeEach
	    public void setUp() {
	        fB = new SpringBootJenkinsApplication();
	    }

	    @DisplayName("Play FizzBuzz with number = 1")
	    @Test
	    public void testNumber() {
	        String fizzBuzz = fB.play(1);
	        Assertions.assertEquals(fizzBuzz, "1");
	    }

	    @DisplayName("Play FizzBuzz with number = 3")
	    @Test
	    public void testFizz() {
	        String fizzBuzz = fB.play(3);
	        Assertions.assertEquals(fizzBuzz, "Fizz");
	    }

	    @DisplayName("Play FizzBuzz with number = 5")
	    @Test
	    public void testBuzz() {
	        String fizzBuzz = fB.play(5);
	        Assertions.assertEquals(fizzBuzz, "Buzz");
	    }

	    @DisplayName("Don't Play FizzBuzz with number = 0")
	    @Test
	    public void testZero() {

	        Assertions.assertThrows(IllegalArgumentException.class,
	                () -> fB.play(0));
	    }

	    @AfterEach
	    public void tearDown() {
	        fB = null;
	    }
}