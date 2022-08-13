import java.util.Locale;

public class CommonUtils {

    public static String macFormat(String mac) {
        return mac.replaceAll(" ", "")
                .replaceAll("-", "")
                .replaceAll(":", "")
                .toLowerCase(Locale.US);
    }

}
