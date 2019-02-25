/**
 * Copyright 2018 (C) Xplo
 * <p>
 * Created  : 9/8/2018
 * Author   : Xplo
 * Version  : 1.0
 * Comment  :
 */


import jvalidation.ValUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValUtilsTest {


    @Test
    public void testIsValidEmail() {


        assertTrue(ValUtils.isValidEmail("nasif.002@gmail.com"));
        assertTrue(ValUtils.isValidEmail("nasif002@gmail.com"));
        assertTrue(ValUtils.isValidEmail("nasif@gmail.com"));
        assertTrue(ValUtils.isValidEmail("nasif@gmail.org"));
        assertTrue(ValUtils.isValidEmail("002@gmail.com"));

        assertTrue(ValUtils.isValidEmail("nasif.002@yahoo.com"));
        assertTrue(ValUtils.isValidEmail("nasif.002@habi.com"));


        assertFalse(ValUtils.isValidEmail("nasif.002gmail.com"));
        assertFalse(ValUtils.isValidEmail("nasif.002@gmailcom"));
        assertFalse(ValUtils.isValidEmail(".002@gmail.com"));
        assertFalse(ValUtils.isValidEmail("nasif.002@.com"));
        assertFalse(ValUtils.isValidEmail("nasif.002@gmail.com."));
        assertFalse(ValUtils.isValidEmail("nasif.002@gmail..com"));


        //extra

        assertTrue(ValUtils.isValidEmail("email@example.com"));
        assertTrue(ValUtils.isValidEmail("firstname.lastname@example.com"));
        assertTrue(ValUtils.isValidEmail("email@subdomain.example.com"));
        assertTrue(ValUtils.isValidEmail("firstname+lastname@example.com"));
        //assertTrue(ValUtils.isValidEmail("email@123.123.123.123"));
        //assertTrue(ValUtils.isValidEmail("email@[123.123.123.123]"));
        //assertTrue(ValUtils.isValidEmail("“email”@example.com"));
        assertTrue(ValUtils.isValidEmail("1234567890@example.com"));
        assertTrue(ValUtils.isValidEmail("email@example-one.com"));
        assertTrue(ValUtils.isValidEmail("_______@example.com"));
        assertTrue(ValUtils.isValidEmail("email@example.name"));
        assertTrue(ValUtils.isValidEmail("email@example.museum"));
        assertTrue(ValUtils.isValidEmail("email@example.co.jp"));
        assertTrue(ValUtils.isValidEmail("firstname-lastname@example.com"));


        assertFalse(ValUtils.isValidEmail("plainaddress"));
        assertFalse(ValUtils.isValidEmail("#@%^%#$@#$@#.com"));
        assertFalse(ValUtils.isValidEmail("@example.com"));
        assertFalse(ValUtils.isValidEmail("Joe Smith <email@example.com>"));
        assertFalse(ValUtils.isValidEmail("email.example.com"));
        assertFalse(ValUtils.isValidEmail("email@example@example.com"));
        assertFalse(ValUtils.isValidEmail(".email@example.com"));
        assertFalse(ValUtils.isValidEmail("email.@example.com"));
        assertFalse(ValUtils.isValidEmail("email..email@example.com"));
        assertFalse(ValUtils.isValidEmail("email@example.com (Joe Smith)"));
        assertFalse(ValUtils.isValidEmail("email@example"));
        //assertFalse(ValUtils.isValidEmail("email@-example.com"));
        assertFalse(ValUtils.isValidEmail("email@111.222.333.44444"));
        assertFalse(ValUtils.isValidEmail("email@example..com"));
        assertFalse(ValUtils.isValidEmail("Abc..123@example.com"));


    }


    @Test
    public void testIsValidPhoneNo() {


        assertTrue(ValUtils.isValidPhoneNo("+8801834927083"));
        assertTrue(ValUtils.isValidPhoneNo("+8801689773843"));
        assertTrue(ValUtils.isValidPhoneNo("+8801731587447"));


        assertTrue(ValUtils.isValidPhoneNo("+7701731587447"));

        assertTrue(ValUtils.isValidPhoneNo("8801834927083"));
        assertTrue(ValUtils.isValidPhoneNo("01689773843"));
        assertTrue(ValUtils.isValidPhoneNo("8801731587447"));


        assertFalse(ValUtils.isValidPhoneNo("+88018349270833"));
        //assertFalse(ValUtils.isValidPhoneNo("+018349270833"));
        assertFalse(ValUtils.isValidPhoneNo("++8801834927083"));
        //assertFalse(ValUtils.isValidPhoneNo("1834927083"));
        assertFalse(ValUtils.isValidPhoneNo("-8801834927083"));
        assertFalse(ValUtils.isValidPhoneNo("34927083"));


    }

    @Test
    public void testIsValidPhoneNoBD() {


        //operator check
        assertTrue(ValUtils.isValidPhoneNoBD("+8801834927083"));
        assertTrue(ValUtils.isValidPhoneNoBD("+8801689773843"));
        assertTrue(ValUtils.isValidPhoneNoBD("+8801731587447"));
        assertTrue(ValUtils.isValidPhoneNoBD("+8801531587447"));

        assertTrue(ValUtils.isValidPhoneNoBD("8801834927083"));
        assertTrue(ValUtils.isValidPhoneNoBD("01689773843"));


        assertFalse(ValUtils.isValidPhoneNoBD("+7701731587447"));
        assertFalse(ValUtils.isValidPhoneNoBD("+88018349270833"));
        assertFalse(ValUtils.isValidPhoneNoBD("+18349270833"));
        assertFalse(ValUtils.isValidPhoneNoBD("+018349270833"));
        assertFalse(ValUtils.isValidPhoneNoBD("++8801834927083"));
        assertFalse(ValUtils.isValidPhoneNoBD("1834927083"));
        assertFalse(ValUtils.isValidPhoneNoBD("-8801834927083"));
        //assertFalse(ValUtils.isValidPhoneNo("34927083"));


    }

    @Test
    public void testGetPhoneNoWithoutCodeBD() {


        assertEquals("1834927083",ValUtils.getPhoneNoWithoutCodeBD("+8801834927083"));
        assertEquals("1834927083",ValUtils.getPhoneNoWithoutCodeBD("8801834927083"));
        assertEquals("1834927083",ValUtils.getPhoneNoWithoutCodeBD("01834927083"));
        assertEquals("1834927083",ValUtils.getPhoneNoWithoutCodeBD("1834927083"));

        assertEquals("1884927083",ValUtils.getPhoneNoWithoutCodeBD("1884927083"));


        assertEquals("1834927088",ValUtils.getPhoneNoWithoutCodeBD("8801834927088"));


    }

    @Test
    public void testIsValidFullName() {

        assertTrue(ValUtils.isValidFullName("Nasif Ahmed"));
        assertTrue(ValUtils.isValidFullName("NasifAhmed"));
        assertTrue(ValUtils.isValidFullName("nasif Ahmed"));
        assertTrue(ValUtils.isValidFullName("Nasif ahmed"));
        assertTrue(ValUtils.isValidFullName("Mr. Nasif Ahmed"));

        assertFalse(ValUtils.isValidFullName("1Nasif Ahmed"));
        assertFalse(ValUtils.isValidFullName("Nasif Ahmed1"));
        assertTrue(ValUtils.isValidFullName("Mr.Nasif Ahmed"));


//        assertFalse(ValUtils.isValidFullName("Nasif Ahmed."));
//        assertFalse(ValUtils.isValidFullName("NasifAhmed."));

    }

    @Test
    public void testIsValidFirstName() {

        assertTrue(ValUtils.isValidFirstName("Nasif Ahmed"));
        assertTrue(ValUtils.isValidFirstName("NasifAhmed"));
        assertTrue(ValUtils.isValidFirstName("nasif Ahmed"));
        assertTrue(ValUtils.isValidFirstName("Nasif ahmed"));
        assertTrue(ValUtils.isValidFirstName("Mr. Nasif Ahmed"));

        assertFalse(ValUtils.isValidFirstName("1Nasif Ahmed"));
        assertFalse(ValUtils.isValidFirstName("Nasif Ahmed1"));
        assertTrue(ValUtils.isValidFirstName("Mr.Nasif Ahmed"));


//        assertFalse(ValUtils.isValidFullName("Nasif Ahmed."));
//        assertFalse(ValUtils.isValidFullName("NasifAhmed."));

    }

    @Test
    public void testIsValidLastName() {

        assertTrue(ValUtils.isValidLastName("Ahmed"));
        assertTrue(ValUtils.isValidLastName("ahmed"));


        assertFalse(ValUtils.isValidLastName(" Ahmed"));
        assertFalse(ValUtils.isValidLastName("1Ahmed"));
        assertFalse(ValUtils.isValidLastName(".Ahmed"));
        assertFalse(ValUtils.isValidLastName(".Ahmed1"));


//        assertFalse(ValUtils.isValidFullName("Nasif Ahmed."));
//        assertFalse(ValUtils.isValidFullName("NasifAhmed."));

    }


}
