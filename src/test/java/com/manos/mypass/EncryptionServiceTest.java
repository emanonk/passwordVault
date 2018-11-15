package com.manos.mypass;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EncryptionServiceTest {

	@Autowired
	AdvancedEncryptionStandardService advancedEncryptionStandardService;

	@Before
	public void setup(){
		advancedEncryptionStandardService.setEncryptionKey("hahahahahahahaha");
	}

	@Test
	public void encryptionDecryptTest() {

		String plainText = "helloWorld";

		String encrypt = null;
		try {
			encrypt = advancedEncryptionStandardService.encrypt(plainText);
		} catch (Exception e) {
			e.printStackTrace();
		}

		String decrypt = null;

		try {
			decrypt= advancedEncryptionStandardService.decrypt(encrypt);
		} catch (Exception e) {
			e.printStackTrace();
		}

		Assert.assertEquals(plainText,decrypt);
	}

}
