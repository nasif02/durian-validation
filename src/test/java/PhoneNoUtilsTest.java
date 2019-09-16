import jvalidation.PhoneNoUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class PhoneNoUtilsTest {

    @Test
    public void getPhoneNoWithoutCodeBD() {

        assertEquals("01834927083", PhoneNoUtils.getPhoneNoWithoutCodeBD("+8801834927083"));
        assertEquals("01834927083",PhoneNoUtils.getPhoneNoWithoutCodeBD("8801834927083"));
        assertEquals("01834927083",PhoneNoUtils.getPhoneNoWithoutCodeBD("01834927083"));


        assertNotEquals("1834927083",PhoneNoUtils.getPhoneNoWithoutCodeBD("+8801834927083"));

    }
    @Test
    public void getPhoneNoWithoutCodeKSA() {

        assertEquals("0583334444",PhoneNoUtils.getPhoneNoWithoutCodeKSA("+9660583334444"));
        assertEquals("0583334444",PhoneNoUtils.getPhoneNoWithoutCodeKSA("9660583334444"));
        assertEquals("0583334444",PhoneNoUtils.getPhoneNoWithoutCodeKSA("0583334444"));



        assertNotEquals("583334444",PhoneNoUtils.getPhoneNoWithoutCodeKSA("+9660583334444"));

    }


}