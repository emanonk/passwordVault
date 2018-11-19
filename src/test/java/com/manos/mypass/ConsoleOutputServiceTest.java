package com.manos.mypass;

import com.manos.mypass.view.ConsoleOutput;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConsoleOutputServiceTest {

	@Autowired
	ConsoleOutput consoleOutput;

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;

	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
	}

	@After
	public void restoreStreams() {
		System.setOut(originalOut);
		System.setErr(originalErr);
	}

	@Test
	public void out() {
		System.out.print("hello");
		assertEquals("hello", outContent.toString());
	}

	@Test
	public void err() {
		System.err.print("hello again");
		assertEquals("hello again", errContent.toString());
	}

	@Test
	public void propertiesTest() {

		consoleOutput.print("Test text 1234");

		assertEquals("Test text 1234", outContent.toString());

	}

}
