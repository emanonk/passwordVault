package com.manos.mypass;

import com.manos.mypass.enums.Language;
import com.manos.mypass.services.PropertiesServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertiesServiceTest {

	@Autowired
	PropertiesServiceImpl propertiesService;

	@Before
	public void setup(){

	}

	@Test
	public void propertiesTest() {

		String welcomeMessage = propertiesService.getWelcomeMessage(Language.UK);

		Assert.assertEquals("Welcome mate!", welcomeMessage);

	}

}
