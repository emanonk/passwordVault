package unit;

import com.manos.mypass.AdvancedEncryptionStandardService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by manoskammas on 15/11/2018.
 */
public class EncryptionUnitTest {

    AdvancedEncryptionStandardService advancedEncryptionStandardService;

    @Before
    public void setup(){
        advancedEncryptionStandardService = new AdvancedEncryptionStandardService();
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
