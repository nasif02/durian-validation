package jvalidation;

/**
 * Copyright 2018 (C) Xplo
 * <p>
 * Created  : 9/8/2018
 * Author   : Xplo
 * Version  : 1.0
 * Comment  : Need improvement
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValUtils {


    /**
     * Check wheather a string validate by regex
     *
     * @param s
     * @param regx
     * @return
     */
    public static boolean isValidByRegx(String s, String regx) {
        //return Pattern.compile(regx).matcher(s).matches();

        Pattern p = Pattern.compile(regx);
        Matcher m = p.matcher(s);

        return m.matches();

    }


    /**
     * Check whether a email valid or not
     *
     * @param s
     * @return boolean
     */
    public static boolean isValidEmail(String s) {

        return RgxUtils.isMatch(s, RgxUtils.RGX_EMAIL);
    }


    /**
     * Check whether a phone no valid or not
     * length 10 to 13 whithout (+) sign
     *
     * @param s
     * @return boolean
     */
    public static boolean isValidPhoneNo(String s) {

        return RgxUtils.isMatch(s, RgxUtils.RGX_PHONE_NO_INTERNATIONAL);
    }

    /**
     * Check whether a phone no valid or not in BD
     * <p>
     * length 10 to 13 whithout (+) sign
     *
     * @param s
     * @return boolean
     */
    public static boolean isValidPhoneNoBD(String s) {

        return RgxUtils.isMatch(s, RgxUtils.RGX_PHONE_NO_BD);
    }

    /**
     * Remove +880 from phone no
     *
     * @param s
     * @return
     */
    public static String getPhoneNoWithoutCodeBD(String s) {

        if (s.length() == 14) return s.replace("+880", "");        //+8801689773843

        //now 13 or 11, but we need 10 : 8801689773843, 01689773843
        if (s.length() == 13) return s.replaceFirst("880", "");
        if (s.length() == 11) return s.replaceFirst("0", "");

        return s;

    }


    /**
     * Check whether is full name valid or not
     *
     * @param s
     * @return
     */
    public static boolean isValidFullName(String s) {

        return RgxUtils.isMatch(s, RgxUtils.RGX_FULL_NAME_OR_FIRST_NAME);
    }

    /**
     * Check whether is first name valid or not
     *
     * @param s
     * @return
     */
    public static boolean isValidFirstName(String s) {

        return RgxUtils.isMatch(s, RgxUtils.RGX_FULL_NAME_OR_FIRST_NAME);
    }

    /**
     * Check whether is full name valid or not
     *
     * @param s
     * @return
     */
    public static boolean isValidLastName(String s) {

        return RgxUtils.isMatch(s, RgxUtils.RGX_LAST_NAME);
    }


    /**
     * Check whether a year is valid or not
     *
     * @param s
     * @return
     */
    public static boolean isValidYear(String s) {

        return RgxUtils.isMatch(s, RgxUtils.RGX_YEAR);
    }


    /**
     * Check whether a year is valid or not by range
     * @param year
     * @param range
     * @return
     */
    public static boolean isValidYearByRange(String year, String range) {

        return RgxUtils.isMatch(year, range);
    }


}
