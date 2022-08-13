import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution3 {

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

    public static List<List<Integer>> dfs(int[] arr, List<Integer> list) {
        List<Integer> temp = new ArrayList<>(list);
        if (arr.length == list.size() && judge(temp)) {
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
        return res;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expr = sc.nextLine();


    }
}
