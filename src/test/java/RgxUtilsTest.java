/**
 * Copyright 2018 (C) Xplo
 * <p>
 * Created  : 9/8/2018
 * Author   : Xplo
 * Version  : 1.0
 * Comment  :
 */

import jvalidation.RgxUtils;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RgxUtilsTest {


    @Test
    public void testRegx() {

        String REGX = RgxUtils.RGX_EMAIL;

        //assertTrue(RgxUtils.isMatch("", REGX));

        //assertFalse(RgxUtils.isMatch("", REGX));


    }


    @Test
    public void testRegxEmail() {


        String REGX = RgxUtils.RGX_EMAIL;

        //mine
        assertTrue(RgxUtils.isMatch("nasif.002@gmail.com", REGX));
        assertTrue(RgxUtils.isMatch("nasif002@gmail.com", REGX));
        assertTrue(RgxUtils.isMatch("nasif@gmail.com", REGX));
        assertTrue(RgxUtils.isMatch("nasif@gmail.org", REGX));
        assertTrue(RgxUtils.isMatch("002@gmail.com", REGX));
        assertTrue(RgxUtils.isMatch("nasif.002@yahoo.com", REGX));
        assertTrue(RgxUtils.isMatch("nasif.002@habi.com", REGX));


        assertFalse(RgxUtils.isMatch("nasif.002gmail.com", REGX));
        assertFalse(RgxUtils.isMatch("nasif.002@gmailcom", REGX));
        assertFalse(RgxUtils.isMatch(".002@gmail.com", REGX));
        assertFalse(RgxUtils.isMatch("nasif.002@.com", REGX));
        assertFalse(RgxUtils.isMatch("nasif.002@gmail.com.", REGX));
        assertFalse(RgxUtils.isMatch("nasif.002@gmail..com", REGX));


        //extra
        assertTrue(RgxUtils.isMatch("email@example.com", REGX));
        assertTrue(RgxUtils.isMatch("firstname.lastname@example.com", REGX));
        assertTrue(RgxUtils.isMatch("email@subdomain.example.com", REGX));
        assertTrue(RgxUtils.isMatch("firstname+lastname@example.com", REGX));
        //assertTrue(RgxUtils.isMatch("email@123.123.123.123", REGX));
//        assertTrue(RgxUtils.isMatch("email@[123.123.123.123]", REGX));
        // assertTrue(RgxUtils.isMatch("“email”@example.com", REGX));
        assertTrue(RgxUtils.isMatch("1234567890@example.com", REGX));
        assertTrue(RgxUtils.isMatch("email@example-one.com", REGX));
        assertTrue(RgxUtils.isMatch("_______@example.com", REGX));
        assertTrue(RgxUtils.isMatch("email@example.name", REGX));
        assertTrue(RgxUtils.isMatch("email@example.museum", REGX));
        assertTrue(RgxUtils.isMatch("email@example.co.jp", REGX));
        assertTrue(RgxUtils.isMatch("firstname-lastname@example.com", REGX));


        assertFalse(RgxUtils.isMatch("plainaddress", REGX));
        assertFalse(RgxUtils.isMatch("#@%^%#$@#$@#.com", REGX));
        assertFalse(RgxUtils.isMatch("@example.com", REGX));
        assertFalse(RgxUtils.isMatch("Joe Smith <email@example.com>", REGX));
        assertFalse(RgxUtils.isMatch("email.example.com", REGX));
        assertFalse(RgxUtils.isMatch("email@example@example.com", REGX));
        assertFalse(RgxUtils.isMatch(".email@example.com", REGX));
        assertFalse(RgxUtils.isMatch("email.@example.com", REGX));
        assertFalse(RgxUtils.isMatch("email..email@example.com", REGX));
        assertFalse(RgxUtils.isMatch("あいうえお@example.com", REGX));
        assertFalse(RgxUtils.isMatch("email@example.com (Joe Smith)", REGX));
        assertFalse(RgxUtils.isMatch("email@example", REGX));
        //assertFalse(RgxUtils.isMatch("email@-example.com", REGX));
        //assertFalse(RgxUtils.isMatch("email@example.web", REGX));
        assertFalse(RgxUtils.isMatch("email@111.222.333.44444", REGX));
        assertFalse(RgxUtils.isMatch("email@example..com", REGX));
        assertFalse(RgxUtils.isMatch("Abc..123@example.com", REGX));


    }


    @Test
    public void testIsValidPhoneNo() {


        String REGX = RgxUtils.RGX_PHONE_NO_INTERNATIONAL;

        assertTrue(RgxUtils.isMatch("+8801834927083", REGX));
        assertTrue(RgxUtils.isMatch("+8801689773843", REGX));
        assertTrue(RgxUtils.isMatch("+8801731587447", REGX));


        assertTrue(RgxUtils.isMatch("+7701731587447", REGX));

        assertTrue(RgxUtils.isMatch("8801834927083", REGX));
        assertTrue(RgxUtils.isMatch("01689773843", REGX));
        assertTrue(RgxUtils.isMatch("8801731587447", REGX));


        assertFalse(RgxUtils.isMatch("+88018349270833", REGX));
        //assertFalse(RgxUtils.isMatch("+018349270833",REGX));
        assertFalse(RgxUtils.isMatch("++8801834927083", REGX));
        //assertFalse(RgxUtils.isMatch("1834927083",REGX));
        assertFalse(RgxUtils.isMatch("-8801834927083", REGX));
        assertFalse(RgxUtils.isMatch("34927083", REGX));


    }

    @Test
    public void testIsValidPhoneNoBD() {

        String REGX = RgxUtils.RGX_PHONE_NO_BD;

        //operator check
        assertTrue(RgxUtils.isMatch("+8801834927083", REGX));
        assertTrue(RgxUtils.isMatch("+8801689773843", REGX));
        assertTrue(RgxUtils.isMatch("+8801731587447", REGX));
        assertTrue(RgxUtils.isMatch("+8801531587447", REGX));

        assertTrue(RgxUtils.isMatch("8801834927083", REGX));
        assertTrue(RgxUtils.isMatch("01689773843", REGX));


        assertFalse(RgxUtils.isMatch("+7701731587447", REGX));
        assertFalse(RgxUtils.isMatch("+88018349270833", REGX));
        assertFalse(RgxUtils.isMatch("+18349270833", REGX));
        assertFalse(RgxUtils.isMatch("+018349270833", REGX));
        assertFalse(RgxUtils.isMatch("++8801834927083", REGX));
        assertFalse(RgxUtils.isMatch("1834927083", REGX));
        assertFalse(RgxUtils.isMatch("-8801834927083", REGX));
        //assertFalse(RgxUtils.isValidPhoneNo("34927083",REGX));


    }

    @Test
    public void testRegxFullNameOrFirstName() {

        String REGX = RgxUtils.RGX_FULL_NAME_OR_FIRST_NAME;

        assertTrue(RgxUtils.isMatch("Nasif Ahmed", REGX));
        assertTrue(RgxUtils.isMatch("NasifAhmed", REGX));
        assertTrue(RgxUtils.isMatch("nasif Ahmed", REGX));
        assertTrue(RgxUtils.isMatch("Nasif ahmed", REGX));
        assertTrue(RgxUtils.isMatch("Mr. Nasif Ahmed", REGX));

        assertFalse(RgxUtils.isMatch("1Nasif Ahmed", REGX));
        assertFalse(RgxUtils.isMatch("Nasif Ahmed1", REGX));
        assertTrue(RgxUtils.isMatch("Mr.Nasif Ahmed", REGX));


//        assertFalse(RgxUtils.isMatch("Nasif Ahmed.",REGX));
//        assertFalse(RgxUtils.isMatch("NasifAhmed.",REGX));

    }


    @Test
    public void testRegxLastName() {

        String REGX = RgxUtils.RGX_LAST_NAME;

        assertTrue(RgxUtils.isMatch("Ahmed", REGX));
        assertTrue(RgxUtils.isMatch("ahmed", REGX));


        assertFalse(RgxUtils.isMatch(" Ahmed", REGX));
        assertFalse(RgxUtils.isMatch("1Ahmed", REGX));
        assertFalse(RgxUtils.isMatch(".Ahmed", REGX));
        assertFalse(RgxUtils.isMatch(".Ahmed1", REGX));


//        assertFalse(RgxUtils.isValidFullName("Nasif Ahmed.",REGX));
//        assertFalse(RgxUtils.isValidFullName("NasifAhmed.",REGX));

    }


    @Test
    public void testRegxUsername() {


        String REGX = RgxUtils.RGX_USERNAME;

        assertTrue(RgxUtils.isMatch("nas", RgxUtils.RGX_USERNAME));
        assertTrue(RgxUtils.isMatch("xplo", RgxUtils.RGX_USERNAME));
        assertTrue(RgxUtils.isMatch("nasif.02", RgxUtils.RGX_USERNAME));
        assertTrue(RgxUtils.isMatch("nasif02", RgxUtils.RGX_USERNAME));

        assertFalse(RgxUtils.isMatch("nasif@02", RgxUtils.RGX_USERNAME));
        assertFalse(RgxUtils.isMatch("nasif#02", RgxUtils.RGX_USERNAME));
        assertFalse(RgxUtils.isMatch(".nasif02", RgxUtils.RGX_USERNAME));
        assertFalse(RgxUtils.isMatch("1nasif02", RgxUtils.RGX_USERNAME));
        assertFalse(RgxUtils.isMatch("na", RgxUtils.RGX_USERNAME));

    }


    @Test
    public void testRegxDate() {


        String REGX = RgxUtils.RGX_DATE_DMY;

        assertTrue(RgxUtils.isMatch("01/01/2000", REGX));
        assertTrue(RgxUtils.isMatch("01/1/2000", REGX));
        assertTrue(RgxUtils.isMatch("01/1/01", REGX));
        assertTrue(RgxUtils.isMatch("29/02/2000", REGX));
        assertTrue(RgxUtils.isMatch("28/02/2001", REGX));


        assertFalse(RgxUtils.isMatch("32/01/2000", REGX));
        assertFalse(RgxUtils.isMatch("31/09/2000", REGX));
        assertFalse(RgxUtils.isMatch("01/15/2000", REGX));
        assertFalse(RgxUtils.isMatch("31/04/2000", REGX));
        assertFalse(RgxUtils.isMatch("29/02/2001", REGX));


    }

    @Test
    public void testRegxUrlNoFTP() {

        String REGX = RgxUtils.RGX_URL_NO_FTP;

        assertTrue(RgxUtils.isMatch("http://www.google.com", REGX));
        assertTrue(RgxUtils.isMatch("www.facebook.com", REGX));
        assertTrue(RgxUtils.isMatch("www.fb.com", REGX));
        //assertTrue(RgxUtils.isMatch("ftp://ftp.bogus.com/~some/path/to/a/file.txt", REGX));

        assertTrue(RgxUtils.isMatch("http://www.site.com", REGX));
        assertTrue(RgxUtils.isMatch("https://www.site.com", REGX));
        assertTrue(RgxUtils.isMatch("http://site.com", REGX));
        assertTrue(RgxUtils.isMatch("https://site.com", REGX));
        assertTrue(RgxUtils.isMatch("http://domain.site.com", REGX));
        assertTrue(RgxUtils.isMatch("https://domain.site.com", REGX));
        assertTrue(RgxUtils.isMatch("http://www.domain.site.com", REGX));
        assertTrue(RgxUtils.isMatch("https://www.domain.site.com", REGX));
        assertTrue(RgxUtils.isMatch("site.com", REGX));
        assertTrue(RgxUtils.isMatch("domain.site.com", REGX));
        assertTrue(RgxUtils.isMatch("http://www.site.com/path/to/dir/", REGX));
        assertTrue(RgxUtils.isMatch("https://www.site.com/path/to/dir/", REGX));
        assertTrue(RgxUtils.isMatch("http://site.com/path/to/dir/", REGX));
        assertTrue(RgxUtils.isMatch("https://site.com/path/to/dir/", REGX));
        assertTrue(RgxUtils.isMatch("http://domain.site.com/path/to/dir/", REGX));
        assertTrue(RgxUtils.isMatch("https://domain.site.com/path/to/dir/", REGX));
        assertTrue(RgxUtils.isMatch("http://www.domain.site.com/path/to/dir/", REGX));
        assertTrue(RgxUtils.isMatch("https://www.domain.domain.site.com/path/to/dir/", REGX));
        assertTrue(RgxUtils.isMatch("site.com/path/to/dir/", REGX));
        assertTrue(RgxUtils.isMatch("domain.site.com/path/to/dir/", REGX));
        assertTrue(RgxUtils.isMatch("http://www.site.com/path/to/file.html", REGX));
        assertTrue(RgxUtils.isMatch("https://www.site.com/path/to/file.html", REGX));
        assertTrue(RgxUtils.isMatch("http://site.com/path/to/file.html", REGX));
        assertTrue(RgxUtils.isMatch("https://site.com/path/to/file.html", REGX));
        assertTrue(RgxUtils.isMatch("http://domain.site.com/path/to/file.html", REGX));
        assertTrue(RgxUtils.isMatch("https://domain.site.com/path/to/file.html", REGX));
        assertTrue(RgxUtils.isMatch("http://www.domain.site.com/path/to/file.html", REGX));
        assertTrue(RgxUtils.isMatch("https://www.domain.domain.site.com/path/to/file.html", REGX));
        assertTrue(RgxUtils.isMatch("site.com/path/to/file.html", REGX));
        assertTrue(RgxUtils.isMatch("domain.site.com/path/to/file.html", REGX));


        //assertTrue(RgxUtils.isMatch("https://secured.com:443", REGX));
        //assertTrue(RgxUtils.isMatch("ftp://ftp.bogus.com/~some/path/to/a/file.txt", REGX));
        //assertTrue(RgxUtils.isMatch("", REGX));


        assertFalse(RgxUtils.isMatch("fb.", REGX));
        assertFalse(RgxUtils.isMatch("www.", REGX));
        assertFalse(RgxUtils.isMatch("ww.", REGX));
        assertFalse(RgxUtils.isMatch(".ww", REGX));
        assertFalse(RgxUtils.isMatch(" fb.com", REGX));


        assertFalse(RgxUtils.isMatch("http://", REGX));
        assertFalse(RgxUtils.isMatch("http://.", REGX));
        assertFalse(RgxUtils.isMatch("http://..", REGX));
        assertFalse(RgxUtils.isMatch("http://../", REGX));
        assertFalse(RgxUtils.isMatch("http://?", REGX));
        assertFalse(RgxUtils.isMatch("http://??", REGX));
        assertFalse(RgxUtils.isMatch("http://??/", REGX));
        assertFalse(RgxUtils.isMatch("http://#", REGX));
        assertFalse(RgxUtils.isMatch("http://##", REGX));
        assertFalse(RgxUtils.isMatch("http://##/", REGX));
        assertFalse(RgxUtils.isMatch("http://foo.bar?q=Spaces should be encoded", REGX));
        assertFalse(RgxUtils.isMatch("//", REGX));
        assertFalse(RgxUtils.isMatch("//a", REGX));
        assertFalse(RgxUtils.isMatch("///a", REGX));
        assertFalse(RgxUtils.isMatch("///", REGX));
        assertFalse(RgxUtils.isMatch("http:///a", REGX));
        assertFalse(RgxUtils.isMatch("rdar://1234", REGX));
        assertFalse(RgxUtils.isMatch("h://test", REGX));
        assertFalse(RgxUtils.isMatch("http:// shouldfail.com", REGX));
        assertFalse(RgxUtils.isMatch(":// should fail", REGX));
        assertFalse(RgxUtils.isMatch("http://foo.bar/foo(bar)baz quux", REGX));
        assertFalse(RgxUtils.isMatch("ftps://foo.bar/", REGX));
        assertFalse(RgxUtils.isMatch("http://-error-.invalid/", REGX));
        assertFalse(RgxUtils.isMatch("http://a.b--c.de/", REGX));
        assertFalse(RgxUtils.isMatch("http://-a.b.co", REGX));
        assertFalse(RgxUtils.isMatch("http://a.b-.co", REGX));
        assertFalse(RgxUtils.isMatch("http://0.0.0.0", REGX));
        assertFalse(RgxUtils.isMatch("http://10.1.1.0", REGX));
        assertFalse(RgxUtils.isMatch("http://10.1.1.255", REGX));
        assertFalse(RgxUtils.isMatch("http://224.1.1.1", REGX));
        assertFalse(RgxUtils.isMatch("http://1.1.1.1.1", REGX));
        assertFalse(RgxUtils.isMatch("http://123.123.123", REGX));
        assertFalse(RgxUtils.isMatch("http://3628126748", REGX));
        assertFalse(RgxUtils.isMatch("http://.www.foo.bar/", REGX));
        assertFalse(RgxUtils.isMatch("http://www.foo.bar./", REGX));
        assertFalse(RgxUtils.isMatch("http://.www.foo.bar./", REGX));
        assertFalse(RgxUtils.isMatch("http://10.1.1.1", REGX));
        assertFalse(RgxUtils.isMatch("http://10.1.1.254", REGX));


    }

    @Test
    public void testRegxUrlSimple() {

        String REGX = RgxUtils.RGX_URL_SIMPLE;

        assertTrue(RgxUtils.isMatch("http://www.google.com", REGX));
        assertTrue(RgxUtils.isMatch("www.facebook.com", REGX));
        assertTrue(RgxUtils.isMatch("www.fb.com", REGX));
        //assertTrue(RgxUtils.isMatch("ftp://ftp.bogus.com/~some/path/to/a/file.txt", RgxUtils.RGX_URL_NO_FTP));

        assertTrue(RgxUtils.isMatch("http://www.site.com", REGX));
        assertTrue(RgxUtils.isMatch("https://www.site.com", REGX));
        assertTrue(RgxUtils.isMatch("http://site.com", REGX));
        assertTrue(RgxUtils.isMatch("https://site.com", REGX));
        assertTrue(RgxUtils.isMatch("http://domain.site.com", REGX));
        assertTrue(RgxUtils.isMatch("https://domain.site.com", REGX));
        assertTrue(RgxUtils.isMatch("http://www.domain.site.com", REGX));
        assertTrue(RgxUtils.isMatch("https://www.domain.site.com", REGX));
        assertTrue(RgxUtils.isMatch("site.com", REGX));


        assertFalse(RgxUtils.isMatch("fb.", REGX));
        assertFalse(RgxUtils.isMatch("www.", REGX));
        assertFalse(RgxUtils.isMatch("ww.", REGX));
        assertFalse(RgxUtils.isMatch(".ww", REGX));
        assertFalse(RgxUtils.isMatch(" fb.com", REGX));


    }


    @Test
    public void testRegxTime24h() {

        String REGX = RgxUtils.RGX_TIME_24H;

        //http://www.mkyong.com/regular-expressions/how-to-validate-time-in-24-hours-format-with-regular-expression/

        assertTrue(RgxUtils.isMatch("01:00", REGX));
        assertTrue(RgxUtils.isMatch("02:00", REGX));
        assertTrue(RgxUtils.isMatch("13:00", REGX));
        assertTrue(RgxUtils.isMatch("13:01", REGX));
        //assertTrue(RgxUtils.isMatch("1:00", REGX));
        assertTrue(RgxUtils.isMatch("23:59", REGX));
        assertTrue(RgxUtils.isMatch("15:00", REGX));
        assertTrue(RgxUtils.isMatch("00:00", REGX));


        assertFalse(RgxUtils.isMatch("24:00", REGX));
        assertFalse(RgxUtils.isMatch("12:60", REGX));
        assertFalse(RgxUtils.isMatch("0:0", REGX));
        assertFalse(RgxUtils.isMatch("13:1", REGX));
        assertFalse(RgxUtils.isMatch("101:00", REGX));
        assertFalse(RgxUtils.isMatch("0800", REGX));


    }


    @Test
    public void testRegxNumber() {


        //reg num
        assertTrue(RgxUtils.isMatch("2", RgxUtils.RGX_NUM));
        assertTrue(RgxUtils.isMatch("-2", RgxUtils.RGX_NUM));
        assertTrue(RgxUtils.isMatch("+2", RgxUtils.RGX_NUM));
        assertTrue(RgxUtils.isMatch("2.5", RgxUtils.RGX_NUM));
        assertTrue(RgxUtils.isMatch("0.5", RgxUtils.RGX_NUM));
        assertTrue(RgxUtils.isMatch("0.0", RgxUtils.RGX_NUM));


        //assertFalse(RgxUtils.isMatch("5.", RgxUtils.RGX_NUM));
        assertFalse(RgxUtils.isMatch("2..5", RgxUtils.RGX_NUM));
        assertFalse(RgxUtils.isMatch("..5", RgxUtils.RGX_NUM));


        //reg neg num
        assertTrue(RgxUtils.isMatch("2", RgxUtils.RGX_POS_NUM));
        assertTrue(RgxUtils.isMatch("+2", RgxUtils.RGX_POS_NUM));
        assertTrue(RgxUtils.isMatch("2.5", RgxUtils.RGX_POS_NUM));
        assertTrue(RgxUtils.isMatch("+2.5", RgxUtils.RGX_POS_NUM));
        assertTrue(RgxUtils.isMatch("0.5", RgxUtils.RGX_POS_NUM));
        assertTrue(RgxUtils.isMatch("0.0", RgxUtils.RGX_POS_NUM));
        assertTrue(RgxUtils.isMatch("0", RgxUtils.RGX_POS_NUM));


        //assertFalse(RgxUtils.isMatch("2+", RgxUtils.RGX_POS_NUM));
        assertFalse(RgxUtils.isMatch("2++", RgxUtils.RGX_POS_NUM));
        assertFalse(RgxUtils.isMatch("++2", RgxUtils.RGX_POS_NUM));
        assertFalse(RgxUtils.isMatch("-2.5", RgxUtils.RGX_POS_NUM));
        assertFalse(RgxUtils.isMatch("-0", RgxUtils.RGX_POS_NUM));


        //reg neg num
        assertTrue(RgxUtils.isMatch("-2", RgxUtils.RGX_NEG_NUM));
        assertTrue(RgxUtils.isMatch("-2.5", RgxUtils.RGX_NEG_NUM));
        assertTrue(RgxUtils.isMatch("-0.5", RgxUtils.RGX_NEG_NUM));
        assertTrue(RgxUtils.isMatch("-0.0", RgxUtils.RGX_NEG_NUM));


        assertFalse(RgxUtils.isMatch("+2", RgxUtils.RGX_NEG_NUM));
        assertFalse(RgxUtils.isMatch("++2", RgxUtils.RGX_NEG_NUM));
        assertFalse(RgxUtils.isMatch("2.5", RgxUtils.RGX_NEG_NUM));
        assertFalse(RgxUtils.isMatch("0", RgxUtils.RGX_NEG_NUM));


    }

    @Test
    public void testRegxInt() {

        //int
        assertTrue(RgxUtils.isMatch("2", RgxUtils.RGX_INT));
        assertTrue(RgxUtils.isMatch("+2", RgxUtils.RGX_INT));
        assertTrue(RgxUtils.isMatch("-2", RgxUtils.RGX_INT));
        assertTrue(RgxUtils.isMatch("22", RgxUtils.RGX_INT));
        assertTrue(RgxUtils.isMatch("0", RgxUtils.RGX_INT));

        assertFalse(RgxUtils.isMatch("++2", RgxUtils.RGX_INT));
        assertFalse(RgxUtils.isMatch("2+", RgxUtils.RGX_INT));
        assertFalse(RgxUtils.isMatch("2.5", RgxUtils.RGX_INT));
        assertFalse(RgxUtils.isMatch(".5", RgxUtils.RGX_INT));
        assertFalse(RgxUtils.isMatch("-0", RgxUtils.RGX_INT));


        //pos int
        assertTrue(RgxUtils.isMatch("2", RgxUtils.RGX_POS_INT));
        assertTrue(RgxUtils.isMatch("22", RgxUtils.RGX_POS_INT));
        assertTrue(RgxUtils.isMatch("+2", RgxUtils.RGX_POS_INT));
        assertTrue(RgxUtils.isMatch("0", RgxUtils.RGX_POS_INT));

        assertFalse(RgxUtils.isMatch("-2", RgxUtils.RGX_POS_INT));
        assertFalse(RgxUtils.isMatch("++2", RgxUtils.RGX_POS_INT));
        assertFalse(RgxUtils.isMatch("2+", RgxUtils.RGX_POS_INT));
        assertFalse(RgxUtils.isMatch("-0", RgxUtils.RGX_POS_INT));


        //neg int
        assertTrue(RgxUtils.isMatch("-2", RgxUtils.RGX_NEG_INT));

        assertFalse(RgxUtils.isMatch("+2", RgxUtils.RGX_NEG_INT));
        assertFalse(RgxUtils.isMatch("--2", RgxUtils.RGX_NEG_INT));
        assertFalse(RgxUtils.isMatch("2", RgxUtils.RGX_NEG_INT));
        assertFalse(RgxUtils.isMatch("2-", RgxUtils.RGX_NEG_INT));
        assertFalse(RgxUtils.isMatch("-0", RgxUtils.RGX_NEG_INT));


    }


}
