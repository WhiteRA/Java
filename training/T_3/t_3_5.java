package T_3;

import java.util.ArrayList;
import java.util.Arrays;

public class t_3_5 {
    public ArrayList<ArrayList<Integer>> permutations(int[] nums) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        if (nums.length == 0) {
            result.add(new ArrayList<>());
            return result;
        }

        int first = nums[0];
        int[] rest = Arrays.copyOfRange(nums, 1, nums.length);

        ArrayList<ArrayList<Integer>> permutations = permutations(rest);

        for (ArrayList<Integer> permutation : permutations) {
            for (int i = 0; i <= permutation.size(); i++) {
                ArrayList<Integer> temp = new ArrayList<>(permutation);
                temp.add(i, first);
                result.add(temp);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        t_3_5 p = new t_3_5();
        ArrayList<ArrayList<Integer>> result = p.permutations(nums);
        System.out.println(result);
    }
}