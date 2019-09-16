package jvalidation;

import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;

public class PhoneNoUtils {

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
     * length 11 to 13 whithout (+) sign
     *
     * @param s
     * @return boolean
     */
    public static boolean isValidPhoneNoBD(String s) {

        return RgxUtils.isMatch(s, RgxUtils.RGX_PHONE_NO_BD);
    }

    /**
     * Remove +88 from phone no
     *
     * @param s
     * @return
     */
    public static String getPhoneNoWithoutCodeBD(String s) {

        if (s.length() == 14) return s.replace("+88", "");        //+8801689773843
        if (s.length() == 13) return s.replaceFirst("88", "");

        return s;

    }

    /**
     * Check whether a phone no valid or not in KSA
     * <p>
     * length 10 to 13 whithout (+) sign
     *
     * @param s
     * @return boolean
     */
    public static boolean isValidPhoneNoKSA(String s) {

        return RgxUtils.isMatch(s, RgxUtils.RGX_PHONE_NO_KSA);
    }

    /**
     * Remove +880 from phone no
     *
     * @param s
     * @return
     */
    public static String getPhoneNoWithoutCodeKSA(String s) {

        if (s.length() == 14) return s.replace("+966", "");        //+966 058 xxx xxxx
        if (s.length() == 13) return s.replaceFirst("966", "");

        return s;

    }



    /**
     * @param s
     * @param countryCode
     * @return
     */
    public static boolean isValidPhoneNo(String s, String countryCode) {

        //NOTE: This should probably be a member variable.
        PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance();

        try {
            Phonenumber.PhoneNumber numberProto = phoneUtil.parse(s, countryCode);
            return phoneUtil.isValidNumber(numberProto);
        } catch (NumberParseException e) {
            System.err.println("NumberParseException was thrown: " + e.toString());
        }

        return false;
    }





}
