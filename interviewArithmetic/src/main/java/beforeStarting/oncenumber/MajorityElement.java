package beforeStarting.oncenumber;

import java.util.HashMap;

/**
 * 多数元素
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
 * <p>
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 * @author 86185
 */
public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        System.out.println(majorityElement2(nums));
    }

    /**
     * 尝试设计时间复杂度为 O(n)、空间复杂度为 O(1) 的算法解决此问题。
     *
     * @param nums
     * @return
     */
    public static int majorityElement(int[] nums) {

        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();

        for (int num : nums) {
            if (integerIntegerHashMap.get(num) == null) {
                integerIntegerHashMap.put(num, 0);
            }
            Integer integer = integerIntegerHashMap.get(num);
            ++integer;
            integerIntegerHashMap.put(num, integer);
        }

        int result = 0;
        for (Integer integer : integerIntegerHashMap.keySet()) {
            Integer integer1 = integerIntegerHashMap.get(integer);
            if (integer1 > nums.length / 2) {
                result = integer;
            }
        }
        return result;
    }

    /**
     * 摩尔投票法
     * @param nums
     * @return
     */
    public static int majorityElement2(int[] nums) {
        int count = 1;

        int major = nums[0];
        for (int i = 1; i < nums.length; i++) {

            if (count == 0){
                count++;
                major = nums[i];
            }else if (major == nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return major;
    }
}
