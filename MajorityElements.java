import java.util.ArrayList;
import java.util.List;

public class MajorityElements {

    public static List<Integer> majorityElements(int[] nums) {
        List<Integer> result = new ArrayList<>();

        if (nums == null || nums.length == 0) {
            return result;
        }

        int candidate1 = 0, candidate2 = 0, count1 = 0, count2 = 0;

        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            }
        }

        if (count1 > nums.length / 3) {
            result.add(candidate1);
        }
        if (count2 > nums.length / 3) {
            result.add(candidate2);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2,3};
        List<Integer> result = majorityElements(nums);

        System.out.println("Elements appearing more than n/3 times: " + result);
    }
}
