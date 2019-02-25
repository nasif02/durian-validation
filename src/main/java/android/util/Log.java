package android.util;

public class Log {

    private static final String TAG_POSTFIX = " xxx";
    //private static final String TAG = Log.class.getSimpleName() + " " + TAG_POSTFIX;

    public static void d(String tag, String msg) {
        System.out.println(tag + " : " + msg);
    }

    public static void e(String tag, String msg) {
        System.err.println(tag + " : " + msg);
    }

    /**
     * Method to get dynamic TAG from class name
     *
     * @param className current class name. use context.getClass().getSimpleName()
     * @return TAG
     */
    public static String getTag(String className) {
        return className + TAG_POSTFIX;
    }

}
