import jvalidation.CountryCode;
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
    public void isMsisdnValidGloballyBD() {

        String countryCodeName = CountryCode.BD.name();

        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+8801834927083", countryCodeName));

        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+8801134927083", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+8801334927083", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+8801434927083", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+8801534927083", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+8801634927083", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+8801734927083", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+8801834927083", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+8801934927083", countryCodeName));

        assertFalse(PhoneNoUtils.isMsisdnValidGlobally("+8801034927083", countryCodeName));
        assertFalse(PhoneNoUtils.isMsisdnValidGlobally("+8801234927083", countryCodeName));


    }

    @Test
    public void isMsisdnValidGloballySA() {

        String countryCodeName = CountryCode.SA.name();

        //zain, mobily, stc
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+9660583334444", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+9660593334444", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+9660543334444", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+9660563334444", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+9660503334444", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+9660533334444", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+9660553334444", countryCodeName));


        //zain, mobily, stc
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+966583334444", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+966593334444", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+966543334444", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+966563334444", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+966503334444", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+966533334444", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+966553334444", countryCodeName));


        //generate from fake number
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+966505554871", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+966505555611", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+966505555242", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+966515554475", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+966515550320", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+966505557879", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+966505552610", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+966545556743", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+966585556778", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+966515554482", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+966515554009", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+966585557958", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+966515551926", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+966515557079", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+966535551112", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+966505553131", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+966545553258", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+966572550706", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+966515553692", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+966515553732", countryCodeName));

        assertFalse(PhoneNoUtils.isMsisdnValidGlobally("+966575550706", countryCodeName));

    }


    @Test
    public void isMsisdnValidGloballyIN() {

        String countryCodeName = CountryCode.IN.name();

        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+918555007408", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+917555092086", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+919755509784", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+919255537173", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+919655513749", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+918555769351", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+918555151279", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+918555469797", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+919255555659", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+919855580497", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+917555876312", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+917555527464", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+919455527739", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+917555565374", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+917555288274", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+918555664658", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+918555804585", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+919855509424", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+917555281338", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+918555215063", countryCodeName));


    }


    @Test
    public void isMsisdnValidGloballyMY() {

        String countryCodeName = CountryCode.MY.name();

        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+600102990617", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+6001131295973", countryCodeName));

        //real number of universities
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+60387277555", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+60389118468", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+60389118463", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+60389215782", countryCodeName));
        assertTrue(PhoneNoUtils.isMsisdnValidGlobally("+60355442000", countryCodeName));


    }
}