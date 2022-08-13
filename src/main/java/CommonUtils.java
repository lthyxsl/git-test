import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class CommonUtils {

    public static String macFormat(String mac) {
        return mac.replaceAll(" ", "")
                .replaceAll("-", "")
                .replaceAll(":", "")
                .toLowerCase(Locale.US);
    }

    public static List<String> initData(String mac) {
        return Arrays.asList("Hello", "World", "Java");
    }

}
