import java.util.*;


public class Solution1 {

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


    public static void dfs(int[] arr, List<Integer> list) {
        List<Integer> temp = new ArrayList<>(list);
        if (arr.length == list.size() && Utils.valid(temp)) {
            res.add(temp);
        }
        for (int j : arr) {
            if (temp.contains(j)) {
                continue;
            }
            temp.add(j);
            dfs(arr, temp);
            temp.remove(temp.size() - 1);
        }
    }


    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expr = sc.nextLine();
    }
}
