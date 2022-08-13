import java.util.List;

public class Utils {

    public static boolean valid(List<Integer> data) {
        int row = data.get(0) * data.get(1) * data.get(2);
        int col = data.get(0) * data.get(3) * data.get(6);
        int cos = data.get(0) * data.get(4) * data.get(8);
        return row == col && row == cos &&
                row == data.get(3) * data.get(4) * data.get(5)
                && row == data.get(6) * data.get(7) * data.get(8)
                && col == data.get(1) * data.get(4) * data.get(7)
                && col == data.get(2) * data.get(5) * data.get(8)
                && cos == data.get(6) * data.get(4) * data.get(2);
    }

    public static Boolean getBoolean(String b) {
        return Boolean.valueOf(b);
    }
}
