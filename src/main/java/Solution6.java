import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution6 {

    static List<List<Integer>> res = new ArrayList<>();

    public static void main(String[] args) {
        int[] arr = new int[9];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
        }

        dfs(arr, new ArrayList<>());
        for (List<Integer> re : res) {
            for (Integer x : re) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

    }

    private static boolean judge(List<Integer> data) {
        return valid(data);
    }

    public static void dfs(int[] arr, List<Integer> list) {
        List<Integer> temp = new ArrayList<>(list);
        if (arr.length == list.size() && Utils.valid(temp)) {
            res.add(temp);
        }
        for (int i = 0; i < arr.length; i++) {
            if (temp.contains(arr[i])) {
                continue;
            }
            temp.add(arr[i]);
            dfs(arr, temp);
            temp.remove(temp.size() - 1);
        }
    }
}
