import java.util.*;

class Solution {
    public int[] twoSum(int[] x, int target) {
        int n = x.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (x[i] + x[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

public class twosum {
    public static void main(String[] args) {

        int[] x = { 2, 7, 11, 15 };
        Solution st = new Solution();
        int target = 9;
        System.out.println(Arrays.toString(st.twoSum(x, target)));
    }
}
